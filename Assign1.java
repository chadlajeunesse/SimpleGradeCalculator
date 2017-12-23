import java.util.Scanner;
import java.text.DecimalFormat;

/*
 * Author: Chad Lajeunesse
 * CST8110 - Introduction to Computer Programming
 * Section: 301
 * Prof: Howard Rosenblum
 * Assignment # 1
 * Date: September 22 2017
 * Purpose: Calculate your final mark based on the weighting of the course outline. 
 */

public class Assign1 {
	public static void main(String[] args) {
		
		double labActivityMark, assignmentMark, hybridMark, quizMark, practicalAssessmentMark, finalExamMark, practicalGrade, theoryGrade, finalGrade;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Welcome to the CST8110 Final Mark Calculator%n%n");
		
		/*
		 * USER INUT 
		 */
		System.out.print("Enter your Lab Activity(ies) mark out of 10: ");
		labActivityMark = keyboard.nextDouble();
		
		System.out.print("Enter your Assignment(s) mark out of 20: ");
		assignmentMark = keyboard.nextDouble();
		
		System.out.print("Enter your Hybrid Assignment(s) mark out of 5: ");
		hybridMark = keyboard.nextDouble();
		
		System.out.print("Enter your Quiz(zes)/Test(s) mark out of 25: ");
		quizMark = keyboard.nextDouble();
		
		System.out.print("Enter your Practical Assessment(s) mark out of 10: ");
		practicalAssessmentMark = keyboard.nextDouble();
		
		System.out.print("Enter your Final Exam mark out of 30: ");
		finalExamMark = keyboard.nextDouble();
		System.out.printf("%n%n");
		
		keyboard.close();
		
		/*
		 * GRADE CALCULATION
		 */
		practicalGrade = ((labActivityMark + assignmentMark) / 30 * 100);
		
		theoryGrade =  ((quizMark + practicalAssessmentMark + finalExamMark) / 65 * 100);
		
		finalGrade = labActivityMark + assignmentMark + hybridMark + quizMark + practicalAssessmentMark + finalExamMark;
		
		
		/*
		 * GRADE OUTPUT SETUP
		 */
		DecimalFormat form = new DecimalFormat("#.##");
		
		/*
		 * GRADE OUTPUT
		 */
		System.out.println("Practical grade: " +  form.format(practicalGrade) + "%");
		System.out.println("Theory grade: " + form.format(theoryGrade) + "%");
		System.out.println("Calculated final grade: " +  form.format(finalGrade) + "%");
	}
}
