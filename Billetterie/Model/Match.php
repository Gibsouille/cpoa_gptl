<?php

	require_once("BDD.php");
	require_once("Billet.php");
	
	Class Match
	{
		private $_numMatch;
		private $_numCourt;
		private $_typeMatch;
		private $_dateMatch;
		private $_modeJeu;
		private $_trancheHoraire;
		private $_phaseFinale;
		private $_idEquipe1;
		private $_idEquipe2;
		
		function __construct($connect, $numMatch)
		{
			$this->_connect=$connect;
			$this->_numMatch = $numMatch;
		}
		
		public function findMatch()
		{
			$requeteMatch = 'select dateMatch, trancheHoraire, modeJeu, phaseFinale
						from Matchs
						where numMatch=:numMatch;';
			$query = $this->_connect->getBDD()->prepare($requeteMatch);
			$query ->execute(array('numMatch' => $this->_numMatch));
			while($data=$query->fetch())
			{
				$this->_dateMatch = $data[0];
				$this->_trancheHoraire = $data[1];
				$this->_modeJeu = $data[2];
				$this->_phaseFinale = $data[3];
			}
			$query -> closeCursor();
		}
		
		public function __get($param)
		{
			switch($param)
			{
				case 'dateMatch': return $this->_dateMatch;
				case 'trancheHoraire': return $this->_trancheHoraire;
				case 'modeJeu': return $this->_modeJeu;
				case 'phaseFinale': return $this->_phaseFinale;
			}
		}
		
		function __toString()
		{
			return '<tr><td><input name="numMatch" type="radio" value="' . $this->_numMatch . '"></td><td>' . $this->_dateMatch . '</td><td>' . $this->_trancheHoraire . '</td><td>' . $this->_modeJeu . '</td><td>' . $this->_phaseFinale . '</td></tr>';
		}
	}
?>