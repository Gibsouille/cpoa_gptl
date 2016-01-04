<!DOCTYPE HTML>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="Web/CSS/common.css"/>
		<link rel="stylesheet" type="text/css" href="Web/CSS/<?php echo $css?>"/>
		<meta charset="utf-8"/>
		<title>Billetterie GPTL - <?php echo $title?></title>
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