import java.util.Scanner;

public class PIApproximation {
    
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        while(true){
            System.out.println("Please enter an n value:");
            double n = keyboard.nextDouble();
            keyboard.nextLine();

            double sum = 0;

            for(int i=0;i<=n;i++){
                sum += Math.pow(-1,i) / (2*i + 1);
            }
            System.out.println("The Approximation of PI is: " + (4 * sum));
            System.out.println("Would you like to try again? [y/n]");
            char response = keyboard.next().toLowerCase().charAt(0);

            if (response == 'n'){
                break;
                }
            }
        keyboard.close();
        }
}
