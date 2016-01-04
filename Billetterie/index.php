<?php
	session_start();
	require_once("Model/BDD.php");
	$connect = new Connection();
	if(isset($_GET['registerButton']))
	{
		$title="Page d'accueil";
		$css = "accueil.css";
		require_once("Model/User.php");
		$user = new User($connect, $_GET['login'], $_GET['pass'], $_GET['name'], $_GET['mail']);
		if ($_GET['login']=='' or $_GET['pass']=='')
		{
			require_once("Controller/ControllerRegister.php");
		}
		else
		{
			$user->register();
			require_once("View/accueil.php");
		}
		require_once("Controller/ControllerRegister.php");
	}
	elseif(isset($_GET['loginButton']))
	{
		$title="Page d'accueil";
		$css = "accueil.css";
		require_once("Model/User.php");
		$user = new User($connect, $_GET['login'], $_GET['pass']);
		$user->login();
		require_once("View/accueil.php");
	}
	elseif(isset($_GET['logout']))
	{
		$title="Page d'accueil";
		$css = "accueil.css";
		session_destroy();
		require_once("View/accueil.php");
	}
	elseif(!isset($_GET['page']))
	{
		$title="Page d'accueil";
		$css = "accueil.css";
		require_once("View/accueil.php");
	}
	
	else
	{
		if ($_GET['page']=='client')
		{
			$title="Client";
			$css = "client.css";
			require_once("Controller/ControllerClient.php");
		}
		elseif ($_GET['page']=='admin')
		{
			$title="Administrateur";
			$css = "admin.css";
			require_once("Controller/ControllerAdmin.php");
		}
		elseif ($_GET['page']=='login')
		{
			$title="Connexion";
			$css = "login.css";
			require_once("Controller/ControllerLogin.php");
		}
		elseif ($_GET['page']=='register')
		{
			$title="Inscription";
			$css = "register.css";
			require_once("Controller/ControllerRegister.php");
		}
		else
		{
			$title="Erreur d'URL";
			$css = "UrlError.css";
			require_once("View/UrlError.php");
		}
	}
?>