<%@page import="java.sql.*" %>
<center>
    <h1 style="background-color: blue;color: WHITE;text-align:center;font-size: 300%">
        <marquee> Score Card</marquee>
    </h1>
</center>
<body background ="qy.jpg">
<center>
<table border ="1" width="80%">
    <tr>
        <th><font size = "20%"color = "WHITE">Match id</font></th>
    <th><font size = "20%"color = "WHITE">Team's Name</font></th>
    <th><font size = "20%"color = "WHITE">Total Runs</font></th>
    <th><font size = "20%"color = "WHITE">Total overs</font></th>
    </tr>
    <%! String id1,id,name,totalRuns,totalOvers;      
            String hql;  
    %>
    <%   
        
        id1=request.getParameter("n");
        session.setAttribute("n",id1);
        hql = "select id,team,sum(rb)+sum(ew),max(bc) from ena where id="+ id1 +  " group by id,team";
         ResultSet rs = RCPL.hadoop.getData(hql); 
while(rs.next())
{
         id = rs.getString(1);
    	 name = rs.getString(2);
    	 totalRuns = rs.getString(3);
    	 totalOvers = rs.getString(4);
         Float to = Float.parseFloat(totalOvers);
    	 
%>
    <tr>
     <td><font size = "20%"color = "WHITE"><%=id %></font></td>
    <td><font size = "20%"color = "WHITE"><%=name %></font></td>
    <td><font size = "20%"color = "WHITE"><%=totalRuns %></font></td>
    <td><font size = "20%"color = "WHITE"><%=to %></font></td>
    </tr>
                <% }
%>
</table>
</center>
 <h1 style="background-color: red;color:black;text-align:center;font-size: 300%">
        Player-Wise individual scores
    </h1>
<center>
<table border ="1" width="80%">
    <tr>
    <th><font size = "20%"color = "WHITE">Match id</font></th>
    <th><font size = "20%"color = "WHITE">Team's Name</font></th>
    <th><font size = "20%"color = "WHITE">Player</font></th>
    <th><font size = "20%"color = "WHITE">Total Runs</th>
    </tr>
    <%
        hql= "select id,team,pos,sum(rb) as run from ena where id="+id1+" group by id,team,pos";
        rs = RCPL.hadoop.getData(hql); 
        while(rs.next())
        {
                 id = rs.getString(1);
                 name = rs.getString(2);
                 String playerName = rs.getString(3);
                 totalRuns= rs.getString(4);

        %>
            <tr>
            <td><font size = "20%"color = "WHITE"><%=id %> </font></td>
            <td><font size = "20%"color = "WHITE"><%=name %></font></td>
            <td><font size = "20%"color = "WHITE"><%=playerName %></font></td>
            <td><font size = "20%"color = "WHITE"><%=totalRuns %></font></td>
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