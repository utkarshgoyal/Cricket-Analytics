<%@page import="java.sql.*" %>
<center>
    <h1 style="background-color: blue;color: WHITE;text-align:center;font-size: 300%">
        <marquee> PLAYERS WHO SCORED FOURS</marquee>
    </h1>
</center>
<body background ="qw.jpg">
<center>
<table border ="1" width="80%">
    <tr>
        <th style="text-align:center"><font size ="20%"color="blue">Number of fours</font></th>
    </tr>
    <%! String id1;
    %>
    <%
        id1 = request.getParameter("n");
        session.setAttribute("n",id1);
        String hql = "select count(bc) from ena where rb=4 and id = "+id1;
         ResultSet rs = RCPL.hadoop.getData(hql); 
         
while(rs.next())
{
    String count = rs.getString(1);
    	 
    	 
%>
    <tr>
        <td style="text-align:center"><font size = "20%"color = "blue"><%=count%></font> </td>
       
                </tr>
                <% }
%>

</table>

</center>
<form action ="index23.jsp">
    <br>
    <br>
    <br>
    <input type ="submit" value ="back">
    
</form>
