<?php
	session_start();
?>

<!DOCTYPE HTML>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="Web/CSS/common.css"/>
		<link rel="stylesheet" type="text/css" href="Web/CSS/accueil.css"/>
		<meta charset="utf-8"/>
		<title>Billetterie GPTL - Accueil</title>
	</head>
	<body>
		<header>
			<h1><a href="index.php">Billetterie</a></h1>
			<?php
					if(!isset($_SESSION['login']))
					{
						echo '<section id="session_co"><p><a href="index.php?page=login">Connexion</a></p><p>|</p><p><a href="index.php?page=register">Inscription</a></p></section>';
					}
					else
					{
						echo '<section id="session_co"><p>'. $_SESSION["login"] .'</p><p>|</p><p><a href="index.php?logout=">Déconnexion</a></p></section>';
					}
			?>
		</header>
		<section id="contenu">
			<h2>Bienvenue sur la billetterie de Grand Prix Lyon 1 !</h2>
			<p><a href="Controller/ControllerClient.php">Accéder à la billetterie en tant que client.</a></p>
			<p><a href="View/UrlError.php">Accéder à la billetterie en tant que responsable des billets.</a></p>
		</section>
		<footer>
			<p>Site créé exclusivement en PHP5, HTML5 et CSS3.</p>
		</footer>
	</body>
</html>