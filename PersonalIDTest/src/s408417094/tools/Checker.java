package s408417094.tools;

public class Checker {
	
	public static boolean isValid(String idInput) {
		if(!checker(idInput))
			return false;
		
		int verification = idInput.charAt(9) - '0';
		int cityNum = City.getEnum(idInput.charAt(0) + "").getConvert2Num();
		int ans = cityNum/10 + (cityNum%10)*9;
		
		for(int i=1; i<9; i++) {
			ans += (int)(idInput.charAt(i) - '0') * (9-i);
		}
		ans = 10 - ans%10;
		
		if(ans == verification)
			return true;
		
		return false;
	}
	
	private static boolean checker(String input) {
		if(input.length() != 10) 
			return false;
		else if(input.charAt(0) <= 'A' || input.charAt(0) >= 'Z')
			return false;
		for(int i=1; i<=10; i++) {
			if(input.charAt(i) <= '0' || input.charAt(i) >= '9')
				return false;
		}
		
		return true;
	}
}
