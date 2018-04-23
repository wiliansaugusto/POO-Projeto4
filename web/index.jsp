<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<script src="js/jquery-3.3.1.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
        <title>Home</title>
        <%@include file="WEB-INF/jspf/header.jspf" %>
    </head>
    <body>
        <div class="container">
            <h1 class="text-center">POO - Projeto 04 - Home</h1>
            <h2 class="text-center">Bem-vindo</h2>
            <p class="text-center">Este projeto simula um cadastro de clientes e fornecedores, utilizando-se de páginas JSP e classes Java para simular um banco de dados na memória.</p>
            <hr>
            <div class="row">
                <div class="col-sm-5 card" style="width: 18rem;">
                    <div class="card-body">
                        <h3 class="text-center card-title">Cadastro de Clientes</h3>
                        <p class="text-center card-text">Ir para a página de cadastro e gerenciamento de clientes.</p>
                        <a class="col-sm-12 text-center btn btn-primary" href="clientes.jsp">Gerenciar Clientes</a>
                    </div>
                </div>
                <div class="col-sm-2"></div>
                <div class="col-sm-5 card" style="width: 18rem;">
                    <div class="card-body">
                        <h3 class="text-center card-title">Cadastro de Fornecedores</h3>
                        <p class="text-center card-text">Ir para a página de cadastro e gerenciamento de fornecedores.</p>
                        <a class="col-sm-12 text-center btn btn-primary" href="fornecedores.jsp">Gerenciar Fornecedores</a>
                    </div>
                </div>
            </div>
            <br><br>
        </div>
    </body>
    <%@include file="WEB-INF/jspf/footer.jspf" %>
</html>
