import java.util.ArrayList;

public class GradeBook {
private String testName;
private ArrayList<Double> scoreList;
private ArrayList<String> letterGrades;


public GradeBook() {
	super();
}


public GradeBook(String name, ArrayList<Double> scores) {
	setTestName(name);
	setScoreList(scores);
	setLetterGrades();
}


public String getTestName() {
	return testName;
}

public void setTestName(String testName) {
	this.testName = testName;
}

public ArrayList<Double> getScoreList() {
	return scoreList;
}

public void setScoreList(ArrayList<Double> scoreList) {
	this.scoreList = scoreList;
}


public ArrayList<String> getLetterGrades() {
	return letterGrades;
}


public void setLetterGrades(ArrayList<String> letterGrades) {
	this.letterGrades = letterGrades;
}

private void setLetterGrades() {
	final double MAX_SCORE = 100;
	final double GRADE_A = 90;
	final double GRADE_B = 80;
	final double GRADE_C = 70;
	final double GRADE_D = 60;

ArrayList<String> letter = new ArrayList<>();

	for (int i = 0; i < scoreList.size(); i++) {


		if(scoreList.get(i)> MAX_SCORE) {
			letter.add(i, "Out of Range");
		}
		else if (scoreList.get(i) >= GRADE_A) {
			letter.add(i, "A");
		}
		else if(scoreList.get(i)>= GRADE_B) {
			letter.add(i, "B");
		}
		else if(scoreList.get(i)>= GRADE_C) {
			letter.add(i, "C");
		}
		else if(scoreList.get(i)>= GRADE_D) {
			letter.add(i, "D");
		}
		else {
			letter.add(i, "F");
		}
	}
	
	setLetterGrades(letter);

}



}
