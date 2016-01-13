<?php require_once("../View/menu.php");?>
	<section id="contenu">
		<h2>Réservation de billets</h2>
		<h3>Coordonnées</h3>
		<?php
			if (isset($errorMessage))
			{
				echo '<p>' . $errorMessage . '</p>';
			}
		?>
		<form action="ControllerClient.php?action=reserver&etape=recapitulatif" method="post">
			<span>
				<label class = "inputNames">Nom :</label>
				<input name="nomClient"  class = "input">
			</span>
			<span>
				<label class = "inputNames">Prénom :</label>
				<input name="prenomClient"  class = "input">
			</span>
			<span>
				<label class = "inputNames">Adresse e-mail :</label>
				<input name="emailClient" class = "input">
			</span>
			<a href="ControllerClient.php?action=reserver&etape=recapitulatif"><button class="btn btn-primary" type="submit">Valider</button></a>
		</form>
	</section>
<?php require_once("../View/footer.php");?>