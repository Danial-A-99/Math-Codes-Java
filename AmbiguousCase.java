import java.util.Scanner;

public class AmbiguousCase {

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("------------Ambiguous Case Determiner------------");

        System.out.println("Please Enter the side length of a: ");
        double a = keyboard.nextDouble();
        System.out.println("Please Enter the side length of b: ");
        double b = keyboard.nextDouble();
        System.out.println("Please Enter the value for angle A: ");
        double angle = keyboard.nextDouble();

        double h = b * Math.sin(Math.toRadians(angle));

        if (angle <= 90) {
            if (a < h) {
                System.out.println("There are no possible triangles.");
            } else if (a == h) {
                System.out.println("There is one possible right angle triangle.");
            } else if (a > b) {
                System.out.println("There is one possible triangle.");
            } else if (h < a && a < b) {
                System.out.println("There are two possible triangles. (Ambiguous Case)");
            }
        } else {
            if (a < b || a == b) {
                System.out.println("There are no possible triangles.");
            } else {
                System.out.println("There is one possible triangle.");
            }
        }

        keyboard.close();

    }
}
