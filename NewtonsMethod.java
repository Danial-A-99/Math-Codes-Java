import java.util.Scanner;

public class NewtonsMethod {

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        final double DELTA = 0.000000000001;

        System.out.println("------------Newton's Root Approximator------------");

        do {
            System.out.println("Please Enter an initial guess:");
            double x = keyboard.nextDouble();
            keyboard.nextLine();

            while (true) {
                double funcOne = 6 * x * x * x * x - 13 * (x * x * x) - 18 * (x * x) + 7 * x + 6;
                double funcTwo = 24 * (x * x * x) - 39 * (x * x) - 36 * x + 7;
                double xFinal = x - funcOne / funcTwo;

                if (Math.abs(x - xFinal) < DELTA) {
                    System.out.println("The Approximated Root Is: " + xFinal);
                    break;
                } else {
                    System.out.println(xFinal);
                    x = xFinal;
                }
            }
            System.out.println("Do you want to try again? (yes/no)");

        } while (keyboard.next().toLowerCase().charAt(0) != 'n');

        keyboard.close();

    }
}
