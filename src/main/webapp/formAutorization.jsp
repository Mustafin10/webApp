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
			<form action="FormAutorization" method="post"><p></p>
                <div class="contfront__autoreg">
                    <label class="label__autoreg" for="login">Логин:</label>
                    <input class="input__autoreg"  type="text" name="login" id="login" value="${login}" placeholder="Логин " required title="Введите положительное число (Если дробное, то отделяется точкой)" autofocus>
                    <!--pattern="(^[1-9](\d*)?([.]\d+)?)|(^0[.](\d*)?(?=[1-9])\d+)"-->
                    <p></p>
                    <label class="label__autoreg" for="password">Пароль:</label>
       		       <input class="input__autoreg" type="password" name="password" id="password" value="${password}" placeholder="Пароль" required title="Введите положительное число (Если дробное, то отделяется точкой)">
    	  	        <!--pattern="(^[1-9](\d*)?([.]\d+)?)|(^0[.](\d*)?(?=[1-9])\d+)"-->
                    <p></p>
                    <input class="btn__login" type="submit" name="sign" value="Войти">
                    <input class="btn__reg" type="submit" name="reg" value="Регистрация" onclick="location.href='regForm.jsp'">
                    <p class="error__auto">${answer}</p>
                </div>
			</form> 
    </body>
</html>