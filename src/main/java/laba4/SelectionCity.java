package laba4;

public class SelectionCity {
public static double s=0;
	
	protected static double gorod() {
		
		String gorod = UserForm.gorod;
		
		switch (gorod) {
		case "1":
			s=189;
			break;
		case "2":
			s=169;
			break;
		case "3":
			s=163;
			break;
		case "4":
			s=94.5;
			break;
		case "5":
			s=139;
			break;
		}
		
		return s;
		
	}

}
