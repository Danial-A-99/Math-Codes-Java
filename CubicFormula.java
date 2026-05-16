import java.util.Scanner;

public class CubicFormula {
    
        public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("---------------------- Welcome To The Cubic Formula Calculator ----------------------");
        System.out.println("-------------------------------- ax^3 + bx^2 + cx + d --------------------------------");

        System.out.println("Please Enter the a value: ");
        double a = keyboard.nextDouble();
        System.out.println("Please Enter the b value: ");
        double b = keyboard.nextDouble();
        System.out.println("Please Enter the c value: ");
        double c = keyboard.nextDouble();
        System.out.println("Please Enter the d value: ");
        double d = keyboard.nextDouble();

        double p = (3 * a * c - b * b) / 3 * a * a;
        double q = (27 * a * a * d - 9 * a * b * c + 2 * b * b * b) / 27 * a * a * a;
        double theta = Math.acos(-q / (2 * Math.sqrt(-Math.pow(p / 3.0, 3)))) / 3.0;
        double xOne = 2 * Math.sqrt(-p / 3) * Math.cos(theta) - b / 3 * a;
        double xTwo = 2 * Math.sqrt(-p / 3) * Math.cos(theta + 2 * Math.PI / 3) - b / 3 * a;
        double xThree = 2 * Math.sqrt(-p / 3) * Math.cos(theta + 4 * Math.PI / 3) - b / 3 * a;

        System.out.println("The values for x1, x2, and x3 are: " + xOne + ", " + xTwo + ", " + xThree);

        keyboard.close();
    }
}
