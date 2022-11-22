<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Locatarios</title>
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
  <h3>Locatarios: ${listagem.size()}</h3>
  <h4><a href="/locatario">Novo locatario</a></h4>
  
  <table class="table table-striped">
    <thead>
      <tr>
      	<th>ID</th>
        <th>Nome</th>
        <th>CPF</th>
        <th>Telefone</th>
        <th></th>
      </tr>
    </thead>
    <tbody>
    	<c:forEach var="locatario" items="${listagem}">
      <tr>
        <td>${locatario.id}</td>
        <td>${locatario.nome}</td>
        <td>${locatario.cpf}</td>
        <td>${locatario.telefone}</td>
        <td><a href="/locatario/${locatario.id}/excluir">excluir</a></td>
      </tr>
      </c:forEach>
    </tbody>
  </table>

</div>
</body>
</html>