<%@page import="Dados.BD"%>
<%@page import="Dados.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
    Cliente client = new Cliente();
  if(request.getParameter("add")!=null){
      
      client.setCPF(request.getParameter("cpf"));
      client.setEmail(request.getParameter("email"));
      client.setEndereco(request.getParameter("end"));
      client.setNome(request.getParameter("nome"));
      client.setRG(request.getParameter("rg"));
      client.setTelefone(request.getParameter("telefone"));
      BD.getClientes().add(client);
      response.sendRedirect(request.getRequestURI());
  }  
    if (request.getParameter("del")!=null){
        int i = Integer.parseInt(request.getParameter("i"));
        BD.getClientes().remove(i);
        response.sendRedirect(request.getRequestURI());
    }
    
    if (request.getParameter("alt")!=null){
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
        <title>JSP Page</title>
    </head>
    <body>
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
                Id:<input type="text"name="id" />
                <input type="submit" name="alt" value="enviar"/>
                    
               
            </form>
        </fieldset>
    <hr/>
    <table border ="1">    
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
               
        <%for (int i=0 ;i <BD.getClientes().size();i++){ %>
        <tr> 
            <td><%= i %></td>
        <td><%= BD.getClientes().get(i).getNome() %></td>
        <td><%= BD.getClientes().get(i).getRG() %></td>
        <td><%= BD.getClientes().get(i).getCPF() %></td>
        <td><%= BD.getClientes().get(i).getEmail()%></td>
        <td><%= BD.getClientes().get(i).getTelefone()%></td>
        <td><%= BD.getClientes().get(i).getEndereco() %></td>
        <td>
         <form>
             
         <input type="hidden" name="id" value="<%= i%>">
         
         <input type="submit" name="del" value="Excluir" >
         <input type="submit" name="alt" value="Alterar ">
         </form>

        </td>
        
        
        </tr>
    <% } %>

            </table>
    
    </body>
</html>
