<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
</head>
<body>
<%@include file="/WEB-INF/views/Common-Header.jsp" %>
<c:forEach items="${list}" var="obj">
<table border="5">
<tr>
<td><c:out value="${obj.product_name}"> </c:out></td>
<td><c:out value="${obj.product_id}"> </c:out></td>
<td><c:out value="${obj.price}"> </c:out></td>
<td><c:out value="${obj.quantity}"> </c:out></td>
</c:forEach>
</table>
<%@include file="/WEB-INF/views/Common-Footer.jsp" %>
</body>
</html>