package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index23_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<title>\n");
      out.write("    Interactive Cricket Analytics\n");
      out.write("    \n");
      out.write("</title>\n");
      out.write("<body background = \"w12.jpg\">\n");
      out.write("   \n");
      out.write("<h1 style=\"background-color: blue;color:white;font-size: 350%;text-align:center\">\n");
      out.write("    Analytics Report\n");
      out.write("</h1>\n");
      out.write(" \n");
      out.write("<ol>\n");
      out.write("    <li>\n");
      out.write("        <form action = \"hivee5.jsp\">\n");
      out.write("             <font color =\"white\">\n");
      out.write("    NUMBER OF FOURS IN A MATCH:-  </font>\n");
      out.write("   <div>\n");
      out.write("       <input type =\"radio\" name =\"n\" value=\"211028\"/><font color = \"white\">England vs Australia</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"1093\"/><font color = \"white\">India vs Australia</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"211048\"><font color = \"white\">New Zealand vs Australia</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"1049\"><font color = \"white\">South Africa vs India</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"222678\"><font color = \"white\">South Africa vs New Zealand</font>\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("  <button type=\"submit\">Submit</button>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("        \n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        <form action = \"hivee6.jsp\">\n");
      out.write("             <font color =\"white\">\n");
      out.write("     NUMBER OF SIXES IN A A MATCH</font>\n");
      out.write("   <div>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"211028\"/><font color = \"white\">England vs Australia</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"1093\"/><font color = \"white\">India vs Australia</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"211048\"><font color = \"white\">New Zealand vs Australia</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"1049\"><font color = \"white\">South Africa vs India</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"222678\"><font color = \"white\">South Africa vs New Zealand</font>\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("  <button type=\"submit\">Submit</button>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        <form action = \"hivee.jsp\">\n");
      out.write("            <font color =\"white\">\n");
      out.write("             TOP 3 SCORES IN A TEAM </font>         \n");
      out.write("  <div>\n");
      out.write("  <input type=\"radio\" name=\"n\" value=\"India\"/><font color = \"white\">India</font>\n");
      out.write("  <input type=\"radio\" name=\"n\" value=\"Australia\"/><font color = \"white\">Australia</font>\n");
      out.write("  <input type=\"radio\" name=\"n\" value=\"New Zealand\"/><font color = \"white\">New Zealand</font>\n");
      out.write("  <input type=\"radio\" name=\"n\" value=\"South Africa\"/><font color = \"white\">South Africa</font>\n");
      out.write("  <input type=\"radio\" name=\"n\" value=\"England\"/><font color = \"white\">England</font>\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("        <button type=\"submit\">Submit</button>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("    <form action = \"hivee3.jsp\">\n");
      out.write("         <font color =\"white\">\n");
      out.write("    FIND HALF CENTURIES IN A MATCH:- </font>\n");
      out.write("   <div>\n");
      out.write("       <input type =\"radio\" name =\"n\" value=\"211028\"/><font color = \"white\">England vs Australia</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"1093\"/><font color = \"white\">India vs Australia</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"211048\"><font color = \"white\">New Zealand vs Australia</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"1049\"><font color = \"white\">South Africa vs India</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"222678\"><font color = \"white\">South Africa vs New Zealand</font>\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("  <button type=\"submit\">Submit</button>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("</form>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("    \n");
      out.write("        <form action = \"hivee2.jsp\">\n");
      out.write("             <font color =\"white\">\n");
      out.write("    TOP 3 WICKET TAKERS IN A TEAM:- </font>\n");
      out.write("    <div>\n");
      out.write("  <input type=\"radio\" name=\"n\" value=\"India\"/><font color = \"white\">India</font>\n");
      out.write("  <input type=\"radio\" name=\"n\" value=\"Australia\"/><font color = \"white\">Australia</font>\n");
      out.write("  <input type=\"radio\" name=\"n\" value=\"New Zealand\"/><font color = \"white\">New Zealand</font>\n");
      out.write("  <input type=\"radio\" name=\"n\" value=\"South Africa\"/><font color = \"white\">South Africa</font>\n");
      out.write("  <input type=\"radio\" name=\"n\" value=\"England\"/><font color = \"white\">England</font>\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("        <button type=\"submit\">Submit</button>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("   \n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        <form action = \"hivee4.jsp\">\n");
      out.write("            <font color =\"white\">\n");
      out.write("    FIND CENTURIES IN A MATCH:-</font>\n");
      out.write("    <div>\n");
      out.write("       <input type =\"radio\" name =\"n\" value=\"211028\"/><font color = \"white\">England vs Australia</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"1093\"/><font color = \"white\">India vs Australia</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"211048\"><font color = \"white\">New Zealand vs Australia</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"1049\"><font color = \"white\">South Africa vs India</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"222678\"><font color = \"white\">South Africa vs New Zealand</font>\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("  <button type=\"submit\">Submit</button>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("    </li>\n");
      out.write("   \n");
      out.write("    <li>\n");
      out.write("        <form action = \"hivee8.jsp\">\n");
      out.write("             <font color =\"white\">\n");
      out.write("             TO SEE MATCH WISE SCORE CARD</font>\n");
      out.write("    <div>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"211028\"/><font color = \"white\">England vs Australia</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"1093\"/><font color = \"white\">India vs Australia</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"211048\"><font color = \"white\">New Zealand vs Australia</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"1049\"><font color = \"white\">South Africa vs India</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"222678\"><font color = \"white\">South Africa vs New Zealand</font>\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("  <button type=\"submit\">Submit</button>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        <form action = \"hivee7.jsp\">\n");
      out.write("             <font color =\"white\">\n");
      out.write("           \n");
      out.write("            VIEW TEAM WISE SCORE  </font>\n");
      out.write("    <div>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"211028\"/><font color = \"white\">England vs Australia</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"1093\"/><font color = \"white\">India vs Australia</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"211048\"><font color = \"white\">New Zealand vs Australia</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"1049\"><font color = \"white\">South Africa vs India</font>\n");
      out.write("        <input type =\"radio\" name =\"n\" value=\"222678\"><font color = \"white\">South Africa vs New Zealand</font>\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("  <button type=\"submit\">Submit</button>\n");
      out.write("    </div>\n");
      out.write("        </form>\n");
      out.write("    </li>\n");
      out.write("\n");
      out.write("</ol>\n");
      out.write("<form action =\"indexx1.jsp\">\n");
      out.write("    <br><br><br>\n");
      out.write("    <input type =\"submit\" value =\"back\">\n");
      out.write("    \n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
