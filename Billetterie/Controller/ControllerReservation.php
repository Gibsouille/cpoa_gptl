<?php

	require_once("../Model/BDD.php");
	require_once("../Model/MatchCollection.php");
	require_once("../Model/Match.php");
	require_once("../Model/CategorieCollection.php");

	if(isset($_GET['etape']))
	{
		if ($_GET['etape']=='match')
		{
			if (!isset($_POST["estLicencie"]))
			{
				$errorMessage = "Vous n'avez pas indiqué si vous étiez licencié ou non.";
				require_once("../View/reservation/reservation_menu.php");
			}
			else
			{
				$listeMatchs = new MatchCollection($connect);
				$parametresBillet = new ParametresBillet($connect);
				if ($_POST["estLicencie"] == "Licenciés")
				{
					if ($_POST["numLicence"] == "")
					{
						$errorMessage = "Vous n'avez pas indiqué votre numéro de licence.";
						require_once("../View/reservation/reservation_menu.php");
					}
					else
					{
						$parametresBillet->__set("typeBillet", $_POST["estLicencie"]);
						$parametresBillet->__set("numLicence", $_POST["numLicence"]);
						$_SESSION["parametresBillet"] = serialize($parametresBillet);
						$title="Réservation - Sélection d'un match";
						$css = "reservation.css";
						require_once("../View/reservation/reservation_match.php");
					}
				}
				else
				{
					$parametresBillet->__set("typeBillet", "GrandPublic");
					$_SESSION["parametresBillet"] = serialize($parametresBillet);
					$title="Réservation - Sélection d'un match";
					$css = "reservation.css";
					require_once("../View/reservation/reservation_match.php");
				}
			}
		}
		elseif ($_GET['etape']=='categorie')
		{
			if (!isset($_POST["numMatch"]))
			{
				$errorMessage = "Vous n'avez pas sélectionné de match.";
				$listeMatchs = new MatchCollection($connect);
				require_once("../View/reservation/reservation_match.php");
			}
			else
			{
				$parametresBillet = unserialize($_SESSION['parametresBillet']);
				$parametresBillet->__set("numMatch", (int)$_POST["numMatch"]);
				$listeCategories = new CategorieCollection($connect, $_POST["numMatch"]);
				$nbPlacesNiveau1_2 = 0;
				for ($i=0;$i<11;$i++)
				{
					$nbPlacesNiveau1_2 += $listeCategories->__get('collection')[$i]->__get('nbPlacesDisponibles');
				}
				$title="Réservation - Catégorie de place";
				$css = "reservation.css";
				$_SESSION["parametresBillet"] = serialize($parametresBillet);
				require_once("../View/reservation/reservation_categorie.php");
			}
		}
		elseif ($_GET['etape']=='billet')
		{
			$parametresBillet = unserialize($_SESSION['parametresBillet']);
			if (!isset($_POST["nomCategorie"]) or ($_POST["nomCategorie"] == "niveau1_2" and $_POST["section"] == "none"))
			{
				$errorMessage = "Vous n'avez pas sélectionné de catégorie.";
				$listeCategories = new CategorieCollection($connect, $parametresBillet->__get("numMatch"));
				$nbPlacesNiveau1_2 = 0;
				for ($i=0;$i<11;$i++)
				{
					$nbPlacesNiveau1_2 += $listeCategories->__get('collection')[$i]->__get('nbPlacesDisponibles');
				}
				require_once("../View/reservation/reservation_categorie.php");
			}
			else
			{
				$parametresBillet->__set("nomCategorie", $_POST["nomCategorie"]);
				$parametresBillet->__set("section", $_POST["section"]);
				$montant = $parametresBillet->getPrixAvantPromo($connect);
				$_SESSION["parametresBillet"] = serialize($parametresBillet);
				$title="Réservation - Billet";
				$css = "reservation.css";
				require_once("../View/reservation/reservation_billet.php");
			}
		}
		elseif ($_GET['etape']=='coordonnees')
		{
			$parametresBillet = unserialize($_SESSION['parametresBillet']);
			if (!isset($_POST["billet1"]) or ($_POST["nom"]=="" or $_POST["prenom"]==""))
			{
				$errorMessage = "Erreur : vous avez oublié de saisir des paramètres.";
				$montant = $parametresBillet->getPrixAvantPromo($connect);
				$title="Réservation - Billet";
				$css = "reservation.css";
				require_once("../View/reservation/reservation_billet.php");
			}
			else
			{
				$parametresBillet->__set("nomPromotion", $_POST["nomPromotion"]);
				$doc = new DomDocument;
				$parametresBillet->__set("montantApresPromo", $doc->getElementById("montant"));
				$parametresBillet->__set("nom", $_POST["nom"]);
				$parametresBillet->__set("prenom", $_POST["prenom"]);
				$_SESSION["parametresBillet"] = serialize($parametresBillet);
				$title="Réservation - Coordonnées";
				$css = "reservation.css";
				require_once("../View/reservation/reservation_coordonnees.php");
			}
		}
		elseif ($_GET['etape']=='recapitulatif')
		{
			$parametresBillet = unserialize($_SESSION['parametresBillet']);
			if ($_POST["billet1"]="" or $_POST["nomClient"]=="" or $_POST["prenomClient"]=="" or $_POST["emailClient"]=="")
			{
				$errorMessage = "Erreur : vous avez oublié de saisir des paramètres.";
				$title="Réservation - Coordonnées";
				$css = "reservation.css";
				require_once("../View/reservation/reservation_coordonnees.php");
			}
			else
			{
				$parametresBillet->__set("nomClient", $_POST["nomClient"]);
				$parametresBillet->__set("prenomClient", $_POST["prenomClient"]);
				$parametresBillet->__set("emailClient", $_POST["emailClient"]);
				$match = new Match($connect, $parametresBillet->__get("numMatch"));
				$match->findMatch();
				$dateMatch=$match->__get("dateMatch");
				$trancheHoraire=$match->__get("trancheHoraire");
				$_SESSION["parametresBillet"] = serialize($parametresBillet);
				$title="Réservation - Confirmation";
				$css = "reservation.css";
				require_once("../View/reservation/reservation_recapitulatif.php");
			}
		}
		elseif ($_GET['etape']=='confirmation')
		{
			$parametresBillet = unserialize($_SESSION['parametresBillet']);
			$parametresBillet->storeBillet($connect);
			$title="Réservation - Confirmation";
			$css = "reservation.css";
			require_once("../View/reservation/reservation_confirmation.php");
		}
		elseif ($_GET['etape']=='refus')
		{
			$title="Réservation - Annulation";
			$css = "reservation.css";
			require_once("../View/reservation/reservation_refus.php");
		}
		else
		{
			require_once("../View/UrlError.php");
		}
	}
	else
	{
		$title="Réservation - Accueil";
		$css = "reservation.css";
		require_once("../View/reservation/reservation_menu.php");
	}
?>