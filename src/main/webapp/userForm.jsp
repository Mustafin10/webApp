<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
</head>
<body>
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
</body>
</html>