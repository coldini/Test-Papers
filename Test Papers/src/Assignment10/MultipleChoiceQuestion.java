package Assignment10;

import java.util.Random;
public class MultipleChoiceQuestion extends ObjectiveQuestion{
	
	private String possibleAnswers[];
	private int correctAnsInd;
	
	public MultipleChoiceQuestion(double I, int j, int lol, String loco, String woop, String[] help, int c) {
		super(I,j,lol,loco,woop);
		
		possibleAnswers = new String[help.length + 1];
		correctAnsInd = c;
		
		 for (int i = 0, man = 0; i < possibleAnswers.length; i++) {
	            if (i == correctAnsInd) {
	                possibleAnswers[i] = woop; 
	            } else {
	                possibleAnswers[i] = help[man++]; 
	            }
	        }
	}
	
	public String getPossibleAnswers() {
	
		String aprehend = " ";
		for(int i = 0; i < possibleAnswers.length; i++) {
			aprehend += possibleAnswers[i] + " \n";
		}
		
		return aprehend;
		
	}
	
	
	
	public String toStringMultiChoice(){
		String nuuh = " ";
		nuuh = "Question: " + this.getText() + " \n";
		nuuh += "Points: " + this.getPoints() + " \n";
		nuuh +="Difficulty: " + this.getDiff() + " \n";
		nuuh += "Answer Space: " + this.getAnsSpace() + " \n";
		for(int i = 0; i < possibleAnswers.length; i++) {
			
			nuuh += i+1 + ". " + possibleAnswers[i] + " \n";
		}
		return nuuh;
	}
	
	public String toStringMultiCorrect() {
	    String result = super.toStringObjCorrect();
	    for (int i = 0; i < possibleAnswers.length; i++) {
	        if (possibleAnswers[i].equals(this.getCorrectAns())) {
	            result += (i + 1) + ". ***" + this.getCorrectAns() + "*** \n";
	        } else {
	            result += (i + 1) + ". " + possibleAnswers[i] + " \n";
	        }
	    }
	    return result;
	}
	
	
	
}