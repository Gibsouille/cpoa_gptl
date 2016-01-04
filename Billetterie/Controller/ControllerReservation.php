<?php
	require_once("Model/BDD.php");
	
	$connect = new Connection();
	
	if(isset($_GET['etape']))
	{
		if ($_GET['etape']=='match')
		{
			$title="Réservation - Sélection d'un match";
			$css = "reservation.css";
			require_once("View/reservation/reservation_match.php");
		}
		elseif ($_GET['etape']=='categorie')
		{
			$title="Réservation - Catégorie de place";
			$css = "reservation.css";
			require_once("View/reservation/reservation_categorie.php");
		}
		elseif ($_GET['etape']=='billet')
		{
			$title="Réservation - Billet";
			$css = "reservation.css";
			require_once("View/reservation/reservation_billet.php");
		}
		elseif ($_GET['etape']=='coordonnees')
		{
			$title="Réservation - Coordonnées";
			$css = "reservation.css";
			require_once("View/reservation/reservation_coordonnees.php");
		}
		elseif ($_GET['etape']=='recapitulatif')
		{
			$title="Réservation - Récapitulatif";
			$css = "reservation.css";
			require_once("View/reservation/reservation_recapitulatif.php");
		}
		elseif ($_GET['etape']=='confirmation')
		{
			$title="Réservation - Confirmation";
			$css = "reservation.css";
			require_once("View/reservation/reservation_confirmation.php");
		}
		else
		{
			require_once("View/UrlError.php");
		}
	}
	else
	{
		require_once("View/reservation/reservation_menu.php");
	}
?>