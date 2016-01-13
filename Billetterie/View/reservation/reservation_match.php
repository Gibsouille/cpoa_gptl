<?php require_once("../View/menu.php");?>
	<section id="contenu">
		<h2>Réservation de billets</h2>
		<h3>Sélection d'un match</h3>
		<p>(Note : on peut procéder à la suite de la réservation uniquement avec le match avec la date "2017-01-22").</p>
		<?php
			if (isset($errorMessage))
			{
				echo '<p>' . $errorMessage . '</p>';
			}
		?>
		<form action="ControllerClient.php?action=reserver&etape=categorie" method="post">
			<table class="table table-inverse">
				<tr>
					<td></td>
					<td>Dates</td>
					<td>Heure du match</td>
					<td>Mode de jeu</td>
					<td>Phase finale</td>
				</tr>
				<?php echo $listeMatchs;?>
			</table>
			<a href="ControllerClient.php?action=reserver&etape=categorie"><button class="btn btn-primary" type="submit">Valider</button></a>
		</form>
	</section>
<?php require_once("../View/footer.php");?>