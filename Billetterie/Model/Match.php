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
		
		function __construct($connect)
		{
			$this->_connect=$connect;
		}
		
		public function findMatch($numMatch)
		{
			$requete = 'select , nom_film, annee_film, score, Votes
						from films
						where id_film=:id_film;';
			$query = $this->_connect->getBDD()->prepare($requete);
			$query ->execute(array('id_film' => $id_film));
			while($data=$query->fetch())
			{
				$this->_id = $data[0];
				$this->_titre = $data[1];
				$this->_annee = $data[2];
				$this->_score = $data[3];
				$this->_vote = $data[4];
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
			return '<tr><td><input name="numMatch" type="radio" value="' . $this->_numMatch . '">Je suis licencié</span></td><td>' . $this->_dateMatch . '</td><td>' . $this->_trancheHoraire . '</td><td>' . $this->_modeJeu . '</td><td>' . $this->_phaseFinale . '</td></tr>';
		}
	}
?>