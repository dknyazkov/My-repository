<%--
  Created by IntelliJ IDEA.
  User: Ted
  Date: 13.09.2023
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/book">
    <p><strong>Название книги:</strong>
    <p><input name="name"  placeholder="Введите название книги">${name_error}</p>
    <p><strong>Возрастное ограничение:</strong>
    <p><input name="age"  required placeholder="Введите возраст">${age_error}</p>
    <p><input type="submit" value="Поиск"></p>
</form>
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
