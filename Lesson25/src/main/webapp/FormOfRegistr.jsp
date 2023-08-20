<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/reg">
    <p><strong>Логин:</strong>
    <p><input name="login" required placeholder="Введите логин"></p>
    <p><strong>Пароль:</strong>
    <p><input name="password" required placeholder="Введите пароль"></p>
    <p><strong>Возраст:</strong>
    <p><input type="number" min="1" name="age" placeholder="Введите возраст"></p>
    <p><strong>Эл.почта:</strong>
    <p><input type="email" name="email" placeholder="Введите вашу почту"></p>
    <p><input type="submit" value="Сохранить"></p>
</form>
</body>
</html>
