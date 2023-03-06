<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Clientes</h1>

<form:form action="add" modelAttribute="cliente" method="POST">

      <form:hidden path="idCliente" />
      
      Cedula 
      <form:input path="cedula" type="number" id="cedula" name="cedula" maxLegth="10" />
      <br></br>
      <br></br>
      
      Nombre
      <form:input path="nombre" type="text" id="nombre" name="nombre" maxLegth="15" />
      <br></br>
      <br></br>
       Apellido
      <form:input path="apellido" type="text" id="apellido" name="apellido" maxLegth="15" />
      <br></br>
      <br></br>
       Fecha de Nacimiento
      <form:input path="fechaNacimiento" type="date" id="fechaNacimiento" name="fechaNacimiento" />
      <br></br>
      <br></br>
       Edad
      <form:input path="edad" type="number" id="edad" name="edad" maxLegth="15" />
      <br></br>
      <br></br>
      
      Direccion
      <form:input path="direccion" type="text" id="direccion" name="direccion" maxLegth="40" />
      <br></br>
      <br></br>
      Telefono
      <form:input path="telefono" type="number" id="telefono" name="telefono" maxLegth="15" />
      <br></br>
      <br></br>
      
      Correo
      <form:input path="correo" type="mail" id="correo" name="correo" maxLegth="40" />
      <br></br>
      <br></br>
      
      <button type="submit"  id="btnGuardar">Guardar</button>
      <button type="button"  id="btnCancelar"  onClick="window.location.href='/ismac-spring-factura-web';return false";>Cancelar</button>
      
  
  </form:form>

</body>
</html>