<?php require_once("View/menu.php");?>
	<section id="contenu">
		<h2>Réservation de billets</h2>
		<h3>Catégorie de places</h3>
		<table>
			<tr>
				<td></td>
				<td>Catégorie</td>
				<td>Places disponibles</td>
				<td>Tarif Grand Public</td>
				<td>Section</td>
			</tr>
			<tr>
				<td><label><input name="categorie" type="radio" value="rez_de_chaussee"></label></td>
				<td>Rez-de-chaussée</td>
				<td>...</td>
				<td>...</td>
				<td>...</td>
			</tr>
			<tr>
				<td><label><input name="categorie" type="radio" value="niveau_1_2"></label></td>
				<td>Niveau 1 et 2</td>
				<td>...</td>
				<td>...</td>
				<td><select name="section">
						<option value="none">--</option>
						<option value="A">A</option>
						<option value="B">B</option>
						<option value="C">C</option>
						<option value="E">E</option>
						<option value="G">G</option>
						<option value="H">H</option>
						<option value="I">I</option>
						<option value="J">J</option>
						<option value="K">K</option>
						<option value="L">L</option>
						<option value="N">N</option>
					</select></td>
			</tr>
			<tr>
				<td><label><input name="categorie" type="radio" value="niveau_3"></label></td>
				<td>Niveau 3</td>
				<td>...</td>
				<td>...</td>
				<td>...</td>
			</tr>
		</table>
		<a href="index.php?page=client&action=reserver&etape=billet"><button type="submit">Valider</button></a>
	</section>
<?php require_once("View/footer.php");?>