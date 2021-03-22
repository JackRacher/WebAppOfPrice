<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Details</h1>
<sf:form method="post" modelAttribute="employee">
Employee ID:<br/>
<sf:input path="empNo"/>
<p/>
Employee Name: <br/>
<sf:input path="empName"/>
<p><p/>
Employee salary: <br/>
<sf:input path="empSalary"/>
<p><p/>
<input type="submit" value="Employee Details"/>
<p><p/>
<h3>${result}</h3>
</sf:form>
</body>
</html>