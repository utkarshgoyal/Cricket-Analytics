<%@page import="java.sql.*" %>
<center>
    <h1 style="background-color: blue;color:white;font-size: 350%;text-align:center">
        <marquee>Top 3 wicket takers</marquee>
    </h1>
</center>
<body background ="qu.jpg">
<center>
<table border ="1" width="80%" align="middle">
    <tr>
        <th style="text-align:center"><font size = "20%"color = "orange">Baller Name</font></th>
        <th style="text-align:center"><font size = "20%"color = "orange">Wickets</font></th>
    </tr>
    <%! String name1;
    %>
    <%
        name1 = request.getParameter("n");
        session.setAttribute("n",name1);
        name1 = "\""+name1+"\"";
        String hql = "select bn,count(wf) as wickets from ena where wf!=' ' and  team = "+name1+" group by bn order by wickets desc limit 3";
         ResultSet rs = RCPL.hadoop.getData(hql); 
while(rs.next())
{
    String bn = rs.getString(1);
    String wk = rs.getString(2);

%>
    <tr>
        <td style="text-align:center"><font size = "20%"color = "orange"><%=bn%></font></td>
        <td style="text-align:center"><font size = "20%"color = "orange"><%=wk%></font></td>
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
</body>
