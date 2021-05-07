package laba4;

	public class RasschetUpak /*extends Calc */{

		public static int u;
		public static int cupk;
		
		public static int upak () {
			
			String upak1 = UserForm.upak1;
			int v = Integer.parseInt(UserForm.v2);
			
			switch (upak1) {
			case "1":
				u=0;
				break;
			case "2":
				u=10;
				break;
			case "3":
				u=20;
				break;
			case "4":
				u=30;
				break;
			}
			
			//cupk=Calc.Up(v, u);
			return cupk;

	}
}
