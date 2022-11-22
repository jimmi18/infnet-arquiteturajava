<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">AppLocadora</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <c:if test="${not empty user}">
      <li class="nav-item">
        <a class="nav-link active" href="/usuario/listar">Usuário</a>
      </li>
      <li class="nav-item">
        <a class="nav-link active" href="/contrato/listar">Contrato</a>
      </li>
      <li class="nav-item">
        <a class="nav-link active" href="/locatario/listar">Locatario</a>
      </li>
      <li class="nav-item">
        <a class="nav-link active" href="/veiculo/listar">Veiculo</a>
      </li>
      <li class="nav-item">
        <a class="nav-link active" href="/aviao/listar">Aviao</a>
      </li>
      <li class="nav-item">
        <a class="nav-link active" href="/carro/listar">Carro</a>
      </li>
      <li class="nav-item">
        <a class="nav-link active" href="/caminhao/listar">Caminhao</a>
      </li>
      </c:if>
    </ul>
    <ul class="nav navbar-nav navbar-right">
    	<c:if test="${empty user}">
      		<li><a href="/usuario"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      		<li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      	</c:if>
      	<c:if test="${not empty user}">
      		<li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Logout ${user.nome}</a></li>
      	</c:if>
    </ul>
  </div>
</nav>