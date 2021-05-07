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
<link rel="stylesheet" href="resources/css/normalize.css-master/normalize.css">
<title>О нас</title>
</head>
<body>
<header class="header__info">
        <div class="container">
            <div class="header__inner__info">
                <div class="header__logo__info">LabMain.</div>
                
                <nav class="nav__info">
                    <a class="nav__link__info" href="userForm.jsp">Калькулятор</a>
                    <a class="nav__link__info" href="formAutorization.jsp">Авторизация</a>
                </nav>
            </div>
        </div>
</header>
    
     <div class="intro__info">
    
     	<div class="container">
            <div class="intro__inner__info">
                <h1 class="intro__title__info">Описание:</h1>
                <p class="intro__text__info">Приветствуем вас!<p>
                <p class="intro__text__info">На данном сайте вы сможете воспользоваться калькулятором расчета стоимости автотранспортных перевозок. Дополнительный функционал будет добавлен со временем.</p>
            </div>
            
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