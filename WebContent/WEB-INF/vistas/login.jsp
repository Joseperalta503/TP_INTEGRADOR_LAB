<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

	<h1>ADMINISTRACIÓN</h1>

	<div class="formulario">
		<form method="get" action="index.html">
			Ingrese su usuario: <input type="text" name="txtUsuario">
			Ingrese su contraseña: <input type="password" name="txtContrasenia">
			<input type="submit" value="Logearse">
		</form>
	</div>

</body>


<style>
	body{
		display: flex;
		flex-direction: column;
		justify-content: center;
		text-align: center;
	}
	.formulario{
		align-content: center;
		display: flex;
		justify-content: center;
	}
	form{
		display: flex;
		flex-direction: column;
		justify-content: center;
		width: 150px;
	}
	input{
		margin: 5px;
	}
</style>


</html>


