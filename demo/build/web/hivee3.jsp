<%@page import="java.sql.*" %>
<center>
    <h1 style="background-color: blue;color: WHITE;text-align:center;font-size: 300%">
        <marquee>Players who scored half centuries</marquee>
    </h1>
</center>
<body background ="qt.jpg">
<center>
<table border ="1" width="80%">
    <tr>
        <th style="text-align:center"><font size = "20%"color = "yellow">Player Name</font></th>
        <th style="text-align:center"><font size = "20%"color = "yellow">Runs</font></th>
    </tr>
    <%! String id1;
    %>
    <%
        id1 = request.getParameter("n");
        session.setAttribute("n",id1);
        id1 = "\""+id1+"\"";
        String hql = "select pos,SUM(rb) as runs from ena where id ="+id1+" group by pos";
         ResultSet rs = RCPL.hadoop.getData(hql); 
while(rs.next())
{
    String pos = rs.getString(1);
    	 String runs = rs.getString(2);
    	 int r = Integer.parseInt(runs);
         
    	 if(r>=50&&r<100){
    	 
%>
    <tr>
        <td style="text-align:center"><font size = "20%"color = "yellow"><%=pos%></font></td>
        <td style="text-align:center"><font size = "20%"color = "yellow"><%=r%></font></td>
                </tr>
                <%}}
%>
 
</table>


</center>
<form action ="index23.jsp">
    <br>
    <br>
    <br>
    <input type ="submit" value ="back">
    
</form>
