<%--
  Created by IntelliJ IDEA.
  User: Ted
  Date: 13.09.2023
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/book?language=en">en</a>
<a href="/book?language=ru">ru</a>
<f:form action="/book" method="post"   >
    <p><strong><spring:message code="label.nameOfBook" /></strong>
    <p><input name="name"  placeholder="">${name_error}</p>
    <p><strong><spring:message code="label.ageLimit" /></strong>
    <p><input name="age"  required placeholder="">${age_error}</p>
    <p><input type="submit" value="Поиск"></p>
</f:form>
<ul style="margin: auto;color:darkblue">
    <c:forEach var="Book" items="${Book}">
        <form method="post" action="/change" name="change">
            <li><h3>${Book}</h3>
            </li>
        </form>
    </c:forEach>
</ul>


</body>
</html>