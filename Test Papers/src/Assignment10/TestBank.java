package Assignment10;

import java.util.Random;
public class TestBank extends Test{
	 private int availableQuestions;
	    private Random random;
	    private ObjectiveQuestion[] questions;
	    
	public TestBank(ObjectiveQuestion[] lol) {
		super(lol);
		questions = lol;
		availableQuestions = lol.length;
		random = new Random();
	}
	
	
    public void generateRandomTest(int numberOfQuestions) {
        if (numberOfQuestions < 0 || numberOfQuestions > questions.length) {
            System.out.println("Invalid number of questions. The test will contain all " + questions.length + " questions.");
            numberOfQuestions = questions.length;
        }

        ObjectiveQuestion[] randomQuestions = new ObjectiveQuestion[numberOfQuestions];
        for (int i = 0; i < numberOfQuestions; i++) {
            int randomIndex = random.nextInt(questions.length - i);
            randomQuestions[i] = questions[randomIndex];
            questions[randomIndex] = questions[questions.length - i - 1];
        }
        super.questions = randomQuestions;
        super.totalPoints = super.calculateTotalPoints();
    }
	
	
	
	
}