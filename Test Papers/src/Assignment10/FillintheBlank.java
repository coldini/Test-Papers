package Assignment10;

import Assignment10.FillintheBlank;
import Assignment10.ObjectiveQuestion;
import Assignment10.MultipleChoiceQuestion;
public class FillintheBlank extends ObjectiveQuestion{
	
	public FillintheBlank(double words, int are, int getting, String weird, String write) {
		super(words, are, getting, weird, write);
	}
	
	  public String correctRepresent(String mum) {
	      String m = "_";
	      String dud = mum;
	      String removal = this.getText();
	      String loopie = this.getCorrectAns();  

	     
	      dud = dud.replaceAll(m, "__" + loopie + "__");
	      
	      String cleanedText = removal.replaceAll(m, "");

	      String empty = dud + " " + cleanedText;
	     
	      return empty;
	  }
	
	public String toStringFillCorrect() {
		
		
		String loopie = correctRepresent(this.getCorrectAns());
		
		String betterWays = "Question: " + this.getText() + "\n";
		betterWays+= "Amount of Points: " + this.getPoints() + " \n";
		betterWays += "Difficulty of question: " + this.getDiff() + " \n";
		betterWays += "Answer space: " + this.getAnsSpace() + " \n";
		betterWays  += "CORRECT ANSWER: " + loopie + " \n";
		return betterWays;
		
		
	}
	
	
	
	
}