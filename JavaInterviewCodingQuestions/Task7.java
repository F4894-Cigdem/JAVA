package JavaInterviewCodingQuestions;

public class Task7 {
    public static void main(String[] args) {

        //Swap Number (Second way)
        //without temp

        int a=10;
        int b=20;

        System.out.println("Before swapping: ");
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);

        System.out.println("After swapping: ");

        a=a-b;
        b=a+b;
        a=b-a;

        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);









    }
}
