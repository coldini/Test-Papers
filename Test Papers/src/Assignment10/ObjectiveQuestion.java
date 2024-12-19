package Assignment10;

public class ObjectiveQuestion extends Question{
	
	

	private String correctAnswer;
	
	
	public ObjectiveQuestion(double puntos, int juntos, int suntos, String wuntos, String muntos) {
		
		super(puntos,juntos, suntos, wuntos);
		correctAnswer = muntos;
		
		
		
	}
	
	public String getCorrectAns() {
		return correctAnswer;
	}
	
	public String toStringObjStud() {
		String mala = " ";
		mala = "Question: " + this.getText() + " \n";
		mala+= "Amount of Points: " + this.getPoints() + " \n";
		mala += "Difficulty of question: " + this.getDiff() + " \n";
		mala += "Answer space: " + this.getAnsSpace() + " \n";
		return mala;
		
	}
	
	public String toStringObjCorrect() {
		String mala = " ";
		mala = "Question: " + this.getText() + " \n";
		mala+= "Amount of Points: " + this.getPoints() + " \n";
		mala += "Difficulty of question: " + this.getDiff() + " \n";
		mala += "Answer space: " + this.getAnsSpace() + " \n";
		mala += "CORRECT ANSWER: " + this.getCorrectAns() + " \n";
		return mala;
		
	}
	
	
}