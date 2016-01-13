<?php
	
	require_once("BDD.php");
	require_once("Categorie.php");

	Class CategorieCollection
	{
		private $_collection;
		private $_connect;
		private $_numMatch;
		
		function __construct($connect, $numMatch)
		{
			$this->_collection=array();
			$this->_connect=$connect;
			$this->_numMatch = $numMatch;
			$requete = 'select nomCategorie, section
						from Categorie
						where numMatch = :numMatch
						order by nomCategorie, section asc;';
			$query = $this->_connect->getBDD()->prepare($requete);
			$query ->execute(array('numMatch' => $this->_numMatch));
			while($data=$query->fetch())
			{
				$categorie = new Categorie($this->_connect, $data[0], $data[1], $numMatch);
				$categorie->findCategorie();
				$this->_collection[] = $categorie;
			}
			$query -> closeCursor();
		}
		
		public function __get($param)
		{
			switch($param)
			{
				case 'numMatch': return $this->_numMatch;
				case 'collection': return $this->_collection;
			}
		}
	}
?>