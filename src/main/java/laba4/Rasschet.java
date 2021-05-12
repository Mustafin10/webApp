package laba4;

public class Rasschet {
	
	protected static int c;
	protected static int cdu;
	protected static double p;
	protected static String kod;
	
	protected static int calcul () {
		
		int v = Integer.parseInt(UserForm.v2);
		int g = 0;
		int ves = Integer.parseInt(UserForm.ves);
		double s = SelectionCity.gorod();
		int c0 = Integer.parseInt(UserForm.c0);
		int cdu = Integer.parseInt(UserForm.x) + Integer.parseInt(UserForm.y);
		int cupk = RasschetUpak.upak();
		String pom = UserForm.p21;
		Sting gt = AdminForm.gt;
		
		if (pom.equals("2020")) {
			p = 0.92;
			kod="1";
		} else if (pom.equals(gt)){
			p = 0.9;
		}
		else {
			p = 1;
			kod="0";
		}
		
		
		while (ves > 0 ||  v > 0) {
			ves = ves - 1500; 
			v = v - 9;
			g = g + 1;
		}

		c = (int) Math.ceil((((g * 1) * ((s * 15) + (v * 100) + c0 * 0.2)) + cupk + cdu) * p);
		return c;
	}
}

