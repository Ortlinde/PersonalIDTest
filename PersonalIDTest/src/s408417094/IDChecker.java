package s408417094;

import java.util.Scanner;
import s408417094.tools.*;

public class IDChecker {

	public static void main(String[] args) {
		
		String inputStr;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter \'exit\' to Exit.");
		System.out.println("--------------------");
		
		while(true) {
			System.out.print("Your ID: ");
			
			inputStr = sc.next();
			if(inputStr.toLowerCase().equals("exit"))
				break;
			
			System.out.println("Your ID is: " + inputStr + "\n");
			System.out.println(
					Checker.isValid(inputStr) ? "ID is valid!":"ID is invalid!"
			);
			System.out.println("--------------------");
		}
		
		System.out.println("\nProcess Finished.");
		
		sc.close();
	}

}
