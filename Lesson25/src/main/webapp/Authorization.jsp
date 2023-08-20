<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="get" action="/">
    <p><strong>Логин:</strong>
    <p><input name="login" required placeholder="Введите логин"></p>
    <p><strong>Пароль:</strong>
    <p><input name="password" required placeholder="Введите пароль"></p>
    <p><input type="submit" value="Войти"></p>
</form>
<form method="post" action="FormOfRegistr.jsp">
    <p><input type="submit" value="Регистрация"></p>
</form>
</body>
</html>
