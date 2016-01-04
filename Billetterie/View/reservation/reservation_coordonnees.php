<?php require_once("View/menu.php");?>
	<section id="contenu">
		<h2>Réservation de billets</h2>
		<h3>Coordonnées</h3>
		<span>
			<p>Nom :</p>
			<input name="name">
		</span>
		<span>
			<p>Prénom :</p>
			<input name="surname">
		</span>
		<span>
			<p>Adresse e-mail :</p>
			<input name="email">
		</span>
		<a href="index.php?page=client&action=reserver&etape=recapitulatif"><button type="submit">Valider</button></a>
	</section>
<?php require_once("View/footer.php");?>