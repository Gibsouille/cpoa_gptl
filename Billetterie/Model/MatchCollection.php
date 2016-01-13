<?php
	
	require_once("BDD.php");
	require_once("Match.php");

	Class MatchCollection
		{
			private $_collection;
			private $_connect;
			
			function __construct($connect)
			{
				$this->_collection=array();
				$this->_connect=$connect;
				$requete = 'select numMatch
							from Matchs
							where typeMatch = "tournoi" order by dateMatch asc;';
				$query = $this->_connect->getBDD()->prepare($requete);
				$query ->execute(array());
				while($data=$query->fetch())
				{
					$match = new Match($this->_connect, $data[0]);
					$match->findMatch();
					$this->_collection[] = $match;
				}
				$query -> closeCursor();
			}
			
			function __toString()
			{
				$tmpString = '';
				foreach($this->_collection as $match)
				{
					$tmpString .= $match;
				}
				return $tmpString;
			}
		}
?>