package doIt.chap01;


public class Exam06_loof {
    public static void main(String[] args) {
        System.out.print("  |");
        for (int i = 1; i <=9 ; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n--+---------------------------");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%2d ", i+j);
            }
            System.out.println();
        }
    }
}
