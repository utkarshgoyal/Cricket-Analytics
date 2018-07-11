<%@page import="java.sql.*" %>
<center>
    <h1 style="background-color: blue;color: WHITE;text-align:center;font-size: 300%">
        <marquee>Match-Wise Team Scores</marquee>
    </h1>
</center>
<body background ="qi.jpg">
<center>
<table border ="1" width="80%">
    <tr>
        <th style="text-align:center"><font size = "20%"color = "WHITE">Team's id</font></th>
        <th style="text-align:center"><font size = "20%"color = "WHITE">Team's Name</font></th>
        <th style="text-align:center"><font size = "20%"color = "WHITE">Total Runs</font></th>
    </tr>
    
    <%
        String hql = "Select id,team,sum(rb)+sum(ew) as runs from ena group by id,team";
         ResultSet rs = RCPL.hadoop.getData(hql); 
while(rs.next())
{
    String id = rs.getString(1);
    String name = rs.getString(2);
    String score = rs.getString(3);
    	 
    	 
%>
    <tr>
        <td style="text-align:center"><font size = "20%"color = "WHITE"><%=id%></font></td>
        <td style="text-align:center"><font size = "20%"color = "WHITE"><%=name%></font></td>
        <td style="text-align:center"><font size = "20%"color = "WHITE"><%=score%></font></td>
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
