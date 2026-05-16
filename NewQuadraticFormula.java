import java.util.Scanner;

public class NewQuadraticFormula {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please Enter the a value: ");
        double a = keyboard.nextDouble();
        System.out.println("Please Enter the b value: ");
        double b = keyboard.nextDouble();
        System.out.println("Please Enter the c value: ");
        double c = keyboard.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double xOne = (-b + Math.sqrt(discriminant)) / (2 * a);
            double xTwo = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("There are two real roots! They are: " + xOne + " and " + xTwo);
        } else if (discriminant == 0) {
            double xValue = -b / (2 * a);
            System.out.println("There is one real root! It is: " + xValue);
        } else {
            System.out.println("Sorry, There are no real roots for the given values.");
        }

        keyboard.close();

    }
}
