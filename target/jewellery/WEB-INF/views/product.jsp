<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<!-- Latest compiled AngularJs -->

<html>

<head>

<script>
  var prod = ${list}; //list is the variable passed from controller
  angular.module('addProduct', []).controller('ProductController', function($scope)
   {
                 $scope.products=prod;
   
          $scope.sort = function(list)
          {
              $scope.sortKey = list;   //set the sortKey to the param passed
              $scope.reverse = !$scope.reverse; //if true make it false and vice versa
          }
              
    });
</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
</head>
<body>
<%@include file="/WEB-INF/views/Common-Header.jsp" %>

<div ng-app="addProduct" ng-controller="ProductController">
Search <input type="text" placeholder="search products" ng-model="searchText"/>
<table border="1"><tr><td><th><b>Product Name</b></th></td>
<td><th><b>Product Price</b></th></td>
<td><th><b>Product Category</b></th></td></tr>

<tr class="success" ng-repeat="product in products|filter:searchText"> 
                <td><a href="ProductDescription?pid={{product_id}}">{{product_id}}</a></td>
                <td>{{product.product_name}}</td>
                <td>{{product.price}}</td>
                <td>{{product.category}}</td>
                <td><img src="/resources/{{product.pid}}.jpg" height="50px" width="50px"/></td>
                
</tr>
</table>
</div>
<!-- ------------------------------------------------------------------------------------------ -->
<%-- <table border="5">
<tr>
<td><c:out value="${obj.product_name}"> </c:out></td>
<td><c:out value="${obj.product_id}"> </c:out></td>
<td><c:out value="${obj.price}"> </c:out></td>
<td><c:out value="${obj.quantity}"> </c:out></td>
</c:forEach>
</table>
 --%>
 
 <%@include file="/WEB-INF/views/Common-Footer.jsp" %>
</body>
</html>