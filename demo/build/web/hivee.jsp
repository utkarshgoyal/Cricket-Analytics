<%@page import="java.sql.*" %>

<enter>
    <h1 h1 style="background-color: blue;color: WHITE;text-align:center;font-size: 300%">
        <marquee>Top 3 scorers</marquee>
    </h1>
</center>
<body background ="qr.jpg">
<center>
<table border ="1" width="80%" >
    <tr>
        <th style="text-align:center"><font size = "20%"color = "yellow">Player On Strike</font></th>
        <th style="text-align:center"><font size = "20%"color = "yellow">Runs</font></th>
    </tr>
    <%! String id1;
    %>
    <%
        id1 = request.getParameter("n");
        session.setAttribute("n",id1);
        id1="\""+id1+"\"";
        String hql = "select pos,sum(rb) as run from ena where team ="+id1+" group by pos order by run desc limit 3";
         ResultSet rs = RCPL.hadoop.getData(hql); 
         
while(rs.next())
{
    String id = rs.getString(1);
    String name = rs.getString(2);

%>
    <tr>
        <td style="text-align:center"><font size = "20%"color = "yellow"><%=id%></font></td>
        <td style="text-align:center"><font size = "20%"color = "yellow"><%=name%></font></td>
                </tr>
                <% }
%>
</table>
<br>
</center>
<form action ="index23.jsp">
    <br>
    <br>
    <br>
    <input type ="submit" value ="back">
    
</form>
</body>