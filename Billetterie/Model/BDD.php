<?php

	Class Connection
	{
		private $_host;
		private $_user;
		private $_password;
		private $_dbname;
		private $_bdd;
		
		function __construct()
		{
			try
			{
				$this->_host='iutdoua-webetu.univ-lyon1.fr';
				$this->_user='p1405504';
				$this->_password='214176';
				$this->_dbname='p1405504';
			}
			catch (Exception $e)
			{
			   die('Erreur : '.$e->getMessage());
			}
		}
		
		public function getBDD()
		{
			return $this->_bdd;
		}
	}
?>