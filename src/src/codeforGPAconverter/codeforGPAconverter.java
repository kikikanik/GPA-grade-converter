package codeforGPAconverter;
import java.util.Scanner;

public class codeforGPAconverter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please Enter your letter grade:" );
		String letterGrade= in.next(); 
			switch (letterGrade) {
			case "A+": 
				System.out.println("4.3");
				break;
			case "A":
				System.out.println("4");
				break;
			case "A-":
				System.out.println("3.7");
				break;
			case "B+":
				System.out.println("3.3");
				break;
			case "B":
				System.out.println("3");
				break;
			case "B-":
				System.out.println("2.7");
				break;
			case "C+":
				System.out.println("2.3");
				break;
			case "C":
				System.out.println("2");
				break;
			case "C-":
				System.out.println("1.7");
				break;
			case "D+":
				System.out.println("1.3");
				break;
			case "D":
				System.out.println("1");
				break;
			case "D-":
				System.out.println(".7");
				break;
			case "F":
				System.out.println("0");
				break;
			case "Q":
				System.out.println("Closing Program.");
				java.lang.System.exit(0);
				break;
			default: 
				System.out.println("Incorrect Input");
				break;
			}
		
		in.close();
	}

}
