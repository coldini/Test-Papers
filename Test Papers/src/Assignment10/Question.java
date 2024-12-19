package Assignment10;

public class Question{
	private double points;
	private final int MIN_DIFFICULTY = 1;
	private final int MAX_DIFFICULTY = 10;
	private int difficulty;
	private int answerSpace;
	private String questionText;
	
	public Question(double i, int j, int s, String w) {
		points = i;
		difficulty = validateIt(j);
		answerSpace = s;
		questionText = w;
		
		
	}
	
	public int validateIt(int l) {
		if(l<MIN_DIFFICULTY) {
			return MIN_DIFFICULTY;
		}else if(l>MAX_DIFFICULTY) {
			return MAX_DIFFICULTY;
		}else {
			return l;
		}
	}
	
	public double getPoints() {
	return points;
	}
	
	public int getDiff() {
	return difficulty;
	}
	
	public int getAnsSpace() {
	return answerSpace;	
	}
	
	public String getText() {
		return questionText;
		
	}
	
	@Override
	public String toString() {
		String newString = " ";
		
		newString = "Question text: " + questionText+ "\n";
		newString += "Points: " + points + "\n";
		newString += "Difficulty: " + difficulty + "\n";
		newString += "Answer Space Provided: " + answerSpace + " lines \n";
		return newString;
		
	}
	
	
	
}