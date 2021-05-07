<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="resources/css/light-mode.css" id="themes">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Ubuntu:wght@700&display=swap" rel="stylesheet">
<link rel="stylesheet" href="resources/css/style.css">
<title> Калькулятор автотранспортных перевозок </title>
<style>

	#info{
        width: auto; /*  Ширина и высота окна*/
        height: auto;
        padding: 0px 10px;
		display: none;
        border: 4px solid #fff;
        position: absolute;
        top: auto;

		
        right: auto;
        left: auto;
        margin-left: 23pc;
        margin-top: 3pc;
      }
    
   
	#info:target {
        display: block;
    }
         
</style>
     
<script >
function adm() {

	var selectElem = document.getElementById('city')
	var pElem = document.getElementById('p')

	// Когда выбран новый элемент <option>
	  var address = selectElem.selectedIndex;
	  // Добавить данные в <p>
	  if(address==1){
		  pElem.innerHTML = 'Адрес доставки: ул.Кувыкина, д.49';
		  localStorage.city = "1";
	  } if(address==2){
		  pElem.innerHTML = 'Адрес доставки: ул.Мологвардейцев, д.30';
		  localStorage.city = "2";
	  }
	  if(address==3){
		  pElem.innerHTML = 'Адрес доставки: ул.Гукина, д.26';
		  localStorage.city = "3";
	  }
	  if(address==4){
		  pElem.innerHTML = 'Адрес доставки: ул.Коммунистическая, д.25';
		  localStorage.city = "4";
	  }
	  if(address==5){
		  pElem.innerHTML = 'Адрес доставки: ул.Карла-Маркса, д.118';
		  localStorage.city = "5";
	  }
}
</script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.4.1/jspdf.min.js">
</script>
    
<script src="https://code.jquery.com/jquery-2.2.4.min.js">
</script>

</head>
<body>
    
    <header class="header__calc">
        <div class="container">
            <div class="header__inner__calc">
                <div class="header__logo__calc">LabMain.</div>
                
                <nav class="nav__calc">
                    <a class="nav__link" href="infoForm.jsp">Описание</a>
                    <a class="nav__link" href="#info">Разработчики</a>
                    <a class="nav__link" href="CreatePdf" method="get">Выгрузить в PDF</a>
                    <a class="nav__link" href="formAutorization.jsp">Авторизация</a>
                </nav>
            </div>
        </div>
    </header>
    

    <div class="intro__calc">
        
        <div class="container">
            <div class="intro__inner__calc">
                <h1 class="intro__title__calc">Калькулятор автотранспортных перевозок</h1>
            </div>
        
            <div class="container__calc">
        <form action="UserForm" method="post">
			<label class="label__calc" for="first">Пункт приёма: 
        		<input class="input__calc" colspan="3" align = "right" type="text" name="label1" value="Уфа, ул.Трамвайная, 2" disabled tabindex="1"><p></p>
			</label>
		
			<label class="label__calc" for="label2">Город доставки:
				<select name="city" class="disign__select" id="city" value = "${city}" onchange="adm()" tabindex="2" required>
					<option selected disabled value=""><a href="#">Выберите город</a></option>
					<option value="1"><a href="#">Октябрьский</a></option>
					<option value="2"><a href="#">Салават</a></option>
					<option value="3"><a href="#">Ишимбай</a></option>
					<option value="4"><a href="#">Бирск</a></option>
					<option value="5"><a href="#">Стерлитамак</a></option>
				</select>
			</label><p></p>
		
			<p id="p" class="label__calc">Адрес доставки:</p>
			<label class="label__calc" for="label4">Объем груза (Куб.м):
       	    	<input class="input__calc" colspan="3" align = "right" type="text" name="v2_c" id="v2_c" value="${v2_c}" placeholder="Введите объем" tabindex="3" maxlength="3" required pattern="(^[1-9](\d*)?([.]\d+)?)|(^0[.](\d*)?(?=[1-9])\d+)"><p></p>
			</label>
		
			<label class="label__calc" for="label5">Вес груза (кг):
      			<input class="input__calc" colspan="3" align = "right" type="text" name="ves_c" id="ves_c" value="${ves_c}" placeholder="Введите вес" tabindex="4" maxlength="5" required pattern="(^[1-9](\d*)?([.]\d+)?)|(^0[.](\d*)?(?=[1-9])\d+)"><p></p>
			</label>
		
			<label class="label__calc" for="label6">Способ упаковки:
        		<select name="upak" class="disign__select" id="upak" value="${upak}" tabindex="5" required>
					<option selected="selected" disabled>Выберите способ</option>
					<option value="1">Не требуется</option>
					<option value="2">Жесткая</option>
					<option value="3">Мягкая</option>
					<option value="4">Паллетный борт</option>
				</select>
			</label><p></p>
		
			<label class="label__calc" for="label7">Объявленная стоимость: 
        		<input class="input__calc" colspan="3" align = "right" type="text" name="c0" id="c0" value="${c0}" placeholder="Введите стоимость" tabindex="6" maxlength="6" required pattern="(^[1-9](\d*)?([.]\d+)?)|(^0[.](\d*)?(?=[1-9])\d+)"><p></p>
			</label>
		
			<label class="label__calc" for="label8">Промокод:
        		<input class="input__calc" colspan="3" align = "right" type="text" name="promo" id="promo" value="${promo}" placeholder="Введите промокод" tabindex="7" maxlength="10" onchange="localStorage.promo=this.setItem('promo')" ><p></p>
        		<p class="check__promo">${checkprom}</p>
			</label>
		
			<p align="left" class="label__calc">Режимный груз: :<input class="disign__checkbox" type="checkbox"  name="gruz" id="gruz" value= "${gruz}" onchange="localStorage.gruz=this.setItem('gruz')"> </p> 
			<p align="left" class="label__calc"> Возврат пакета документов: <input class="disign__checkbox" type="checkbox"  id="document" name="document" value= "${document}" onchange="localStorage.doc=this.setItem('document')"></p> 
		
			<label class="disign__stoim" for="label9">Стоимость:
        		<input class="input__calc" colspan="3" type="text" name="stoim" id="stoim" value="${stoim}" disabled><p></p>
			</label>
		
            <input class="btn" type="submit" name="calc" value="Рассчитать">
        </form>
            </div>
        </div>
        
        <div id="info">
            <div>
				<a href="#">&#215;</a>
			</div>
            <div class="info__inner__calc">
	 		<tr><td>
            <p>Разработчики:</p></td>
	 	 <tr><td>
	  		<p>Ефимов Иван Сергеевич<br>
				Золин Кирилл Иванович<br>
				Макаров Егор Вениаминович<br>
				Мустафин Даниил Эдуардович</p> 
			</td></tr>
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
<script>

if(localStorage.services==0) {
	document.getElementById("gruz").disabled = true;
	document.getElementById("document").disabled = true;
}else{
	document.getElementById("gruz").disabled = false;
	document.getElementById("document").disabled = false;
}
</script>
</body>
</html>