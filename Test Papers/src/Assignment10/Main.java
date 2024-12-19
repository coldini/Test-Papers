package Assignment10;


import java.io.IOException;

import Assignment10.FillintheBlank;
import Assignment10.MultipleChoiceQuestion;
import Assignment10.ObjectiveQuestion;
import Assignment10.Test;


public class Main{

	
	
  public static void main(String[] args) throws IOException {

    String questionBank1[] = {"5", "6", "7", "none"};
      String questionBank2[] = {"8", "9", "10", "none"};
      String questionBank3[] = {"pepper jack", "swiss", "brie", "none"};
      String questionBank4[] = {"Dark", "ghost", "ice", "none"};

      ObjectiveQuestion[] questions = new ObjectiveQuestion[9];
      questions[0] = new FillintheBlank(5, 1, 1, "___ is the capital of the US?", "Washington DC");
      questions[2] = new FillintheBlank(1.0, 1, 1, "____ lives in a pineapple under the sea?", "Spongebob Squarepants");
      questions[4] = new FillintheBlank(1.0, 1, 1, "____ is the capital of the UK?", "London");
      
     
      ObjectiveQuestion question1 = new MultipleChoiceQuestion(2.0, 1, 1, "What is 5 times 3?", "15", questionBank1, 2);
      questions[1] = question1;
      
      ObjectiveQuestion question3 = new MultipleChoiceQuestion(1.0, 1, 1, "What is 5/1", "5", questionBank2, 0);
      questions[3] = question3;
      ObjectiveQuestion question5 = new MultipleChoiceQuestion(1.0, 1, 1, "What cheese is orange", "Cheddar", questionBank3, 2);
      questions[5] = question5;
      ObjectiveQuestion question6 = new MultipleChoiceQuestion(1.0, 1, 1, "What is Gengars primary type", "Ghost", questionBank4, 3);
      questions[6] = question6;
      
      questions[7] = new FillintheBlank(5, 1, 1, "___ is considered the 'King of Rock'", "Elvis Presley"); 
      questions[8] = new FillintheBlank(5, 1, 1, "___ is the newest pokemon game", "Pokemon Scarlet/Violet");
    
 
      
      
      
      
    TestBank aid = new TestBank(questions);
    
   aid.generateRandomTest(3);
  String primaryTest =  aid.makeTest();
  System.out.println("PRIMARY TEST: " + "\n" +  primaryTest);
  System.out.println("TOTAL POINTS" + aid.getTotalPoints());
  String primaryAnsKEy = aid.makeAnswerKey();
  System.out.println("PRIMARY TEST ANS KEY: " + "\n" + primaryAnsKEy);
  
  
  
  TestBank helper = new TestBank(questions);
   helper.generateRandomTest(8);
   System.out.println("TOTAL POINTS: " + helper.getTotalPoints());
   String help1 = helper.makeTest();
   System.out.println("Helper: " + "\n" +  help1);
   String helperAnsKey = aid.makeAnswerKey();
   System.out.println("HELPER TEST ANS KEY: " + "\n" + helperAnsKey);
   
   helper.writeFile(help1, "testbank.txt");
   helper.writeFile(helperAnsKey, "testbankasw.txt");
   
    aid.writeFile(primaryTest, "testBank2.txt");
    aid.writeFile(primaryAnsKEy, "testBank2Answ.txt");
    
    Test t = new Test(questions);
   String test = t.makeTest();
   String answerKey = t.makeAnswerKey();
    
   System.out.println("TOTAL POINTS: " + t.getTotalPoints());
    System.out.println("Test: \n" + t.makeTest());
    System.out.println("ANSWER KEY: \n" + t.makeAnswerKey());
    
   
    t.writeFile(test, "Arriba.txt");
    t.writeFile(answerKey, "ArribaAns.txt");
    

    
  }
  
  
  
  
}