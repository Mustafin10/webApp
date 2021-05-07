<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Результат сложения</title>
</head>
<body>
<header class="header__admin">
        <div class="container">
            <div class="header__inner__admin">
                <div class="header__logo__admin">LabMain.</div>
                 <nav class="nav__admin">
                    <a class="nav__link__admin" href="userForm.jsp">Калькулятор</a>
                    <a class="nav__link__admin" href="formAutorization.jsp">Авторизация</a>
                </nav>
            </div>
        </div>
	</header>

	<div class="intro__admin">
        <div class="container">
            <div class="intro__inner__admin">
                <h1 class="intro__title__admin">Окно администратора</h1>
				<label for="subject" class="label__admin"><b>Тема приложения:</b> 
		        		
		        		<label for="toggle" class="theme-toggler settings-option" id="theme-toggler">
							<input type="checkbox" id="toggle" class="theme-toggler__checkbox" checked />
							<span aria-hidden="true" class="theme-toggler__switch"></span>
						</label>	
				</label><p></p>
				<form class="light" action="AdminForm" method="post">
					<label for="add_promo" class="label__admin"><b>Добавить промокод:</b>
        				<input class="input__admin" colspan="3" align = "right" type="text" name="add_promo" id="add_promo" value="${add_promo}" placeholder="Введите промокод"><p></p>
					</label><p></p>

		       		<p class="label__admin"><b>Дополнительные услуги:</b></p>
     	        	<p><label class="label__admin" id="func">
     	        	<input class="radio__admin" name="services" id="services1" type="radio"  value= "on" checked onchange="localStorage.setItem('services',1)">Включить</p> 
		        	<p><label class="label__admin" id="func">
		        	<input class="radio__admin" name="services" id="services2" type="radio"   value= "off" onchange="localStorage.setItem('services',0)">Выключить</p>

		        	<input class="btn__login" type="submit" name="save_settings" value="Сохранить"> 
		        </form>
		           	
            </div>
        </div>
    </div>

</body>
</html>