package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Dados.BD;
import Dados.Fornecedor;

public final class fornecedores_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/jspf/header.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/menu.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/footer.jspf");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

     if(request.getParameter("add")!= null){
        int i = Integer.parseInt(request.getParameter("i"));
        if (i < BD.getFornecedores().size()){
            BD.getFornecedores().get(i).setNome(request.getParameter("nome"));
            BD.getFornecedores().get(i).setRazao(request.getParameter("razao"));
            BD.getFornecedores().get(i).setCNPJ(request.getParameter("CNPJ"));
            BD.getFornecedores().get(i).setEmail(request.getParameter("email"));
            BD.getFornecedores().get(i).setTelefone(request.getParameter("telefone"));
            BD.getFornecedores().get(i).setEndereco(request.getParameter("endereco"));
        } else {
            Fornecedor c = new Fornecedor();
            c.setNome(request.getParameter("nome"));
            c.setRazao(request.getParameter("razao"));
            c.setCNPJ(request.getParameter("CNPJ"));
            c.setEmail(request.getParameter("email"));
            c.setTelefone(request.getParameter("telefone"));
            c.setEndereco(request.getParameter("endereco"));
            BD.getFornecedores().add(c);
        }
        response.sendRedirect(request.getRequestURI());
    }
    if (request.getParameter("del")!=null){
        int i = Integer.parseInt(request.getParameter("i"));
        BD.getFornecedores().remove(i);
        response.sendRedirect(request.getRequestURI());
    }

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Fornecedores</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/footer.css\">\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Raleway\" rel=\"stylesheet\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <h1>Controle de Cadastro</h1>\n");
      out.write("        <ul class=\"nav\">\n");
      out.write("            <li><a class=\"col-sm-3 text-center btn btn-primary\" href=\"home.jsp\">Home</a></li>\n");
      out.write("            <div class=\"col-sm-1\"></div>\n");
      out.write("            <li><a class=\"col-sm-4 text-center btn btn-primary\" href=\"clientes.jsp\">Clientes</a></li>\n");
      out.write("            <div class=\"col-sm-1\"></div>\n");
      out.write("            <li><a class=\"col-sm-3 text-center btn btn-primary\" href=\"fornecedores.jsp\">Fornecedores</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("    <hr>\n");
      out.write("</div>");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Adicionar Fornecedor</legend>\n");
      out.write("                ");
 if (request.getParameter("alt")!=null){ 
                    int i = Integer.parseInt(request.getParameter("i"));
      out.write("\n");
      out.write("                    <form>\n");
      out.write("                        Nome:<br><input type=\"text\" name=\"nome\" value=\"");
      out.print( BD.getFornecedores().get(i).getNome() );
      out.write("\"><br>\n");
      out.write("                        Razão:<br><input type=\"text\" name=\"razao\" value=\"");
      out.print( BD.getFornecedores().get(i).getRazao() );
      out.write("\"><br>\n");
      out.write("                        CNPJ:<br><input type=\"text\" name=\"CNPJ\" value=\"");
      out.print( BD.getFornecedores().get(i).getCNPJ() );
      out.write("\"><br>\n");
      out.write("                        Email:<br><input type=\"text\" name=\"email\" value=\"");
      out.print( BD.getFornecedores().get(i).getEmail() );
      out.write("\"><br>\n");
      out.write("                        Telefone:<br><input type=\"text\" name=\"telefone\" value=\"");
      out.print( BD.getFornecedores().get(i).getTelefone() );
      out.write("\"><br>\n");
      out.write("                        Endereço:<br><input type=\"text\" name=\"endereco\" value=\"");
      out.print( BD.getFornecedores().get(i).getEndereco() );
      out.write("\"><br><br>\n");
      out.write("                        <input type=\"hidden\" name=\"i\" value=\"");
      out.print( i );
      out.write("\">\n");
      out.write("                        <input type=\"submit\" name=\"add\" value=\"salvar\">\n");
      out.write("                    </form>\n");
      out.write("                ");
 } else { 
      out.write("\n");
      out.write("                    <form>\n");
      out.write("                        Nome:<br><input type=\"text\" name=\"nome\"><br>\n");
      out.write("                        Razão:<br><input type=\"text\" name=\"razao\"><br>\n");
      out.write("                        CNPJ:<br><input type=\"text\" name=\"CNPJ\"><br>\n");
      out.write("                        Email:<br><input type=\"text\" name=\"email\"><br>\n");
      out.write("                        Telefone:<br><input type=\"text\" name=\"telefone\"><br>\n");
      out.write("                        Endereço:<br><input type=\"text\" name=\"endereco\"><br><br>\n");
      out.write("                        <input type=\"submit\" name=\"add\" value=\"adicionar\">\n");
      out.write("                    </form>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </fieldset>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        <center>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <table class=\"table\" border=\"1\">  \n");
      out.write("                    <tr><th>Indice</th><th>Nome</th><th>Razão</th><th>CNPJ</th><th>Email</th><th>Telefone</th><th>Endereço</th></tr> \n");
      out.write("                    ");
<<<<<<< HEAD
for (int i = 0; i < BD.getFornecedores().size(); i++){ 
=======
for (int i = 1; i < BD.getFornecedores().size(); i++){ 
>>>>>>> origin/master
      out.write("\n");
      out.write("                        <tr> \n");
      out.write("                            <td>");
      out.print( i );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( BD.getFornecedores().get(i).getNome() );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( BD.getFornecedores().get(i).getRazao() );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( BD.getFornecedores().get(i).getCNPJ() );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( BD.getFornecedores().get(i).getEmail());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( BD.getFornecedores().get(i).getTelefone());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( BD.getFornecedores().get(i).getEndereco() );
      out.write("</td>\n");
      out.write("                            <td>\n");
      out.write("                            <form>\n");
      out.write("                                <input type=\"hidden\" name=\"i\" value=\"");
      out.print( i );
      out.write("\">\n");
      out.write("                                <input type=\"submit\" name=\"del\" value=\"Excluir\">\n");
      out.write("                                <input type=\"submit\" name=\"alt\" value=\"Alterar\">\n");
      out.write("                            </form>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("    ");
      out.write("\n");
      out.write("<footer>\n");
      out.write("    <div class=\"footer-top\"> \n");
      out.write("       <div class=\"container\">\n");
      out.write("         <div class=\"col-lg-2 col-xs-12 text-center\">\n");
      out.write("             <a href=\"https://github.com/supremesonicbrazil/POO-Projeto4\"><i class=\"fa fa-github fa-2x\"></i>Controle de Cadastros</a>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"col-lg-1 col-xs-12 text-center\"></div>\n");
      out.write("          <div class=\"col-lg-2 col-xs-12 text-center\">\n");
      out.write("             <a href=\"https://github.com/Baden286\"><i class=\"fa fa-github fa-2x\"></i>Baden Damasio</a>\n");
      out.write("         </div>\n");
      out.write("          <div class=\"col-lg-2 col-xs-12 text-center\">\n");
      out.write("             <a href=\"https://github.com/supremesonicbrazil\"><i class=\"fa fa-github fa-2x\"></i>Jean Francisco Lessa</a>\n");
      out.write("         </div>\n");
      out.write("          <div class=\"col-lg-2 col-xs-12 text-center\">\n");
      out.write("             <a href=\"https://github.com/wiliansaugusto\"><i class=\"fa fa-github fa-2x\"></i>Willians Augusto Tadeu</a>\n");
      out.write("         </div>\n");
      out.write("       </div> \n");
      out.write("    </div>  \n");
      out.write("</footer>\n");
      out.write("<div class=\"copyright text-center\"><p>Copyright © 2018 All rights reserved</p></div>");
      out.write("\n");
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
