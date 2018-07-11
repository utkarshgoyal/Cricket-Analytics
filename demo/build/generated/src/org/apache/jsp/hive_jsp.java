package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class hive_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String id1;
    
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
      response.setContentType("text/html");
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
      out.write("<center>\n");
      out.write("    <h1 h1 style=\"background-color: black;color:yellow;font-size: 350%;text-align:center\">\n");
      out.write("        Top 3 scorers\n");
      out.write("    </h1>\n");
      out.write("</center>\n");
      out.write("<body background =\"w1.jpg\">\n");
      out.write("<center>\n");
      out.write("<table border =\"1\" width=\"80%\" >\n");
      out.write("    <tr>\n");
      out.write("        <th style=\"text-align:center\">Player On Strike</th>\n");
      out.write("        <th style=\"text-align:center\">Runs</th>\n");
      out.write("    </tr>\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");

        id1 = request.getParameter("n");
        session.setAttribute("n",id1);
        id1="\""+id1+"\"";
        String hql = "select pos,sum(rb) as run from ena where team ="+id1+" group by pos order by run desc limit 3";
         ResultSet rs = RCPL.hadoop.getData(hql); 
         
while(rs.next())
{
    String id = rs.getString(1);
    String name = rs.getString(2);


      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td style=\"text-align:center\">");
      out.print(id);
      out.write(" </td>\n");
      out.write("       <td style=\"text-align:center\">");
      out.print(name);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 }

      out.write("\n");
      out.write("</table>\n");
      out.write("<br>\n");
      out.write("</center>\n");
      out.write("<form action =\"index.jsp\">\n");
      out.write("    <br><br><br>\n");
      out.write("    <input type =\"submit\" value =\"back\">\n");
      out.write("    \n");
      out.write("</form>\n");
      out.write("</body>");
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
