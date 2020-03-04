package gpacalc;
import java.util.Scanner;

public class GPACALC {
	public static void main(String[] args) {


		Scanner in = new Scanner(System.in); //declare Scanner
		//in.useDelimiter("\n");

		String transcript = "Course\tCredits\tGrade\tGradePoint\nName\tHours\n";
		double GPA = 0.0;
		while(true) { //while loop is now open
			String courseName= "";
			int creditHours = 0;
			String letterGrade= "";
			double numberGrade= 0.0;
			double plusConvertion = numberGrade + 0.3; //conversion for any letterGrade with + 
			double minusConvertion = numberGrade - 0.3; //conversion for any letterGrade with -
			double gradePoints = 0.0 ;
			double totalCreditHours = 0.0;
			double totalGradePoints = 0.0;

			System.out.print("Enter Course Name: ");
			courseName = in.next();
			if(courseName.equalsIgnoreCase("end")) {
				break; //once entered all classes, transcript will print
			}
			System.out.print(courseName);
			System.out.print("Enter Credit Hours: ");

			creditHours = in.nextInt();
			totalCreditHours = creditHours + totalCreditHours;
			System.out.print("Enter letter grade earned: ");
			letterGrade= in.next(); 
			switch (letterGrade) { 
			case "A+": 
				numberGrade = 4;
				double totalGrade = numberGrade+plusConvertion;
				break;
			case "A":
				numberGrade=4; 
				totalGrade = 4;
				break;
			case "A-":
				numberGrade = 4;
				totalGrade = numberGrade + minusConvertion;
				break;
			case "B+":
				numberGrade = 3;
				totalGrade = numberGrade+plusConvertion;
				break;
			case "B":
				numberGrade = 3;
				totalGrade = 3;
				break;
			case "B-":
				numberGrade = 3;
				totalGrade = numberGrade + minusConvertion;
				break;
			case "C+":
				numberGrade = 2;
				totalGrade = numberGrade+plusConvertion;
				break;
			case "C":
				numberGrade= 2;
				totalGrade = 2;
				break;
			case "C-":
				numberGrade = 2;
				totalGrade = numberGrade + minusConvertion;
				break;
			case "D+":
				numberGrade = 1;
				totalGrade = numberGrade+plusConvertion;
				break;
			case "D":
				numberGrade= 1;
				totalGrade = 1;
				break;
			case "D-":
				numberGrade = 1;
				totalGrade = numberGrade + minusConvertion;
				break;
			case "F":
				totalGrade = 0;
				break;
			default: 
				System.out.println("Incorrect Input");
				break;
			}
			gradePoints = numberGrade*creditHours;
			totalGradePoints = gradePoints + totalGradePoints;
			GPA = totalGradePoints / totalCreditHours;
			transcript = transcript + "\n" + courseName + "\t" + creditHours + "\t " + letterGrade + "\t"+ gradePoints + "\n";
		}
		System.out.println(transcript + "\n" + "GPA:" +GPA);
		in.close();
	}
}
