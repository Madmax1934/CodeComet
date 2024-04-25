package QuizApp;

import java.util.Scanner;

public class QuestionService {


    Question questions[] = new Question[5];
    String selection[] = new String[5];
    public QuestionService()
    {
        questions[0] = new Question(1,"what is fav prgrm lang?","Java","Python","C","Ruby","Java");
        questions[1] = new Question(2,"what is size of int?","4","2","8","12","4");
        questions[2] = new Question(3,"what is size of char?","4","2","8","12","2");
        questions[3] = new Question(4,"what is size of double?","4","2","8","12","8");
        questions[4] = new Question(5,"what is size of float?","4","2","8","12","4");
    }

    public void playQuiz()
    {
        System.out.println("In display Questions");
        int i=0;
        for(Question q:questions)
        {
            System.out.println("Question no: "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            selection[i++] = sc.nextLine();
        }

        for( String s: selection)
            System.out.println(s);
    }

    public void printScore()
    {
        int score=0;
        for(int i=0;i<questions.length;i++) {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if(actualAnswer.equals(userAnswer))
            {
                score++;
            }
        }
        System.out.println("Your final score is "+score);
    }
}
