<?php
	if(isset($_GET['action']))
	{
		if ($_GET['action']=='reserver')
		{
			$title="Réservation";
			$css = "reservation.css";
			require_once("Controller/ControllerReservation.php");
		}
	}
	else
	{
		require_once("View/client.php");
	}
?>