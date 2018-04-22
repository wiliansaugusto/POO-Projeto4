

<%@page import= "Dados.BD" %>
<%@page import= "Dados.Fornecedor" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
     if(request.getParameter("add")!= null){
        Fornecedor c = new Fornecedor();
        c.setNome(request.getParameter("nome"));
        c.setRazao(request.getParameter("razao"));
        c.setCNPJ(request.getParameter("CNPJ"));
        c.setEmail(request.getParameter("email"));
        c.setTelefone(request.getParameter("telefone"));
        c.setEndereco(request.getParameter("endereco"));

        BD.getFornecedores().add(c);
        response.sendRedirect(request.getRequestURI());
    }
    if (request.getParameter("del")!=null){
        int i = Integer.parseInt(request.getParameter("i"));
        BD.getFornecedores().remove(i);
        response.sendRedirect(request.getRequestURI());
    }
    if (request.getParameter("alt")!=null){
        int i = Integer.parseInt(request.getParameter("i"));

        response.sendRedirect(request.getRequestURI());

    }

    %>

<html>
    <head>

        
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                        <title>Fornecedores</title>

        <%@include file="WEB-INF/jspf/header.jspf" %>

       
    </head>
    <body>
        <%@include file="WEB-INF/jspf/menu.jspf" %>

        
        <fieldset>
            <legend>Adicionar Fornencedores</legend>
            <form>
                Nome:<br/><input type="text" name ="nome"/> <br/>
                Razão:<br/><input type="text" name ="razao"/> <br/>
                CNPJ:<br/><input type="text" name ="CNPJ"/> <br/>
                Email:<br/><input type="text" name ="email"/> <br/>
                Telefone:<br/><input type="text" name ="telefone"/> <br/>
                Endereço:<br/><input type="text" name ="endereco"/> <br/>
                <br/><input type="submit" name="add" value="adicionar"/>
               
            </form>
        </fieldset>
    <hr/>
    <center><table border ="1">  
        <tr>
        <th> Indice </th>
        <th> Nome </th>
        <th> Razão </th>
        <th> CNPJ </th>
        <th> Email </th>  
        <th> Telefone </th>
        <th> Endereço </th>
    </tr> 
               
        <%for (int i=1 ;i <BD.getFornecedores().size();i++){ %>
        <tr> 
            
        <td><%= i %></td>
        
        <td><%= BD.getFornecedores().get(i).getNome() %></td>
        <td><%= BD.getFornecedores().get(i).getRazao() %></td>
        <td><%= BD.getFornecedores().get(i).getCNPJ() %></td>
        <td><%= BD.getFornecedores().get(i).getEmail()%></td>
        <td><%= BD.getFornecedores().get(i).getTelefone()%></td>
        <td><%= BD.getFornecedores().get(i).getEndereco() %></td>
        <td>
         <form>
         <input type="hidden" name="i" value="<%= i%>">
         <input type="submit" name="del" value="Excluir" >
         <input type="submit" name="alt" value="Alterar" >
         </form>

        </td>
        
        
        </tr>
    <% } %>

            </table></center> 

    </body>
            <%@include file="WEB-INF/jspf/footer.jspf" %>

</html>
