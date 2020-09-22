<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id= request.getParameter("id");
	String name= request.getParameter("name");
%>
	<h1>안녕하세요<%=id%></h1>
	<h1>감사해요 <%=name%></h1>