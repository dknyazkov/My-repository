<%@ page import="org.example.domain.Activities" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.example.domain.Client" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>ToDo</title>
</head>
<body>
<form method="post" action="/create">
    <select name="active">
        <option value="going for a walk" selected>going for a walk</option>
        <option value="getting a shower">getting a shower</option>
        <option value="cooking">cooking</option>
        <option value="going for a walk">going for a walk</option>
        <option value="reading a book">reading a Book</option>
        <option value="getting up">getting up</option>
        <option value="playingFootball">playing football</option>
    </select>
    <input type="hidden" name="login" value="${client.login}">
    <input type="submit" value="add">

</form>
<ul style="margin: auto;color:darkblue">
    <c:forEach var="activity" items="${active}">
              <form method="post" action="/change" name="change">
            <li><h3>${activity}, status ${activity.status} <input type="submit" value="change"/></h3>
                <input type="hidden" name="id" value="${activity.id}">
                <input type="hidden" name="status" value="${activity.status}">
                <input type="hidden" name="login" value="${client.login}">
            </li>
        </form>
    </c:forEach>
</ul>

<form method="get" action="/show" name="complete">
    <input type="submit" value="show complete">
    <input type="hidden" name="login" value="${client.login}">

</form>

</body>
</html>
