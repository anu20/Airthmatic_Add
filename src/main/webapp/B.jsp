<%@page import="com.simplilearn.training.Airthmatic_Add.App"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Enter two numbers to add up</title>
    </head>
    <body>
   
   <% if(request.getParameter("text1")=="" || request.getParameter("text2")==""  ){ %>
   <h2>Please enter both the text boxes with numbers mandatorily!!</h2>
   <% } else{ App c=new App();
	   String result= c.examineInput(request.getParameter("text1"),request.getParameter("text2"));%>
     <%="<h1> Sum = "+(result)+"</h1>"%>
  <%} %>
    </body>
</html>