<?php require_once("../View/menu.php");?>
	<section id="contenu">
		<h2>Réservation de billets</h2>
		<h3>Catégorie de places</h3>
		<?php
			if (isset($errorMessage))
			{
				echo '<p>' . $errorMessage . '</p>';
			}
		?>
		<form action="ControllerClient.php?action=reserver&etape=billet" method="post">
			<table  class="table table-inverse">
				<tr>
					<td></td>
					<td>Catégorie</td>
					<td>Places disponibles</td>
					<td>Tarif Grand Public</td>
					<td>Section</td>
				</tr>
				<tr>
					<td><label><input name="nomCategorie" type="radio" value="rezDeChaussee"></label></td>
					<td>Rez-de-chaussée</td>
					<td><?php echo $listeCategories->__get('collection')[12]->__get('nbPlacesDisponibles');?></td>
					<td>...</td>
					<td>...</td>
				</tr>
				<tr>
					<td><label><input name="nomCategorie" type="radio" value="niveau1_2"></label></td>
					<td>Niveau 1 et 2</td>
					<td id="nbPlaces"><?php echo $nbPlacesNiveau1_2 ?></td>
					<td>...</td>
					<td><select name="section" id="section" onchange="setNbPlacesDisponibles()">
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
						</select>
						
					</td>
				</tr>
				<tr>
					<td><input name="nomCategorie" type="radio" value="niveau3"></td>
					<td>Niveau 3</td>
					<td><?php echo $listeCategories->__get('collection')[11]->__get('nbPlacesDisponibles');?></td>
					<td>...</td>
					<td>...</td>
				</tr>
			</table>
			<a href="ControllerClient.php?action=reserver&etape=billet"><button class="btn btn-primary" type="submit">Valider</button></a>
		</form>
	</section>
	<script>
	function setNbPlacesDisponibles()
	{
		var section = document.getElementById("section").value;
		switch(section)
		{
			case 'A':
				var nbPlacesDisponibles = <?php echo $listeCategories->__get('collection')[0]->__get('nbPlacesDisponibles');?>;
				break;
			case 'B':
				var nbPlacesDisponibles = <?php echo $listeCategories->__get('collection')[1]->__get('nbPlacesDisponibles');?>;
				break;
			case 'C':
				var nbPlacesDisponibles = <?php echo $listeCategories->__get('collection')[2]->__get('nbPlacesDisponibles');?>;
				break;
			case 'E':
				var nbPlacesDisponibles = <?php echo $listeCategories->__get('collection')[3]->__get('nbPlacesDisponibles');?>;
				break;
			case 'G':
				var nbPlacesDisponibles = <?php echo $listeCategories->__get('collection')[4]->__get('nbPlacesDisponibles');?>;
				break;
			case 'H':
				var nbPlacesDisponibles = <?php echo $listeCategories->__get('collection')[5]->__get('nbPlacesDisponibles');?>;
				break;
			case 'I':
				var nbPlacesDisponibles = <?php echo $listeCategories->__get('collection')[6]->__get('nbPlacesDisponibles');?>;
				break;
			case 'J':
				var nbPlacesDisponibles = <?php echo $listeCategories->__get('collection')[7]->__get('nbPlacesDisponibles');?>;
				break;
			case 'K':
				var nbPlacesDisponibles = <?php echo $listeCategories->__get('collection')[8]->__get('nbPlacesDisponibles');?>;
				break;
			case 'L':
				var nbPlacesDisponibles = <?php echo $listeCategories->__get('collection')[9]->__get('nbPlacesDisponibles');?>;
				break;
			case 'N':
				var nbPlacesDisponibles = <?php echo $listeCategories->__get('collection')[10]->__get('nbPlacesDisponibles');?>;
				break;
			default:
				var nbPlacesDisponibles = <?php echo $nbPlacesNiveau1_2;?>;
		}
		document.getElementById("nbPlaces").innerHTML = nbPlacesDisponibles.toString();
	}
	</script>

<?php require_once("../View/footer.php");?>