package codeforGPAconverter;
import java.util.Scanner;

public class codeforGPAconverter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double numberGrade= 0.0;
		double plusConvertion = numberGrade + 0.3;
		double minusConvertion = numberGrade - 0.3;

		int exitPlease = 1; 
		while(exitPlease != 0) {

			System.out.print("Please Enter your letter grade:" );
			String letterGrade= in.next(); 
			switch (letterGrade) {
			case "A+": 
				numberGrade = 4;
				System.out.println(numberGrade+plusConvertion);
				break;
			case "A":
				numberGrade = 4;
				System.out.println(numberGrade);
				break;
			case "A-":
				numberGrade = 4;
				System.out.println(numberGrade+minusConvertion);
				break;
			case "B+":
				numberGrade = 3;
				System.out.println(numberGrade+plusConvertion);
				break;
			case "B":
				numberGrade = 3;
				System.out.println(numberGrade);
				break;
			case "B-":
				numberGrade = 3;
				System.out.println(numberGrade+minusConvertion);
				break;
			case "C+":
				numberGrade = 2;
				System.out.println(numberGrade+plusConvertion);
				break;
			case "C":
				numberGrade = 2;
				break;
			case "C-":
				numberGrade = 2;
				System.out.println(numberGrade+minusConvertion);
				break;
			case "D+":
				numberGrade = 1;
				System.out.println(numberGrade+plusConvertion);
				break;
			case "D":
				numberGrade = 1;
				break;
			case "D-":
				numberGrade = 1;
				System.out.println(numberGrade+minusConvertion);
				break;
			case "F":
				System.out.println("0");
				break;
			case "Q":
				System.out.print("Program Closed.");
				exitPlease = 0;
				break;
			default: 
				System.out.println("Incorrect Input");
				break;
			}
		}
		in.close();
	}
}
