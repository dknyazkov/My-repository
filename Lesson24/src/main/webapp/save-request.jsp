<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>

<form method="post" action="/start">
  Name: <input type="text" name="Name" value="${name}"><br><br>
  Author:<input type="text" name="Author" value="${author}"><br><br>
  <input type="submit" value="save">
</form>
</body>
</html>

