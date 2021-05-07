<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Добро пожаловать | Калькулятор автотранспортных перевозок</title>
</head>
<body>
<h1>Авторизация/h1>>
    <form action="FormAutorization" method="post">
        <label for="login">Логин:</label>
        <input type="text" name="login" id="login" value="${login}">
        <label for="password">Пароль: </label>
        <input type="password" name="password" id="password" value="${password}">
        <input type="submit" name="sign" value="Войти">
    </form>
    </body>
</html>