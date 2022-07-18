<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Panel</title>
</head>

<body>
	
	<h1 class="navegacion">Bienvenido ${usuarioActual}</h1>

	<header> 
		<nav class="navegacion">
			<ul class="lista">
				<form method="get" action="Cliente.html">
					<li class="opcion"><input type="submit" value="Clientes"
						class="redireccion"> <input type="hidden"
						value="${usuarioActual}" name="usuarioActual"></li>
				</form>
				<form method="get" action="Biblioteca.html">
					<li class="opcion"><input type="submit" value="Bibliotecas"
					class="redireccion"> <input type="hidden"
					value="${usuarioActual}" name="usuarioActual"></li>
				</form>
					<form method="get" action="Nacionalidad.html">
					<li class="opcion"><input type="submit" value="Nacionalidad"
					class="redireccion"> <input type="hidden"
					value="${usuarioActual}" name="usuarioActual"></li>
				</form>
				<li class="opcion">Prestamos</li>
			</ul>
		</nav> 
	</header>
</body>

<style>
.navegacion {
	width: 1000px;
	margin: 30px auto;
	background: #F3A984;
}

.navegacion ul {
	list-style: none;
}

body {
	text-align: center;
	width: 100%;
	height: 1500px;
	background-image: url(img/BibliotecaJose.jpg);
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
}



.lista {
	display: flex;
	flex-direction: row;
	justify-content: space-around;
}

.opcion {
	list-style-type: none;
	font-weight: bold;
}

.redireccion {
	background-color: transparent;
	border-style: none;
	text-decoration-line: underline;
	color: black;
}

.redireccion:hover {
	cursor: pointer;
}
</style>

</html>


