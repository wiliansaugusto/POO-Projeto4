package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Dados.BD;
import Dados.Cliente;

public final class cliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    
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

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Cadastro de Clientes</h1>\n");
      out.write("        <fieldset>\n");
      out.write("            <legend>Adicionar Clientes</legend>\n");
      out.write("            <form>\n");
      out.write("                Nome:<br/><input type=\"text\" name =\"nome\"/> <br/>\n");
      out.write("                RG:<br/><input type=\"text\" name =\"rg\"/> <br/>\n");
      out.write("                CPF:<br/><input type=\"text\" name =\"cpf\"/> <br/>\n");
      out.write("                Email:<br/><input type=\"text\" name =\"email\"/> <br/>\n");
      out.write("                Telefone:<br/><input type=\"text\" name =\"telefone\"/> <br/>\n");
      out.write("                Endereço:<br/><input type=\"text\" name =\"end\"/> <br/>\n");
      out.write("                <br/><input type=\"submit\" name=\"add\" value=\"adicionar\"/>\n");
      out.write("                Id:<input type=\"text\"name=\"id\" />\n");
      out.write("                <input type=\"submit\" name=\"alt\" value=\"enviar\"/>\n");
      out.write("                    \n");
      out.write("               \n");
      out.write("            </form>\n");
      out.write("        </fieldset>\n");
      out.write("    <hr/>\n");
      out.write("    <table border =\"1\">    \n");
      out.write("    <tr>\n");
      out.write("        <th> Indice </th>\n");
      out.write("        <th> Nome </th>\n");
      out.write("        <th> RG </th>\n");
      out.write("        <th> CPF </th>\n");
      out.write("        <th> Email </th>  \n");
      out.write("        <th> Telefone </th>\n");
      out.write("        <th> Endereço </th>\n");
      out.write("        <th> Excluir/Alterar </th>\n");
      out.write("    </tr> \n");
      out.write("               \n");
      out.write("        ");
for (int i=0 ;i <BD.getClientes().size();i++){ 
      out.write("\n");
      out.write("        <tr> \n");
      out.write("            <td>");
      out.print( i );
      out.write("</td>\n");
      out.write("        <td>");
      out.print( BD.getClientes().get(i).getNome() );
      out.write("</td>\n");
      out.write("        <td>");
      out.print( BD.getClientes().get(i).getRG() );
      out.write("</td>\n");
      out.write("        <td>");
      out.print( BD.getClientes().get(i).getCPF() );
      out.write("</td>\n");
      out.write("        <td>");
      out.print( BD.getClientes().get(i).getEmail());
      out.write("</td>\n");
      out.write("        <td>");
      out.print( BD.getClientes().get(i).getTelefone());
      out.write("</td>\n");
      out.write("        <td>");
      out.print( BD.getClientes().get(i).getEndereco() );
      out.write("</td>\n");
      out.write("        <td>\n");
      out.write("         <form>\n");
      out.write("             \n");
      out.write("         <input type=\"hidden\" name=\"i\" value=\"");
      out.print( i);
      out.write("\">\n");
      out.write("         \n");
      out.write("         <input type=\"submit\" name=\"del\" value=\"Excluir\" >\n");
      out.write("         <input type=\"submit\" name=\"alt\" value=\"Alterar \">\n");
      out.write("         </form>\n");
      out.write("\n");
      out.write("        </td>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </tr>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
