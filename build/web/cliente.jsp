<%@page import="Dados.BD"%>
<%@page import="Dados.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

    Cliente client = new Cliente();
    if (request.getParameter("add") != null) {

        client.setCPF(request.getParameter("cpf"));
        client.setEmail(request.getParameter("email"));
        client.setEndereco(request.getParameter("end"));
        client.setNome(request.getParameter("nome"));
        client.setRG(request.getParameter("rg"));
        client.setTelefone(request.getParameter("telefone"));
        BD.getClientes().add(client);
        response.sendRedirect(request.getRequestURI());
    }
    if (request.getParameter("del") != null) {
        int i = Integer.parseInt(request.getParameter("id"));
        BD.getClientes().remove(i);
        response.sendRedirect(request.getRequestURI());
    }

    if (request.getParameter("alt") != null) {
        int i = Integer.parseInt(request.getParameter("id"));
        client.setCPF(request.getParameter("cpf"));
        client.setEmail(request.getParameter("email"));
        client.setEndereco(request.getParameter("end"));
        client.setNome(request.getParameter("nome"));
        client.setRG(request.getParameter("rg"));
        client.setTelefone(request.getParameter("telefone"));
        BD.getClientes().set(i, client);

        response.sendRedirect(request.getRequestURI());

    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Cliente</title>
        <%@include file="WEB-INF/jspf/header.jspf" %>

    </head>
    <body>
        <%@include file="WEB-INF/jspf/menu.jspf" %>
        <div class="container">
            <h1>Cadastro de Clientes</h1>
            <fieldset>
                <legend>Adicionar Clientes</legend>
                <form>
                    Nome:<br/><input type="text" name ="nome"/> <br/>
                    RG:<br/><input type="text" name ="rg"/> <br/>
                    CPF:<br/><input type="text" name ="cpf"/> <br/>
                    Email:<br/><input type="text" name ="email"/> <br/>
                    Telefone:<br/><input type="text" name ="telefone"/> <br/>
                    Endereço:<br/><input type="text" name ="end"/> <br/>
                    <br/><input type="submit" name="add" value="adicionar"/>

                </form>
            </fieldset>
        </div>
        <hr/>
    <center>
        <div class="container">
            <table class="table" border="1">    
                <tr>
                    <th> Indice </th>
                    <th> Nome </th>
                    <th> RG </th>
                    <th> CPF </th>
                    <th> Email </th>  
                    <th> Telefone </th>
                    <th> Endereço </th>
                    <th> Excluir/Alterar </th>
                </tr> 

                <%for (int i = 0; i < BD.getClientes().size(); i++) {%>
                <tr> 
                    <td><%= i%></td>
                    <td><%= BD.getClientes().get(i).getNome()%></td>
                    <td><%= BD.getClientes().get(i).getRG()%></td>
                    <td><%= BD.getClientes().get(i).getCPF()%></td>
                    <td><%= BD.getClientes().get(i).getEmail()%></td>
                    <td><%= BD.getClientes().get(i).getTelefone()%></td>
                    <td><%= BD.getClientes().get(i).getEndereco()%></td>
                    <td>
                        <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">
                            Expandir  </button><br>
                        <form class="collapse" id="collapseExample">

                            <input type="hidden" name="id" value="<%= i%>">
                            Nome:<br/><input type="text" name ="nome" value="<%= BD.getClientes().get(i).getNome()%>" /> <br/>
                            RG:<br/><input type="text" name ="rg" value="<%=BD.getClientes().get(i).getRG()%>"/> <br/>
                            CPF:<br/><input type="text" name ="cpf"value="<%=BD.getClientes().get(i).getCPF()%>"/> <br/>
                            Email:<br/><input type="text" name ="email" value="<%= BD.getClientes().get(i).getEmail()%>"/> <br/>
                            Telefone:<br/><input type="text" name ="telefone" value="<%= BD.getClientes().get(i).getTelefone()%>"/> <br/>
                            Endereço:<br/><input type="text" name ="end" value="<%= BD.getClientes().get(i).getEndereco()%>"/> <br/>
                            <input type="submit" name="del" value="Excluir" >
                            <input type="submit" name="alt" value="Alterar ">
                        </form>
                        `
                    </td>


                </tr>
                <% }%>

            </table>
        </div>
    </center>
</body>
<%@include file="WEB-INF/jspf/footer.jspf" %>

</html>
