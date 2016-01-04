<?php
	
	require_once("BDD.php");
	
	Class User
	{
		private $_userID;
		private $_login;
		private $_pass;
		private $_name;
		private $_mail;
		private $_connect;
		
		function __construct($connect, $login=null, $pass=null, $name=null, $mail=null, $userID=null)
		{
			if ($userID!=null){$this->_userID=$userID;}
			if ($login!=null){$this->_login=$login;}
			if ($pass!=null){$this->_pass=$pass;}
			if ($name!=null){$this->_name=$name;}
			if ($mail!=null){$this->_mail=$mail;}
			$this->_connect=$connect;
		}
		
		function login()
		{
			$requete = 'select UserID, login, nom, mail
						from user
						where login=:login and pass=:pass';
			$query = $this->_connect->getBDD()->prepare($requete);
			$query ->execute(array('login' => $this->_login,
									'pass' => $this->_pass));
			while($data=$query->fetch())
			{
				$_SESSION["userID"] = $data[0];
				$_SESSION["login"] = $data[1];
				$_SESSION["name"] = $data[2];
				$_SESSION["mail"] = $data[3];
			}
			$query -> closeCursor();
		}
		
		public function register()
		{
			$requete = 'insert into user (login, pass, nom, mail) values (:login, :pass, :name, :mail)';
			$query = $this->_connect->getBDD()->prepare($requete);
			$query ->execute(array('login' => $this->_login,
								   'pass' => $this->_pass,
								   'name' => $this->_name,
								   'mail' => $this->_mail));
		}
	}
?>