import java.util.Scanner;

public class CosineLaw {

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please Enter the first side: ");
        double a = keyboard.nextDouble();
        System.out.println("Please Enter the second side: ");
        double b = keyboard.nextDouble();
        System.out.println("Please Enter the Angle: ");
        double angle = keyboard.nextDouble();

        // a^2 = c^2 + b^2 - 2bcCosA
        double thirdSide = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(angle)));
        
        System.out.println("The Length of The Third Side is: " + Math.toDegrees(thirdSide));
        keyboard.close();

    }

}
