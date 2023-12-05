package task3;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizApp 
{
	private static Quiz quiz;

    public static void main(String[] args) 
    {       
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the capital of India?", new String[]{"Mumbai", "New Delhi", "Kolkata", "Chennai"}, 1));
        questions.add(new Question("Which programming language is known as the 'mother of all languages'?", new String[]{"Java", "Python", "C", "Assembly"}, 2));
        questions.add(new Question("Who was the first Prime Minister of India?", new String[]{"Jawaharlal Nehru", "Sardar Patel", "Indira Gandhi", "Lal Bahadur Shastri"}, 0));
        questions.add(new Question("Which of the following is a front-end framework?", new String[]{"Spring", "Angular", "Hibernate", "Node.js"}, 1));
        questions.add(new Question("What is the national currency of Japan?", new String[]{"Yen", "Rupee", "Baht", "Dollar"}, 0));
        questions.add(new Question("Which Java collection class is synchronized by default?", new String[]{"ArrayList", "LinkedList", "HashMap", "Vector"}, 3));
        questions.add(new Question("Which Indian city is famous for its IT industry and is known as the 'Silicon Valley of India'?", new String[]{"Mumbai", "Bangalore", "Chennai", "Hyderabad"}, 1));
        questions.add(new Question("Which of the following is a relational database management system?", new String[]{"MongoDB", "MySQL", "Redis", "Elasticsearch"}, 1));
        questions.add(new Question("Which country is located both in Europe and Asia?", new String[]{"Spain", "Russia", "Turkey", "Canada"}, 1));
        questions.add(new Question("Pune is often referred to as the 'Oxford of the East' due to its prominence in which field?", new String[]{"IT Industry", "Education and Research", "Agriculture", "Manufacturing"}, 1));
        
        quiz = new Quiz(questions);

        startQuiz();
    }

    private static void startQuiz() 
    {
        Scanner scanner = new Scanner(System.in);

        while (quiz.hasNextQuestion()) 
        {
            displayQuestion();
            int selectedOption = scanner.nextInt();
            checkAnswer(selectedOption);
            quiz.nextQuestion();
        }

        endQuiz();
    }

    private static void displayQuestion() 
    {
        Question currentQuestion = quiz.getCurrentQuestion();
        System.out.println(currentQuestion.getQuestionText());

        String[] options = currentQuestion.getOptions();
        for (int i = 0; i < options.length; i++) 
        {
            System.out.println((i + 1) + ". " + options[i]);
        }

        System.out.print("Your choice: ");
    }

    private static void checkAnswer(int selectedOption) 
    {
        Question currentQuestion = quiz.getCurrentQuestion();
        if (currentQuestion.isCorrect(selectedOption - 1)) 
        {
            quiz.incrementUserScore();
            System.out.println("Correct!\n");
        } else 
        {
            System.err.println("Incorrect. The correct answer is: " + (currentQuestion.getCorrectOption() + 1) + ". " + currentQuestion.getOptions()[currentQuestion.getCorrectOption()] + "\n");
        }
    }

    private static void endQuiz() 
    {
        System.out.println("Quiz completed. Your score: " + quiz.getUserScore() + "/" + quiz.questions.size());
    }
}
