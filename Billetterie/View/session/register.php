<?php require_once("View/menu.php");?>
	<section id="contenu">
		<table>
			<form action="index.php" method="GET">
				<table>
					<tr>
						<td>Login :</td>
						<td><input name="login"></td>
					</tr>
					<tr>
						<td>Mot de passe :</td>
						<td><input name="pass"></td>
					</tr>
					<tr>
						<td>Nom :</td>
						<td><input name="name"></td>
					</tr>
					<tr>
						<td>Adresse mail :</td>
						<td><input name="mail"></td>
					</tr>
				</table>
				<button name="registerButton" type="submit">Inscription</button>
		</form>
	</section>
<?php require_once("View/footer.php");?>