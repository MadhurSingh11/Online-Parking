package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title> | Register</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Motel Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<script type=\"applijewelleryion/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\t\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("<!--webfonts-->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300italic,300,600' rel='stylesheet' type='text/css'>\n");
      out.write("   <!--//webfonts-->\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    function abc()\n");
      out.write("    {\n");
      out.write("        if(document.frm.t1.value==\"\")\n");
      out.write("            {\n");
      out.write("             alert(\"Pleass Enter Parking Name\");\n");
      out.write("             return false;\n");
      out.write("            }\n");
      out.write("            if(document.frm.t2.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Pleas Enter Parking Area!!!! \");\n");
      out.write("                    return false;\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("        \n");
      out.write("        if(document.frm.t3.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Pleas Enter Email id!!!! \");\n");
      out.write("                    return false;\n");
      out.write("                                 \n");
      out.write("                }\n");
      out.write("         if(document.frm.t4.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Pleas Enter Phone number!!!! \");\n");
      out.write("                    return false;\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("                 if(document.frm.t6.value!=document.frm.t7.value)\n");
      out.write("                {\n");
      out.write("                    alert(\"Conform Password not match!!!! \");\n");
      out.write("                    return false;\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                    {\n");
      out.write("                        \n");
      out.write("                        return true;\n");
      out.write("                    }\n");
      out.write("       \n");
      out.write("       \n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"banner1\">\n");
      out.write("\t\t<div class=\"header\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t\t<h1><a href=\"index.jsp\">PARKING</a></h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("\t\t\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!--/.navbar-header-->\n");
      out.write("\t\t\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                                                                <li><a href=\"booking1.jsp\">Book Now</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"offers.jsp\">Offers</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"active\"><a href=\"login.jsp\">Sign In</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                                                                <li><a href=\"register.jsp\">New Registration</a></li>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!--/.navbar-collapse-->\n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t<div class=\"search-box\">\n");
      out.write("\t\t\t\t\t<div id=\"sb-search\" class=\"sb-search\">\n");
      out.write("\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t<input class=\"sb-search-input\" placeholder=\"Enter your search term...\" type=\"search\" name=\"search\" id=\"search\">\n");
      out.write("\t\t\t\t\t\t\t<input class=\"sb-search-submit\" type=\"submit\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sb-icon-search\"> </span>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- search-scripts -->\n");
      out.write("\t\t\t\t\t<script src=\"js/classie.js\"></script>\n");
      out.write("\t\t\t\t\t<script src=\"js/uisearch.js\"></script>\n");
      out.write("\t\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t\tnew UISearch( document.getElementById( 'sb-search' ) );\n");
      out.write("\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t<!-- //search-scripts -->\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\t\t\n");
      out.write("\t\t<!-- banner -->\n");
      out.write("<!-- registration -->\n");
      out.write("\t<div class=\"main-1\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("                     <h2 style=\"color:#985f0d; \" align=\"center\">Member Registration</h2>\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div class=\"register\">\n");
      out.write("                            <form action=\"reg\" method=\"post\" name=\"frm\" onsubmit=\"return abc();\"> \n");
      out.write("\t\t\t\t <div class=\"register-top-grid\">\n");
      out.write("\t\t\t\t\t<h3>PERSONAL INFORMATION</h3>\n");
      out.write("\t\t\t\t\t <div class=\"wow fadeInLeft\" data-wow-delay=\"0.4s\">\n");
      out.write("                                             <span>Parking Name<label style=\"color: red;\">*</label></span>\n");
      out.write("                                             <input type=\"text\" name=\"t1\"> \n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t\t <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\n");
      out.write("                                             <span>Parking Area<label style=\"color: red;\">*</label></span>\n");
      out.write("                                             <input type=\"text\" name=\"t2\"> \n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("                                         <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\n");
      out.write("                                             <span>Parking Capacity<label style=\"color: red;\">*</label></span>\n");
      out.write("                                             <input type=\"text\" name=\"tc\"> \n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\n");
      out.write("                                             <span>Email Address<label style=\"color: red;\">*</label></span>\n");
      out.write("\t\t\t\t\t\t <input type=\"text\" name=\"t3\"> \n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("                                        <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\n");
      out.write("                                            <span>Phone Number<label style=\"color: red;\">*</label></span>\n");
      out.write("\t\t\t\t\t\t <input type=\"text\" name=\"t4\"> \n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("                                        <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\n");
      out.write("\t\t\t\t\t\t <span>Address<label style=\"color: red;\">*</label></span>\n");
      out.write("                                                 <input type=\"text\" name=\"t5\"> \n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t\t <div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t   <a class=\"news-letter\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" checked=\"\"><i> </i>Sign Up for Newsletter</label>\n");
      out.write("\t\t\t\t\t   </a>\n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t     <div class=\"register-bottom-grid\">\n");
      out.write("\t\t\t\t\t\t    <h3>LOGIN INFORMATION</h3>\n");
      out.write("\t\t\t\t\t\t\t <div class=\"wow fadeInLeft\" data-wow-delay=\"0.4s\">\n");
      out.write("                                                             <span>Password<label style=\"color: red;\">*</label></span>\n");
      out.write("                                                                <input type=\"password\" name=\"t6\">\n");
      out.write("\t\t\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t\t\t\t <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\n");
      out.write("                                                             <span>Confirm Password<label style=\"color: red;\">*</label></span>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" name=\"t7\">\n");
      out.write("                                                              \n");
      out.write("\t\t\t\t\t\t\t </div>\n");
      out.write("                                                    \n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t<div class=\"register-but\">\n");
      out.write("\t\t\t\t   \n");
      out.write("\t\t\t\t\t   <input type=\"submit\" value=\"submit\">\n");
      out.write("\t\t\t\t\t   <div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t   \n");
      out.write("                            ");

             String m=request.getParameter("msg");
             if(m!=null)
                 out.println("<p style='color:red'>"+m+"</p>");
             
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t   </div>\n");
      out.write("\t\t </div>\n");
      out.write("\t</div>\n");
      out.write("<!-- registration -->\n");
      out.write("<!-- footer -->\n");
      out.write("<div class=\"footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("                   \n");
      out.write("\t\t\t<div class=\"col-md-2 deco\">\n");
      out.write("\t\t\t\t<h4>Navigation</h4>\n");
      out.write("\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<li><a href=\"login.jsp\">Sign in</a></li> \n");
      out.write("\t\t\t\t<li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                               \t</div>\n");
      out.write("\t\t\t<div class=\"col-md-2 deco\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-2 deco\">\n");
      out.write("\t\t\t\t<h4>Social</h4>\n");
      out.write("\t\t\t\t<div class=\"soci\">\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><i class=\"f-1\"> </i></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><i class=\"t-1\"> </i></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><i class=\"g-1\"> </i></a></li>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-3 cardss\">\n");
      out.write("\t\t\t\t<h4>Payment Sécure</h4>\n");
      out.write("\t\t\t\t<li><i class=\"visa\"></i></li>\n");
      out.write("\t\t\t\t<li><i class=\"ma\"></i></li>\n");
      out.write("\t\t\t\t<li><i class=\"paypal\"></i></li>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-3 pos\">\n");
      out.write("\t\t\t<h4>NewsLetter</h4>\n");
      out.write("\t\t\t\t\t   <form method=\"post\">\n");
      out.write("\t\t\t\t\t\t <input type=\"text\" class=\"textbox\" value=\"Email\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Email';}\">\n");
      out.write("\t\t\t\t\t\t <div class=\"smt\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"Subscribe\">\n");
      out.write("\t\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t\t   </form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"footer-bottom\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<p>© . All Rights Reserved | Design by  <a href=\"http://\" target=\"\">Analyze Info-tech</a> </p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t<!-- footer -->\n");
      out.write("\n");
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