<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alta Clientes</title>
</head>


<body>

	<header>
	<ul class="lista">
		<li class="lista__contenido"><a href="index.html">Volver</a></li>
		<li class="lista__contenido">Administración de clientes</li>
		<li class="lista__contenido">Bienvenido ${usuarioActual}</li>
		<li class="lista__contenido">Salir</li>
	</ul>
	</header>

	<main>
		<div class="contenedor-form">
        <div class="formulario">
            <h2> ALTA CLIENTE </h2>
            <form action="AgregarCliente.html" method="post">
                <label for="DNI"> DNI </label>
                <input id="DNI" type="text" name="dni">
    
                <label for="NOMBRE"> NOMBRE </label>
                <input id="NOMBRE" type="text" name="nombre">
    
                <label for="APELLIDO"> APELLIDO </label>
                <input id="APELLIDO" type="text" name="Apellido">

                <label for="NACIONALIDAD"> NACIONALIDAD </label>
                <input id="NACIONALIDAD" type="text" name="nacionalidad">

                <label for="EMAIL"> EMAIL </label>
                <input id="EMAIL" type="email" name="email">

                <label for="DIRECCION"> DIRECCION </label>
                <input id="DIRECCION" type="text" name="direccion">

                <label for="LOCALIDAD"> LOCALIDAD </label>
                <input id="LOCALIDAD" type="text" name="localidad">
                
                <label for="TELEFONO"> TELEFONO </label>
                <input id="TELEFONO" type="text" name="telefono">

                <label for="FECHANACIMIENTO"> FECHA DE NACIMIENTO </label>
                <input id="FECHANACIMIENTO" type="date" name="fechanacimiento">

				<input type="submit" value="Guardar">
            </form>
        </div>
    </div>
	</main>


</body>

<style>
/*.nav-enlace{
    display: inline-block;
    background: salmon;
    color: #fff;
    padding: 10px 30px;
    text-decoration: none;
}
.nav-enlace:hover{
    background: rgb(227, 52, 250);
}
nav{
    background: rosybrown;
    padding: 10px;
    display: flex;
    justify-content: space-evenly;
    list-style: none;
    font-size: 24px;
}
.mostrar{
    position: absolute;
    overflow: hidden;
    display: none;
}
.accion:hover .mostrar{
    display: block;
}
*/
*{
    margin: 0;
    padding: 0;
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
}
nav{
    background: salmon;
    padding: 10px;
    display: flex;
    justify-content: space-evenly;
    list-style: none;
    font-size: 24px;
}
body{
    width: 100%;
    height: 1500px;
    background-image: url(img/BibliotecaJose.jpg);
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}

.navegacion{
    width: 1000px;
    margin: 30px auto;
    background: #F3A984;
}

.navegacion ul{
    list-style: none;
}
.menu > li{
    position: relative;
    display: inline-block;
}

.menu > li > a{
    display: block;
    padding: 15px 20px;
    color: rgb(255, 255, 255);
    font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
    text-decoration: none;
}

.menu li a:hover{
    color: bisque;
    transition: all .3s;
}

.submenu{
    position: absolute;
    background: #333333;
    visibility: hidden;
    opacity: 0;
    transition: opacity 1.5s;
}

.submenu li a{
    display: block;
    padding: 15px;
    color: #fff;
    font-family: 'Open sans';
    text-decoration: none;
}

.menu li:hover .submenu{
    visibility: visible;
    opacity: 1;
}

.contenedor-form{
    background: #F3A984;
    width: 200%;
    max-width: 500px;
    margin: 48px auto;
    color: #fff;
    border-radius: 5px;
    padding: 40px;
}

.contenedor-form h2{
    margin: 0 0 28px 0;
    font-size: 20px;
    font-weight: 400;
    line-height: 1;
}

.contenedor-form input[type="text"],
.contenedor-form input[type="Email"]{
    outline: none;
    background: rgba(0,0,0,.5);
    display: block;
    width: 100%;
    padding: 10px 15px;
    color: #fff;
    border: none;
    border-radius: 2px;
    border-bottom: 4px solid #ff851b;
    font-family: Roboto;
    font-weight: normal;
    margin: 0 0 20px 0;
}

.contenedor-form input[type="submit"]{
    background: #ff851b;
    color: #fff;
    border: none;
    width: 100%;
    padding: 10px 0;
    font-weight: normal;
    font-family: Roboto;
    letter-spacing: 1px;
    font-size: 16px;
    cursor: pointer;
}

.bodys{
    background-color: 632432;
    font-family: Arial;
}
.main-container{
    margin: 150px auto;
}

table{
    background-color: white;
    text-align: left;
    width: 100px;
    margin: 0 auto;
    border-collapse: collapse;
}

th,td{
    font-size: 50px;
    padding: 20px;
}

thead{
    background-color:#F3A984;
    border-bottom: solid 5px #0f362d;
    color: rgb(255, 255, 255);
}

tr:nth-child(even){
    background-color: #ddd;
}
.color{
    color: rgb(255, 255, 255);
    text-align: center;
    background-color: #F3A984;
    width: 300px;
    margin: auto;
}

thead input {
        width: 100%;
   }
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


