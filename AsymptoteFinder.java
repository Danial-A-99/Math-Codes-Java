import java.util.Scanner;

public class AsymptoteFinder {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);   

        System.out.println("Please Enter An M value: ");
        int m = keyboard.nextInt();
        System.out.println("Please Enter And N value: ");
        int n = keyboard.nextInt();

        if (m == n){
            System.out.println("The Asymptote will be horizontal.");
        }else if (n > m){
            System.out.println("The Asymptote is the x-axis.");
        }else{
            switch (m - n) {
                case 1:
                    System.out.println("The Asymptote is Linear.");
                    break;
                case 2:
                    System.out.println("The Asymptote is Quadratic.");
                    break;
                case 3:
                    System.out.println("The Asymptote is Cubic.");
                    break;
                case 4:
                    System.out.println("The Asympotote is Quartic.");
                    break;
                case 5:
                    System.out.println("The Asymptote is Quintic.");
                    break;
                case 6:
                    System.out.println("The Asymptote is Sextic.");
                    break;
                case 7:
                    System.out.println("The Asymptote is Septic.");
                    break;
                case 8:
                    System.out.println("The Aymptote is Octic.");
                    break;
                case 9:
                    System.out.println("The Asymptote is Nonic.");
                    break;
                case 10:
                    System.out.println("The Asymptote is Decic.");
                    break;
                default:
                    System.out.println("Sorry, no answer for the given difference: " + (m-n));
                    break;
            }
        }
        keyboard.close();
    }
}
