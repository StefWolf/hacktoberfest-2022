public class Main {

    public static void TestQuestionOne(){
        Question1 question1 = new Question1("Stefane", 6.0,7.5,8.4);
        question1.processSituacaoFinal();
        question1.render();  
    }

    public static void TestQuestionTwo(){
        Question2 question2 = new Question2(41, 2500.00);
        question2.render();
    }

    public static void main(String[] args) {
        TestQuestionOne();
        TestQuestionTwo();
    }
}
