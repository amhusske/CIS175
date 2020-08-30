import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GradesHusske {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter test name");
		
		String testName = in.nextLine();
		
		System.out.println("How many scores would you like to enter? ");
		
		int numOfScores = in.nextInt();
		ArrayList<Double> listOfScores = new ArrayList<>();
		
		int counter=0;
		while(counter < numOfScores) {
			System.out.println("Please enter a score");
			double score = in.nextDouble();
			listOfScores.add(score);
			counter++;
		}

		
		GradeBook myGrades = new GradeBook(testName, listOfScores);
		ArrayList<Double>scores = myGrades.getScoreList();
		ArrayList<String>letters = myGrades.getLetterGrades();
	
	
		System.out.println("Test Name: " + myGrades.getTestName());
		System.out.println("Score -------- Grade");
	
		int listSize = myGrades.getScoreList().size();
	
	
		for(int c=0; c <listSize; c++ ) {
			System.out.println(" " + scores.get(c) + " -------- " + letters.get(c));
			}
	
	}
	
	
}
