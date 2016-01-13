<?php

	require_once("BDD.php");
	require_once("Billet.php");
	
	Class ParametresBillet
	{
		private $_typeBillet;
		private $_numLicence;
		private $_numMatch;
		private $_nomCategorie;
		private $_section;
		private $_montantAvantPromo;
		private $_montantApresPromo;
		private $_promotion_code;
		private $_nomPromotion;
		private $_nom;
		private $_prenom;
		private $_nomClient;
		private $_prenomClient;
		private $_emailClient;
		
		function __construct($connect)
		{
			$this->_promotion_code = array();
			$requetePromo = 'SELECT Promotion.nomPromotion, Promotion.tauxPromotion, Code_Promotion.Code
							FROM Promotion, Code_Promotion
							WHERE Promotion.nomPromotion = Code_Promotion.nomPromotion
							AND Promotion.nbPlaces >0;';
			$query = $connect->getBDD()->prepare($requetePromo);
			$query ->execute(array());
			while($data=$query->fetch())
			{
				$this->_promotion_code[] = array($data[0], $data[1], $data[2]);
			}
			$query -> closeCursor();
		}
		
		public function getPrixAvantPromo($connect)
		{
			$requeteMontant = 'select distinct prix
							from Categorie
							where numMatch = :numMatch and nomCategorie = :nomCategorie;';
			$query = $connect->getBDD()->prepare($requeteMontant);
			$query ->execute(array('numMatch' => $this->_numMatch, 'nomCategorie' => $this->_nomCategorie));
			while($data=$query->fetch())
			{
				$this->_montantAvantPromo = $data[0];
			}
			$query -> closeCursor();
			$montant = $this->_montantAvantPromo;
			if ($this->_typeBillet == 'Licenciés')
			{
				$requetePromo = 'select tauxPromotion
							from Promotion
							where nomPromotion = :typeBillet';
				$query = $connect->getBDD()->prepare($requetePromo);
				$query ->execute(array('typeBillet' => $this->_typeBillet));
				while($data=$query->fetch())
				{
					$montant = $montant * (1 - ($data[0]*0.01));
				}
			}
			return $montant;
		}
		
		public function storeBillet($connect)
		{
			$requeteClient = "INSERT INTO Internaute (nom, prenom, email, nbBilletsReserves) values (:nom, :prenom, :email, 1);";
			$queryClient = $connect->getBDD()->prepare($requeteClient);
			$queryClient->execute(array('nom' => $this->_nomClient, 'prenom' => $this->_prenomClient, 'email' => $this->_emailClient));
			$queryClient -> closeCursor();
			
			$numClient = -1;
			$requeteNumClient = "select idInternaute from Internaute where nom = :nomClient and prenom = :prenomClient;";
			$queryNumClient = $connect->getBDD()->prepare($requeteNumClient);
			$queryNumClient->execute(array('nomClient' => $this->_nomClient, 'prenomClient' => $this->_prenomClient));
			while($data=$queryNumClient->fetch())
			{
				$numClient = $data[0];
			}
			$queryNumClient -> closeCursor();
			
			if ($this->_section == "none")
			{
				$requeteBillet = "INSERT INTO Billet (nomCategorie, nomPromotion, idInternaute, typeBillet, nom, prenom, numMatch)
								values(:nomCategorie, :nomPromotion, :idInternaute, :typeBillet, :nom, :prenom, :numMatch);";
				$queryBillet = $connect->getBDD()->prepare($requeteBillet);
				$queryBillet->execute(array('nomCategorie' => $this->_nomCategorie, 'nomPromotion' => $this->_nomPromotion, 'idInternaute' => $numClient, 'typeBillet' => $this->_typeBillet, 'nom' => $this->_nom, 'prenom' => $this->_prenom, 'numMatch' => $this->_numMatch));
				$queryBillet -> closeCursor();
			}
			else
			{
				$requeteBillet = "INSERT INTO Billet (nomCategorie, nomSection, nomPromotion, idInternaute, typeBillet, nom, prenom, numMatch)
								values(:nomCategorie, :nomSection, :nomPromotion, :idInternaute, :typeBillet, :nom, :prenom, :numMatch);";
				$queryBillet = $connect->getBDD()->prepare($requeteBillet);
				$queryBillet->execute(array('nomCategorie' => $this->_nomCategorie, 'nomSection' => $this->_section, 'nomPromotion' => $this->_nomPromotion, 'idInternaute' => $numClient, 'typeBillet' => $this->_typeBillet, 'nom' => $this->_nom, 'prenom' => $this->_prenom, 'numMatch' => $this->_numMatch));
				$queryBillet -> closeCursor();
			}
		}
		
		public function __get($param)
		{
			switch($param)
			{
				case 'typeBillet': return $this->_typeBillet;
				case 'numLicence': return $this->_numLicence;
				case 'numMatch': return $this->_numMatch;
				case 'nomCategorie': return $this->_nomCategorie;
				case 'section': return $this->_section;
				case 'montantAvantPromo': return $this->_montantAvantPromo;
				case 'montantApresPromo': return $this->_montantApresPromo;
				case 'montantNiveau_3': return $this->_montantNiveau_3;
				case 'promotion_code': return $this->_promotion_code;
				case 'rez_de_chaussee': return $this->_rez_de_chaussee;
				case 'nomPromotion': return $this->_nomPromotion;
				case 'nom': return $this->_nom;
				case 'prenom': return $this->_prenom;
				case 'nomClient': return $this->_nomClient;
				case 'prenomClient': return $this->_prenomClient;
				case 'emailClient': return $this->_emailClient;
			}
		}
		
		public function __set($name, $value)
		{
			switch($name)
			{
				case 'typeBillet': $this->_typeBillet = $value;
				case 'numLicence': $this->_numLicence = $value;
				case 'numMatch': $this->_numMatch = $value;
				case 'nomCategorie': $this->_nomCategorie = $value;
				case 'section': $this->_section = $value;
				case 'nomPromotion': $this->_nomPromotion = $value;
				case 'nom': $this->_nom = $value;
				case 'prenom': $this->_prenom = $value;
				case 'nomClient': $this->_nomClient = $value;
				case 'prenomClient': $this->_prenomClient = $value;
				case 'emailClient': $this->_emailClient = $value;
				case 'montantApresPromo': $this->_montantApresPromo = $value;
			}
		}
	}
?>