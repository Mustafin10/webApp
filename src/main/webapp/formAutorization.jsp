<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="resources/css/style.css">
<link rel="stylesheet" href="resources/css/light-mode.css" id="themes">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Ubuntu:wght@700&display=swap" rel="stylesheet">
<title>Добро пожаловать | Калькулятор автотранспортных перевозок </title>
</head>
<body>

	<header class="header__autoreg">
        <div class="container">
            <div class="header__inner__autoreg">
                <div class="header__logo__autoreg">LabMain.</div>
            </div>
        </div>
	</header>

	<div class="intro__autoreg">
        <div class="container">
            <div class="intro__inner__autoreg">
                <h1 class="intro__title__autoreg">Авторизация</h1>
            </div>
            <form action="FormAutorization" method="post"><p></p>
                <div class="contfront__autoreg">
                    <label class="label__autoreg" for="login">Логин:</label>
                    <input class="input__autoreg"  type="text" name="login" id="login" value="${login}" placeholder="Логин " required title="Введите логин" autofocus>
                    <p></p>
                    <label class="label__autoreg" for="password">Пароль:</label>
       		       <input class="input__autoreg" type="password" name="password" id="password" value="${password}" placeholder="Пароль" required title="Введите пароль">
                    <p></p>
                    <input class="btn__login" type="submit" name="sign" value="Войти">
                    <!--<input class="btn__reg" type="submit" name="reg" value="Регистрация" onclick="location.href='regForm.jsp'">-->
                    <p class="error__auto">${answer}</p>
                </div>
             </form>  
 		</div> 
 	 </div>
 	 
 <script src="resources/css/script.js">
 </script>
 <script>
//восстанавливаем запомненное значение, если есть

 if(localStorage.theme == 'dark') {
 themes.href="resources/css/dark-mode.css";
 }else{
 themes.href="resources/css/light-mode.css";
 }
 </script>
</body>
</html>