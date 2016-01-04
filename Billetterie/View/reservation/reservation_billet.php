<?php require_once("View/menu.php");?>
	<section id="contenu">
		<h2>Réservation de billets</h2>
		<h3>Billets</h3>
		<table>
			<tr>
				<td></td>
				<td>Catégorie</td>
				<td>Promotion</td>
				<td>Montant</td>
				<td>Nom</td>
				<td>Prénom</td>
			</tr>
		</table>
		<p>Rajouter une nouvelle ligne</p>
		<a href="index.php?page=client&action=reserver&etape=coordonnees"><button type="submit">Valider</button></a>
	</section>
<?php require_once("View/footer.php");?>