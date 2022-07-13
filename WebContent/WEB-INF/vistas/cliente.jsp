<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cliente here</title>
</head>

<body>

	<header>
	<ul class="lista">
		<li class="lista__contenido">Volver</li>
		<li class="lista__contenido">Administración de clientes</li>
		<li class="lista__contenido">Bienvenido ${usuarioActual}</li>
		<li class="lista__contenido">Salir</li>
	</ul>
	</header>


	<main>

	<div class="bodys">
		<form action="#">
			<table>
				<thead>
					<tr>
						<th>ID</th>
						<th>NOMBRES</th>
						<th>APELLIDOS</th>
						<th>NACIONALIDAD</th>
						<th>EMAIL</th>
						<th>DIRECCION</th>
						<th>LOCALIDAD</th>
						<th>TELEFONO</th>
						<th>FECHA NACIMIENTO</th>
						<th>Eliminar</th>
						<th>Modificar</th>
						<th>Actualizar</th>
					</tr>
				</thead>
				<tr>
					<td>1</td>
					<td>Josefina</td>
					<td>Peralta</td>
					<td>Argentina</td>
					<td>Josefina@gmail.com</td>
					<td>18 de narnia</td>
					<td>Garin</td>
					<td><input type="text" value=""></td>
					<td>29/04/2001</td>
					<td><input type="button" value="Eliminar"></td>
					<td><input type="button" value="Modificar"></td>
					<td><input type="button" value="Actualizar"></td>
				</tr>

			</table>
		</form>

	</div>

	</main>


</body>


<style>
header {
	height: 40px;
	align-content: center;
	background: salmon;
	font-size: 20px;
	padding: 15px;
}

.color {
	color: rgb(255, 255, 255);
	text-align: center;
	background-color: #F3A984;
	width: 300px;
	margin: auto;
}

body {
	width: 100%;
	height: 1500px;
	background-image: url(img/BibliotecaJose.jpg);
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
}

.bodys {
	background-color: 632432;
	font-family: Arial;
}

.lista {
	display: flex;
	flex-direction: row;
	justify-content: space-around;
	color: white;
}

.lista__contenido {
	list-style-type: none;
	font-weight: bold;
}

main {
	display: flex;
	justify-content: center;
}

table {
	width: 500px;
}

table {
	background-color: white;
	text-align: left;
	width: 100px;
	margin: 0 auto;
	border-collapse: collapse;
}

thead {
	background-color: #F3A984;
	border-bottom: solid 5px #0f362d;
	color: rgb(255, 255, 255);
}

th {
	font-size: 15px;
	padding: 20px;
	text-align: center;
}

td {
	align-content: center;
	text-align: center;
}
</style>


</html>


