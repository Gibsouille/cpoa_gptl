<?php require_once("../View/menu.php");?>
	<section id="contenu">
		<h2>Réservation de billets</h2>
		<h3>Récapitulatif</h3>
		<table class="table table-inverse">
			<tr>
				<td>Nombre de billets</td>
				<td>Catégorie <?php if ($parametresBillet->__get("section") != "none"){ echo " et section";}?></td>
				<td>Date</td>
				<td>Tranche horaire</td>
				<td>Promotion</td>
			</tr>
			<tr>
				<td>1</td>
				<td><?php echo $parametresBillet->__get("nomCategorie"); if ($parametresBillet->__get("section") != "none"){echo ' - ' . $parametresBillet->__get("section");}?></td>
				<td><?php echo $dateMatch ?></td>
				<td><?php echo $trancheHoraire; ?></td>
				<td><?php echo $parametresBillet->__get("nomPromotion"); ?></td>
			</tr>
		</table>
		<a href="ControllerClient.php?action=reserver&etape=confirmation"><button class="btn btn-primary" type="submit">Confirmer</button></a>
		<a href="ControllerClient.php?action=reserver&etape=refus"><button class="btn btn-primary" type="submit">Refuser</button></a>
	</section>
<?php require_once("../View/footer.php");?>