import java.util.Scanner;

public class SineLaw {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please Enter the first side: ");
        double a = keyboard.nextDouble();
        System.out.println("Please Enter the second side: ");
        double b = keyboard.nextDouble();
        System.out.println("Please Enter the Angle: ");
        double angle = keyboard.nextDouble();

        // sinA/a = sinB/b
        double thirdSide = Math.asin(a * Math.sin(Math.toRadians(angle)) / b);
        
        System.out.println("The Measurement of the third side is: " + Math.toDegrees(thirdSide));
        keyboard.close();

    }

}
