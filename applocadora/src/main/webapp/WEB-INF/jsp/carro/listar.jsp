<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Carros</title>
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
  <h3>Carros: ${listagem.size()}</h3>
  
  <table class="table table-striped">
    <thead>
      <tr>
      	<th>ID</th>
      	<th>Peso</th>
      	<th>Cor</th>
      	<th>Marca</th>
      	<th>Tem Seguro?</th>
        <th>Placa</th>
        <th>Modelo</th>
        <th>Tipo Câmbio</th>
        <th></th>
      </tr>
    </thead>
    <tbody>
    	<c:forEach var="carro" items="${listagem}">
      <tr>
      	<td>${carro.id}</td>
      	<td>${carro.peso}</td>
      	<td>${carro.cor}</td>
      	<td>${carro.marca}</td>
      	<td>${carro.temSeguro}</td>
        <td>${carro.placa}</td>
        <td>${carro.modelo}</td>
        <td>${carro.cambio}</td>
        <td><a href="/carro/${carro.id}/excluir">excluir</a></td>
      </tr>
      </c:forEach>
    </tbody>
  </table>

</div>
</body>
</html>