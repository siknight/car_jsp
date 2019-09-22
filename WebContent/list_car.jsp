<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>列表</title>
</head>
<body style="text-align: center">
	<h2>汽车销售系统列表</h2>
	<div><a href="addcar.jsp">添加一辆车</a></div>
	<table  border="1" width="700" style="margin: 0 auto">
		<tr align="center">
			
			<td>车名</td>
			<td>车身颜色</td>			
			<td>操作</td>
		</tr>
		
		<c:forEach items="${list }" var="car">
		
			<c:if test=""></c:if>
			<tr align="center">
				
				<td>${car.name }</td>
				
				<td>${car.color }</td>
				
				<td><a href="toupdate.do?id=${car.id}">更新</a>   <a href="delete.do?id=${car.id}">删除</a></td>
			</tr>
		</c:forEach>
	</table>
	<br/><br/>
	<button><a href="uppage.do?page=${startpage}">上一页</a>	
	<button>第${startpage}页<button>
	<a href="downpage.do?page=${startpage}">下一页</a></button>
			
</body>
</html>