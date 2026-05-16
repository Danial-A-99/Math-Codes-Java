import java.util.Scanner;

public class HeronFormula {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please Enter the first side: ");
        double a = keyboard.nextDouble();
        System.out.println("Please Enter the second side: ");
        double b = keyboard.nextDouble();
        System.out.println("Please Enter the third side: ");
        double c = keyboard.nextDouble();

        double area = 0.25 * Math.sqrt(4 * (a * a) * (b * b) - Math.pow((a * a + b * b - c * c), 2));
        // A = 1/4sqrt(4a^2b^2-(a^2+b^2-c^2)^2)
        System.out.println("The area of the triangle is: " + area + "Units Squared");
        keyboard.close();

    }
}
