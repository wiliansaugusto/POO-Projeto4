<%@page import="Dados.BD"%>
<%@page import="Dados.Fornecedor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Fornecedor fornec = new Fornecedor();
    if (request.getParameter("add") != null) {
        fornec.setCNPJ(request.getParameter("cnpj"));
        fornec.setEmail(request.getParameter("email"));
        fornec.setEndereco(request.getParameter("end"));
        fornec.setNome(request.getParameter("nome"));
        fornec.setRazao(request.getParameter("razao"));
        fornec.setTelefone(request.getParameter("telefone"));
        BD.getFornecedores().add(fornec);
        response.sendRedirect(request.getRequestURI());
    }
    if (request.getParameter("del") != null) {
        int i = Integer.parseInt(request.getParameter("id"));
        BD.getFornecedores().remove(i);
        response.sendRedirect(request.getRequestURI());
    }

    if (request.getParameter("alt") != null) {
        int i = Integer.parseInt(request.getParameter("id"));
        fornec.setCNPJ(request.getParameter("cnpj"));
        fornec.setEmail(request.getParameter("email"));
        fornec.setEndereco(request.getParameter("end"));
        fornec.setNome(request.getParameter("nome"));
        fornec.setRazao(request.getParameter("razao"));
        fornec.setTelefone(request.getParameter("telefone"));
        BD.getFornecedores().set(i, fornec);
        response.sendRedirect(request.getRequestURI());
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Fornecedores</title>
        <%@include file="WEB-INF/jspf/header.jspf" %>

    </head>
    <body>
        <%@include file="WEB-INF/jspf/menu.jspf" %>
        <div class="container">
            <h1>Cadastro de Fornecedores</h1>
            <fieldset>
                <legend>Adicionar Fornecedor</legend>
                <form>
                    Nome:<br/><input type="text" name ="nome"><br>
                    Razão Social:<br/><input type="text" name ="razao"><br>
                    CNPJ:<br/><input type="text" name ="cnpj"><br>
                    Email:<br/><input type="text" name ="email"><br>
                    Telefone:<br/><input type="text" name ="telefone"><br>
                    Endereço:<br/><input type="text" name ="end"><br><br>
                    <input type="submit" name="add" value="adicionar">
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
                    <th> Razão Social </th>
                    <th> CNPJ </th>
                    <th> Email </th>  
                    <th> Telefone </th>
                    <th> Endereço </th>
                    <th> Excluir/Alterar </th>
                </tr> 

                <%for (int i = 0; i < BD.getFornecedores().size(); i++) {%>
                <tr> 
                    <td><%= i%></td>
                    <td><%= BD.getFornecedores().get(i).getNome()%></td>
                    <td><%= BD.getFornecedores().get(i).getRazao()%></td>
                    <td><%= BD.getFornecedores().get(i).getCNPJ()%></td>
                    <td><%= BD.getFornecedores().get(i).getEmail()%></td>
                    <td><%= BD.getFornecedores().get(i).getTelefone()%></td>
                    <td><%= BD.getFornecedores().get(i).getEndereco()%></td>
                    <td>
                        <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#<%=i%>" aria-expanded="false" aria-controls="<%=i%>">
                            Expandir  </button><br>
                        <form class="collapse" id="<%=i%>">
                            <input type="hidden" name="id" value="<%= i%>">
                            Nome:<br/><input type="text" name ="nome" value="<%= BD.getFornecedores().get(i).getNome()%>" /> <br/>
                            Razão Social:<br/><input type="text" name ="razao" value="<%=BD.getFornecedores().get(i).getRazao()%>"/> <br/>
                            CNPJ:<br/><input type="text" name ="cnpj" value="<%=BD.getFornecedores().get(i).getCNPJ()%>"/> <br/>
                            Email:<br/><input type="text" name ="email" value="<%= BD.getFornecedores().get(i).getEmail()%>"/> <br/>
                            Telefone:<br/><input type="text" name ="telefone" value="<%= BD.getFornecedores().get(i).getTelefone()%>"/> <br/>
                            Endereço:<br/><input type="text" name ="end" value="<%= BD.getFornecedores().get(i).getEndereco()%>"/> <br/>
                            <input type="submit" name="del" value="Excluir">
                            <input type="submit" name="alt" value="Alterar">
                        </form>
                    </td>
                </tr>
                <% }%>
            </table>
        </div>
    </center>
</body>
<%@include file="WEB-INF/jspf/footer.jspf" %>
</html>