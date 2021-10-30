<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    	Map<String, String> errors = (Map) session.getAttribute("errors");
    	pageContext.setAttribute("error", errors);
    	session.removeAttribute("errors");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Companies In Rwanda</title>
</head>
<body style="background-color:black ; color:white ;font-size:20px">
<a href="/CompaniesInRwanda/xyz.jsp">Companies List</a>
<h2>Private companies in Rwanda System </h2>

<form action="CompanyServlet" method="post">
 <label>registartionNo </label>
 <input type="text" name="registartionNo"  placeholder="Enter your ISBN"><label>${error["regError"]}</label>
 <br>
 <br>
 <label>companyName</label>
 <input type="text" name="companyName"  placeholder="Enter your title">
 <br>
 <br>
 <label>owner</label>
 <input type="text" name="owner"  placeholder="Enter your title"><label>${error["ownerError"]}</label>
 <br>
 <br>
 CATEGORY : <select name="category">
			<option>small</option>
			<option>medium</option>
			<option>large</option>
			
		</select><br><br>
 <label>startingDate </label>
 <input type="date" name="startingDate"  placeholder="Enter your publicationYear">
 <br>
 <br>
  <label>capital</label>
 <input type="text" name="capital"   placeholder="Enter your sellingPrice">
 <br>
 <br>
 
 <input type="submit" value="SAVE">

</form>

</body>
</html>