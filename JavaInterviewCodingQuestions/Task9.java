package JavaInterviewCodingQuestions;

public class Task9 {
    public static void main(String[] args) {

        //Check whether an alphabet is Vowel or Consonant

        //Question: Check whether an alphabet is Vowel or Consonant

        char ch='c';

        if (ch=='a' || ch== 'e' || ch=='i' || ch=='o' || ch=='u' ) {
            System.out.println(ch + " is vowel");
        } else {
            System.out.println(ch +" is consonont");
        }

        //second way
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;

            default:
                System.out.println(ch +" is consonont");
                break;

        }
    }
}
