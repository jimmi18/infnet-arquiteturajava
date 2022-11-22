<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Caminhões</title>
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
  <h3>Caminhões: ${listagem.size()}</h3>
  
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Tipo de Caminhão: </th>
        <th>Capacidade de Carga: </th>
        <th>QTD de eixos: </th>
      </tr>
    </thead>
    <tbody>
    	<c:forEach var="caminhao" items="${listagem}">
      <tr>
        <td>${caminhao.tipoCaminhao}</td>
        <td>${caminhao.capacidadeCarga}</td>
        <td>${caminhao.qtdEixos}</td>
      </tr>
      </c:forEach>
    </tbody>
  </table>

</div>
</body>
</html>