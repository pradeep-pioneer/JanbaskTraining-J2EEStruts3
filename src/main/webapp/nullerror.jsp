<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
<p><a href="index.action">Back to home page</a></p>
<h2>Null Reference Exception</h2>
<h3>Oops our programmers forgot to put a null reference check somewhere.</h3>
	<h4>The application has malfunctioned.</h4>
	<p>  Please contact technical support with the following information:</p> 
	<h4>Exception Name: <s:property value="exception" /> </h4>
	<h4>Exception Details: <s:property value="exceptionStack" /></h4> 
</body>
</html>
