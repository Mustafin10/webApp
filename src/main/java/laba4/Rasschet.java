package laba4;

public class Rasschet {
	
	protected static int c;
	protected static int cdu;
	protected static double p;
	protected static String kod;
	
	protected static int calcul () {
		
		int v = Integer.parseInt(UserForm.v2);
		int g = 0;
		//int ves = Integer.parseInt(UserForm.ves);
		//double s = SelectionCity.gorod();
		int c0 = Integer.parseInt(UserForm.c0);
		int cdu = Integer.parseInt(UserForm.x) + Integer.parseInt(UserForm.y);
		//int cupk = RasschetUpak.upak();
		//String pom = UserForm.p21;
		
		

		c = (int) Math.ceil((((g * 1) * ((/*s **/ 15) + (v * 100) + c0 * 0.2)) + /*cupk*/ + cdu) * p);
		return c;
	}
}

