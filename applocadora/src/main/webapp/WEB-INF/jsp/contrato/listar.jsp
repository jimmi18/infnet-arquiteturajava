<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Contratos</title>
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
  <h3>Contratos: ${listagem.size()}</h3>
	
  
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Valor do Contrato: </th>
        <th>Qtd de Diárias: </th>
        <th>Data: </th>
        <th>Locatario: </th>
        <th>Veiculos: </th>
      </tr>
    </thead>
    <tbody>
    	<c:forEach var="contrato" items="${listagem}">
      <tr>
        <td>${contrato.valor}</td>
        <td>${contrato.qtdDiarias}</td>
        <td>${contrato.data}</td>
        <td>${contrato.locatario}</td>
        <td>${contrato.veiculos}</td>
      </tr>
      </c:forEach>
    </tbody>
  </table>

</div>
</body>
</html>