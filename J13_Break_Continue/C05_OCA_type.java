package J13_Break_Continue;

public class C05_OCA_type {
    public static void main(String[] args) {
        int count = 0;
        ROW_LOOP:
        for (int row = 1; row <= 3; row++)
            for (int col = 1; col <= 2; col++) {
                if (row * col % 2 == 0) continue;
                count++;
            }
        System.out.println(count);

    }
}
