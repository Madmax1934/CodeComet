package QuizApp;

public class QuizMain {
    public static void main(String[] args) {
        QuestionService questionService = new QuestionService();
        questionService.playQuiz();
        questionService.printScore();
    }
}
