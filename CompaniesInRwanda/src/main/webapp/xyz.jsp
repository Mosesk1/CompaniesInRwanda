<%@page import="com.moses.Dao.CompanyDao"%>
<%@page import="com.moses.model.Company"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Company List</title>
</head>
<body>
<body>
<h1>LIST OF ALL THE COMPANIES</h1>
<a href="/CompaniesInRwanda/abc.jsp">Add New</a>
<br>
<br>
<%
List<Company> companyList=CompanyDao.getAllCompany();
%>
<table>
<thead>
<tr>
<th>registartionNo</th>
<th>companyName</th>
<th>category</th>
<th>owner</th>
<th>startingDate</th>
<th>registrationDate</th>
<th>capital</th>
</tr>
</thead>
<tbody>
<%
for (Company company:companyList){ %>
<tr>
<td><%=company.getRegistartionNo() %></td>
<td><%=company.getCompanyName() %></td>
<td><%=company.getCategory() %></td>
<td><%=company.getOwner() %></td>
<td><%=company.getStartingDate() %></td>
<td><%=company.getRegistartionNo() %></td>
<td><%=company.getCapital() %></td>
</tr>

<% } %>
</tbody>



</table>
</body>
</html>