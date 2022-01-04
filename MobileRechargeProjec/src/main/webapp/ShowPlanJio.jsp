<%@page import="com.mobilerechargeapp.model.JioUser"%>
<%@page import="java.util.List"%>
<%@page import="com.mobilerechargeapp.daoimpl.JioDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JIOPLAN </title>
<style type="text/css">
table,tr,td{
border:1px solid black;
border-collapse:collapse;

}</style>
</head>
<body>
  <h1>Jio plan</h1>
  <form align="center">
  <table >
    <tr>
    <td><strong>plan-Id</strong></td>
    <td><strong>PlanName</strong></td>
    <td><strong>Price</strong></td>
    <td><strong>validity</strong></td>
    <td><strong>Benefit</strong></td>
  	<td><strong>Operator</strong></td>
  	</tr>
<%
JioDAOImpl jioDao=new JioDAOImpl();
 List<JioUser>ShowPlan=jioDao.showJioplan();
 
for(int i=0;i<ShowPlan.size();i++)
{
	JioUser jioUser=ShowPlan.get(i);
	int findjioId=jioDao.findjioId(jioUser.getPlanName(),jioUser.getPrice());
%>
<tr>
<td><%= findjioId %></td>
<td><%= jioUser.getPlanName() %></td>
<td><%= jioUser.getPrice() %></td>
<td><%= jioUser.getValidity() %></td>
<td><%= jioUser.getBenfits() %></td>
<td><%= jioUser.getOperator().getOperatorname() %></td>
</tr>
<%}%>
</table>

  

  </form>
</body>
</html>