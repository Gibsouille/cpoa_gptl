﻿<?php

	require_once("BDD.php");
	require_once("Categorie.php");
	require_once("Promotion.php");
	require_once("Match.php");
	require_once("Internaute.php");
	
	Class Billet
	{
		private $_categorie;
		private $_match;
		private $_internaute;
		private $_promotion;
		private $_type;
		private $_connect;
		
		function __construct($connect, $id=null, $nom=null, $prenom=null)
		{
			$this->_connect=$connect;
			if ($id!=null){$this->_id=$id;}
			if ($nom!=null){$this->_nom=$nom;}
			if ($prenom!=null){$this->_prenom=$prenom;}
		}
		
		function findActor($id_acteur)
		{
			$requete = 'select nom, prenom
						from acteurs
						where id_acteur=:id_acteur;';
			$query = $this->_connect->getBDD()->prepare($requete);
			$query ->execute(array('id_acteur' => $id_acteur));
			while($data=$query->fetch())
			{
				$this->_id = $id_acteur;
				$this->_nom = $data[0];
				$this->_prenom = $data[1];
			}
			$query -> closeCursor();
		}
		
		public function __get($param)
		{
			switch($param)
			{
				case 'id': return $this->_id;
				case 'nom': return $this->_nom;
				case 'prenom': return $this->_prenom;
			}
		}
		
		function __toString()
		{
			return '<tr><td>' . $this->_id . '</td><td>' . $this->_nom . '</td><td>' . $this->_prenom . '</td></tr>';
		}
	}
?>