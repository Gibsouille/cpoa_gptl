<?php

	require_once("BDD.php");
	require_once("Match.php");
	
	Class Categorie
	{
		private $_nomCategorie;
		private $_section;
		private $_numMatch;
		private $_nbPlacesDisponibles;
		private $_nbPlacesTotal;
		private $_connect;
		
		function __construct($connect, $nomCategorie, $section, $numMatch)
		{
			$this->_connect=$connect;
			$this->_nomCategorie=$nomCategorie;
			$this->_section=$section;
			$this->_numMatch=$numMatch;
		}
		
		function findCategorie()
		{
			$requete = 'select nbPlacesDisponibles, nbPlacesTotal
						from Categorie
						where numMatch = :numMatch and nomCategorie = :nomCategorie and section = :section;';
			$query = $this->_connect->getBDD()->prepare($requete);
			$query ->execute(array('numMatch' => $this->_numMatch, 'nomCategorie' => $this->_nomCategorie, 'section' => $this->_section));
			while($data=$query->fetch())
			{
				$this->_nbPlacesDisponibles = $data[0];
				$this->nbPlacesTotal = $data[1];
			}
			$query -> closeCursor();
		}
		
		public function __get($param)
		{
			switch($param)
			{
				case 'nomCategorie': return $this->_nomCategorie;
				case 'section': return $this->_section;
				case 'numMatch': return $this->_numMatch;
				case 'nbPlacesDisponibles': return $this->_nbPlacesDisponibles;
				case 'nbPlacesTotal': return $this->_nbPlacesTotal;
			}
		}
	}
?>