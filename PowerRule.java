import java.util.Scanner;
import java.util.StringTokenizer;

public class PolynomialEvaluator {

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("----------Polynomial Evaluator Code----------");

        System.out.println("Please Enter a Polynomial:");
        String polyInput = keyboard.nextLine();
        System.out.println("\nPlease Enter an X value:");
        int x = keyboard.nextInt();

        polyInput = polyInput.replace("f(x)=", "");
        StringTokenizer splitPoly = new StringTokenizer(polyInput, " ");
        double answer = 0;

        while (splitPoly.hasMoreTokens()) {
            String polyValue = splitPoly.nextToken();
            int spliLocat = polyValue.lastIndexOf("x");
            if (spliLocat == -1) {
                answer += Double.parseDouble(polyValue);
            } else {
                double exp = Double.parseDouble(polyValue.substring(spliLocat + 2));
                double coeff = Double.parseDouble(polyValue.substring(0, spliLocat));
                answer += coeff * Math.pow(x, exp);
            }
        }
        System.out.println("\nf(x) = " + polyInput);
        System.out.println("\nf(" + x + ") = " + answer);

        keyboard.close();
    }
}
