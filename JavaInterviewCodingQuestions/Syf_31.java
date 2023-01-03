package JavaInterviewCodingQuestions;

public class Syf_31 {
    public static void main(String[] args) {
        int num = 34;
        boolean flag = false;

        for (int i = 2; i < num/2 ; i++) {

            if (asalMI(i)) {
                if (asalMI(num - i)) {
                    System.out.println((num - i) + "+" + i + "=" + num);
                    flag = true;

                }


            }

        }
        if (!flag) System.out.println("sayıda asal sayı yok");

    }

    private static boolean asalMI(int num) {

        boolean flag = true;
        for (int i = 2; i < num / 2; i++) {

            if (num % i == 0) {
                flag = false;
                break;
            }

        }

        return flag;
    }
}
