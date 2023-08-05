import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int result;
        int totalMark=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Exam");
        Question q = new Question("what is capacity of oman: (Muscat, Suhar, Nizwa)","Muscat",2);
        System.out.println(q.question);
        String answerOfQuestion1 = scanner.next();

        ArrayList<Question> quesArray = new ArrayList<>();
        quesArray.add(q);

        Question q1 = new Question("1 + 2 = ","3",2);
        System.out.println(q1.question);
        int answerOfQuestion2 = scanner.nextInt();

        ArrayList<Question> quesArray2 = new ArrayList<>();
        quesArray.add(q1);

        for (int i = 0; i < quesArray.size(); i++) {
            if (quesArray.get(i).answer == answerOfQuestion1)
            {
                totalMark += q.result;
            }
            if (quesArray.get(i).answer != answerOfQuestion1)
            {
                totalMark =0;
            }
        }

//        if(answerOfQuestion1.equals("Muscat") && answerOfQuestion2 == 3)
//        {
//            totalMark = q.result +q1.result;
//            System.out.println("The Total Mark is: "+totalMark);
//        }
//        else if(answerOfQuestion1.equals("Muscat") && !(answerOfQuestion2 == 3))
//        {
//            q.result = 2;
//            q1.result = 0;
//
//            totalMark = q.result +q1.result;
//            System.out.println("The Total Mark is: "+totalMark);
//        }
//        else if(!answerOfQuestion1.equals("Muscat") && (answerOfQuestion2 == 3))
//        {
//            q.result = 0;
//            q1.result = 2;
//
//            totalMark = q.result +q1.result;
//            System.out.println("The Total Mark is: "+totalMark);
//        }
//        else if(!(answerOfQuestion1.equals("Muscat")) && !(answerOfQuestion2 == 3))
//        {
//            q.result = 0;
//            q1.result = 0;
//
//            totalMark = q.result +q1.result;
//            System.out.println("The Total Mark is: "+totalMark);
//        }
    }
}

class Question{
    String question;
    String answer;
    int result;

    public Question(String question, String answer, int result) {
        this.question = question;
        this.answer = answer;
        this.result = result;
    }

    void questionsDisplay(){

    }

}