<?php require_once("../View/menu.php");?>
	<section id="contenu">
		<h2>Réservation de billets</h2>
		<h3>Billets</h3>
		<?php
			if (isset($errorMessage))
			{
				echo '<p>' . $errorMessage . '</p>';
			}
		?>
		<p>Cochez les billets que vous voulez commander.</p>
		<form action="ControllerClient.php?action=reserver&etape=coordonnees" method="post">
			<table id ="billet"  class="table table-inverse">
				<tr>
					<td></td>
					<td>Catégorie <?php if ($parametresBillet->__get("section") != "none"){ echo " et section";}?></td>
					<td>Promotion</td>
					<td>Montant</td>
					<td>Nom</td>
					<td>Prénom</td>
				</tr>
				<tr>
					<td><label><input name="billet1" type="checkbox" checked></label></td>
					<td><?php echo $parametresBillet->__get("nomCategorie"); if ($parametresBillet->__get("section") != "none"){echo ', ' . $parametresBillet->__get("section");}?></td>
					<td><select id="nomPromotion" name="nomPromotion" onchange="setMontant()">
						<option value="<?php echo $parametresBillet->__get("typeBillet")?>"><?php echo $parametresBillet->__get("typeBillet")?></option>
						<?php 
							if ($parametresBillet->__get("typeBillet")=="Licenciés"){echo '<option value="GrandPublic">GrandPublic</option>';}
							for($i=0;$i<sizeof($parametresBillet->__get("promotion_code"));$i=$i+1)
							{
								echo '<option value="' . $parametresBillet->__get("promotion_code")[$i][0] . '">' . $parametresBillet->__get("promotion_code")[$i][0] . '</option>';
							}
						?>
						</select>
					<td id="montant" name="montantApresPromo"><?php echo $montant . '€'?></td>
					<td><input name="nom"></td>
					<td><input name="prenom"></td>
				</tr>
			</table>
			<input  class="btn btn-primary" type="button" value="Ajouter une ligne" onclick="addRow(document.getElementById('billet'));" />
			<a href="ControllerClient.php?action=reserver&etape=coordonnees"><button class="btn btn-primary" type="submit">Valider</button></a>
		</form>
		<script>
		function addRow(table)
		{
			var tr = document.createElement('tr');
			table.appendChild(tr);

			var rows = '' + document.getElementById('billet').getElementsByTagName("tr").length - 1;
			var td = document.createElement('td');
			tr.appendChild(td);
			var tdCheckBox = document.createElement('input');
			tdCheckBox.type = 'checkbox';
			td.appendChild(tdCheckBox);
			tdCheckBox.name = 'billet' + rows;
			
			tr.id = rows;
			
			var td = document.createElement('td');
			tr.appendChild(td);
			var tdText = document.createTextNode('<?php echo $parametresBillet->__get("nomCategorie"); if ($_POST["section"] != "none"){echo ' - ' . $parametresBillet->__get("section");}?>');
			td.appendChild(tdText);
			
			
			var i;
			var j = <?php echo count($parametresBillet->__get("promotion_code"));?>;
			var listePromotions = <?php echo json_encode($parametresBillet->__get("promotion_code")) ?>;
			
			var select = document.createElement('select');
			select.name = "promotion";
			select.id = "promotion";
			select.onchange = '"setMontant(' + rows + ')"';
			
			var option;
			option = document.createElement('option');
			option.value = option.textContent = 'GrandPublic';
			select.appendChild(option);
			
			for (i = 0; i < j; i++)
			{
				option = document.createElement( 'option' );
				option.value = option.textContent = listePromotions[i][0];
				select.appendChild(option);
			}
			var td = document.createElement('td');
			tr.appendChild(td);
			td.appendChild(select);
			
			<?php
				$montant = (string)$parametresBillet->__get("montantAvantPromo");
			?>
			var td = document.createElement('td');
			tr.appendChild(td);
			var tdText = document.createTextNode('<?php echo $montant;?>' + '€');
			td.appendChild(tdText);
			td.id = "montant";
			
			var td = document.createElement('td');
			tr.appendChild(td);
			var input = document.createElement("input");
			input.name = "nom";
			td.appendChild(input);
			
			var td = document.createElement('td');
			tr.appendChild(td);
			var input = document.createElement("input");
			input.name = "prenom";
			td.appendChild(input);
		}
		
	function setMontant()
	{
		var promotion = document.getElementById("nomPromotion").value;
		var listePromotions = <?php echo json_encode($parametresBillet->__get("promotion_code")) ?>;
		var montant;
		switch(promotion)
		{
			case 'PromoSolidarité':
				var i=0;
				while (listePromotions[i][0] != 'PromoSolidarité')
				{
					i++;
				}
				montant = <?php echo $parametresBillet->__get("montantAvantPromo");?> * (1 - (listePromotions[i][1] * 0.01));
				break;
			case 'Promotion':
				var i=0;
				while (listePromotions[i][0] != 'Promotion')
				{
					i++;
				}
				montant = <?php echo $parametresBillet->__get("montantAvantPromo");?> * (1 - (listePromotions[i][1] * 0.01));
				break;
			default :
				montant = <?php echo $parametresBillet->__get("montantAvantPromo");?>;
				break;
		}
		document.getElementById("montant").innerHTML = montant + "€";
	}
		</script>
	</section>
<?php require_once("../View/footer.php");?>