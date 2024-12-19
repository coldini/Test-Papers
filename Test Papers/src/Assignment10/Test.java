package Assignment10;


import java.io.FileWriter;
import java.io.IOException;




public class Test{
	protected ObjectiveQuestion[] questions;
	protected double totalPoints;
	
	
	public Test( ObjectiveQuestion[] l) {
		questions = l;
		totalPoints = this.calculateTotalPoints();
		
		
	}
	
	public double calculateTotalPoints(){
		double puntos = 0;
		for( int i = 0; i < questions.length; i++ ) {
			puntos += questions[i].getPoints();;
		}
		return puntos;
	}
	
	public double getTotalPoints() {
		return totalPoints;
	}
	
	public ObjectiveQuestion[] getQuestions(){
		return questions;
		}
	
	public String makeTest() {
		String test = " ";
		for(int i = 0; i < questions.length; i++) {
			if(questions[i] instanceof FillintheBlank) {
				
			  test += "Question: " + (i+1) + "\n" +  questions[i].toStringObjStud() + "\n";
			}else if(questions[i] instanceof MultipleChoiceQuestion){
       test += "Question: " + (i+1) + "\n" + ((MultipleChoiceQuestion)questions[i]).toStringMultiChoice() + "\n";
      }
     
			
			
		}
    return test;
	}


  public String makeAnswerKey(){
    String key = " ";
    for(int i = 0; i < questions.length; i++) {
      if(questions[i] instanceof MultipleChoiceQuestion){
        key += "Question: " + (i+1) + "\n" +  ((MultipleChoiceQuestion)questions[i]).toStringMultiCorrect() + "\n";
      }else if(questions[i] instanceof FillintheBlank){
        key += "Question: " + (i+1)+ "\n" + ((FillintheBlank)questions[i]).toStringFillCorrect() + "\n";
      }
      
  } 

    return key;

  }
  
 
  public void writeFile(String test, String file) throws IOException {
		 FileWriter lol = new FileWriter(file);
		 lol.write(test);
		 lol.close();
		 
	 }

}
