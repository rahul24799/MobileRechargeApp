<%@page import="com.mobilerechargeapp.model.BsnlUser"%>
<%@page import="java.util.List"%>
<%@page import="com.mobilerechargeapp.daoimpl.BsnlDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>selectBsnlPlans</title>
<style type="text/css">

body{
overflow: hidden;
}
table {
	/*  background: cornflowerblue; */
	background: inactiveborder;
	padding: 10px;
	position: absolute;
	top:70px;
}

table, tr, td {
	text-align: left;
	height: 40px;
	padding: 3px 10px;
	margin-top: 10px;
	font-size: medium;
}

tr:nth-child(even) {
	background-color: #3f56fb;
	color: white;
	padding: 10px; 
	margin-left: 19px;
}

tr:hover {
	background-color: threedlightshadow;
}

td.links {
	text-align: center;
}

td.links a {
	color: rgba(#3f56fb, #fc466b);
	text-decoration: none;
	font-weight: bold;
	font-family: sans-serif;
	font-size: 15px;
	/*  background: aliceblue; */
	padding: 9px;
}

.header a {
	padding: 12px 18px;
	text-decoration: none;
	font-weight: bold;
	color: white;
}

.header {
	background: linear-gradient(to right, #3f56fb, #fc466b);
	padding: 0px;
	display: flex;
	justify-content: space-around;
	position: absolute;
	top:0px;
	width: 100%;
}

.header a:hover {
	background: white;
	color: black;
}
</style>

</head>
<body>
	<div class="header">
		<a href="Operator.jsp">Home</a> <a href="wallet.jsp">wallet</a> <a
			href="history.jsp">RechargeHistory</a> <a href="aboutus.jsp">AboutUs</a>
		<a href="contectus.jsp">ContectUs</a> <a href="logout.jsp">Logout</a>
	</div>
	<form>
		<table>
			<tr>

				<td><strong>PlanName</strong></td>
				<td><strong>Price</strong></td>
				<td><strong>validity</strong></td>
				<td><strong>Benefit</strong></td>
				<td><strong>Operator</strong></td>
				<%
BsnlDAOImpl bsnlDao=new BsnlDAOImpl();
List<BsnlUser> ShowPlan=bsnlDao.showBsnlplan();
 
for(int i=0;i<ShowPlan.size();i++){
	BsnlUser bsnlUser=ShowPlan.get(i);
	String planName=bsnlUser.getPlanName();
	%>
			
			<tr>
				<td><%= bsnlUser.getPlanName() %></td>
				<td><%= bsnlUser.getPrice() %></td>
				<td><%= bsnlUser.getValidity() %></td>
				<td><%= bsnlUser.getBenfits() %></td>
				<td><%= bsnlUser.getOperator().getOperatorname() %></td>
				<td><a
					href="recharge.jsp?planName=<%=bsnlUser.getPlanName() %>&price=<%=  bsnlUser.getPrice() %>
&operator=<%= bsnlUser.getOperator().getOperatorname() %>">Recharge</a></td>
			</tr>
			<%}%>

		</table>
	</form>
</body>
</html>