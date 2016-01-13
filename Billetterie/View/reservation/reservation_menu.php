<?php require_once("../View/menu.php");?>
	<section id="contenu">
		<h2>Billetterie</h2>
		<?php
			if (isset($errorMessage))
			{
				echo '<p>' . $errorMessage . '</p>';
			}
		?>
		<form action="ControllerClient.php?action=reserver&etape=match" method="post">
			<span><input name="estLicencie" type="radio" value="Licenciés">Je suis licencié</span>
			<span><input class = "input2" name="numLicence" placeholder="Exemple : 0000000A"></span>
			<span><input name="estLicencie" type="radio" value="GrandPublic">Je ne suis pas licencié</span>
			<a href="ControllerClient.php?action=reserver&etape=match"><button class="btn btn-primary" type="submit">Valider</button></a>
		</form>
	</section>
<?php require_once("../View/footer.php");?>