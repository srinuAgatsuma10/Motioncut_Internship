import java.util.*;

class Question {
	private String questionText;
	private String[] options;
	private int correctOptionIndex;

	public Question(String questionText, String[] options, int correctOptionIndex) {
		this.questionText = questionText;
		this.options = options;
		this.correctOptionIndex = correctOptionIndex;
	}

	public String getQuestionText() {
		return questionText;
	}

	public String[] getOptions() {
		return options;
	}

	public boolean isCorrect(int selectedOption) {
		return selectedOption == correctOptionIndex;
	}
}

class Quiz {
	private List<Question> questions;
	private int score;

	public Quiz(List<Question> questions) {
		this.questions = questions;
		this.score = 0;
	}

	public void start() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Country Capitals Quiz!");
		System.out.println("====================================");

		for (Question question : questions) {
			System.out.println(question.getQuestionText());
			String[] options = question.getOptions();
			for (int i = 0; i < options.length; i++) {
				System.out.println((i + 1) + ". " + options[i]);
			}

			System.out.print("Enter your answer (1-" + options.length + "): ");
			int selectedOption = scanner.nextInt();

			if (question.isCorrect(selectedOption - 1)) {
				System.out.println("Correct!");
				score++;
			} else {
				System.out.println("Incorrect!");
			}
			System.out.println();
		}

		System.out.println("Quiz complete!");
		System.out.println("Your score: " + score + "/" + questions.size());
		scanner.close();
	}
}

public class QuizApplication {
	public static void main(String[] args) {
		List<Question> questions = new ArrayList<>();
		questions.add(new Question("What is the capital of India?", 
				new String[]{"New Delhi", "Andhra Pradesh", "Rajasthan", "Jaipur"}, 0));
		questions.add(new Question("What is the capital of Japan?", 
				new String[]{"Tokyo", "Beijing", "Seoul", "Bangkok"}, 0));
		questions.add(new Question("What is the capital of France?", 
				new String[]{"Paris", "London", "Berlin", "Rome"}, 0));
		questions.add(new Question("What is the capital of USA?", 
				new String[]{"Washington, D.C", "California", "New York", "Texas" }, 0));
		questions.add(new Question("What is the capital of UK?", 
				new String[]{"London", "England", "Scotland", "Wales" }, 0));

		Quiz quiz = new Quiz(questions);
		quiz.start();

	}
}

