<?php
	require_once("../Model/BDD.php");
	require_once("../Model/ParametresBillet.php");
	
	session_start();
	
	$connect =  new Connection();
	
	if(isset($_GET['action']))
	{
		if ($_GET['action']=='reserver')
		{
			$title="Réservation";
			$css = "reservation.css";
			require_once("ControllerReservation.php");
		}
		else
		{
			$title="Réservation";
			$css = "reservation.css";
			require_once("../View/UrlError.php");
		}
	}
	else
	{
		require_once("../View/client.php");
	}
?>