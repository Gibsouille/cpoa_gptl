<?php require_once("View/menu.php");?>
	<section id="contenu">
		<h2>Billetterie</h2>
		<span><input name="opinion" type="radio" value="licenceTrue">Je suis licencié</span>
		<span><input name="numLicence" placeholder="Exemple : 0000000A"></span>
		<span><input name="opinion" type="radio" value="licenceFalse">Je ne suis pas licencié</span>
		<a href="index.php?page=client&action=reserver&etape=match"><button type="submit">Valider</button></a>
	</section>
<?php require_once("View/footer.php");?>