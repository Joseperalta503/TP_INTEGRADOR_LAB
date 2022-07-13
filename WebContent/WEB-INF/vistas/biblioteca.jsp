<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header>
	<ul class="lista">
		<li class="lista__contenido">Volver</li>
		<li class="lista__contenido">Administración de las bibliotecas</li>
		<li class="lista__contenido">Bienvenido ${usuarioActual}</li>
	</ul>
</header>

	<main>
<table>
  <tr>
    <th>ID</th>
    <th>Libro</th>
    <th>Fecha de Alta</th>
    <th>Estado</th>
    <th>Eliminar</th>
    <th>Actualizar</th>
  </tr>
  <tr>
    <td>example</td>
    <td>example</td>
    <td>example</td>
    <td>example</td>
    <td>Eliminar</td>
    <td>Actualizar</td>
  </tr>
  <tr>
    <td>example</td>
    <td>example</td>
    <td>example</td>
    <td>example</td>
    <td>Eliminar</td>
    <td>Actualizar</td>
  </tr>
</table>
		
	</main>
	

</body>


<style>

	header{
		background-color: #3C3F42;
		height: 40px;
				align-content: center;
	}
	.lista{
		display: flex;
		flex-direction: row;
		justify-content: space-around;
		color: white;
	}
	.lista__contenido{
		list-style-type: none;
		font-weight: bold;
	}
	
	main{
		display: flex;
		justify-content: center;
	}
	table{
		width: 500px;
	}
	td{
		align-content: center;
		text-align: center;
	}
	

</style>


</html>


