<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Cadastro de Usuário</title>
</head>
<body>
    <%@ include file="/views/cabecalho/header-logado.jsp" %>
 	
 	<div class="container">
 		<form action="cadastro" method="post">
	 		<div class="formulario">
	 			<div class="formulario-grupo">
	 				<label>Nome*</label>
	        		<input type="text" name="nome" placeholder="">
	 			</div>
	 			<div class="formulario-grupo">
	 				<label>Sobrenome*</label>
	        		<input type="text" name="sobrenome" placeholder="">
	 			</div>
	 		</div>
	 		<div class="formulario">
	 			<div class="formulario-grupo">
	 				<label>Apelido*</label>
	        		<input type="text" name="apelido" placeholder="">
	 			</div>
	 			<div class="formulario-grupo">
	 				<label>Email*</label>
	        		<input type="email" name="email" placeholder=""S>
	 			</div>
	 		</div>
	 		<div class="formulario">
	 			<div class="formulario-grupo">
	 				<label>Senha*</label>
	       			<input type="password" id="senha" name="senha" placeholder="">
	 			</div>
	 			<div class="formulario">
	 				<label>Confirmar Senha*</label>
	        		<input type="password" id="confirmarSenha" name="confirmarSenha" placeholder="">
	 			</div>
	 		</div>
	 		<div class="buttons">
	 			<p>Já possui uma conta?<a href="${pageContext.request.contextPath}/login">Inicie uma sessão</a></p>
			
	        	<button type="submit">Enviar</button><br>
	         	<button type="reset">Limpar</button>
	 		</div>
 		</form>
 	</div>
</body>
</html>
