import java.util.Scanner;

public class SqrtCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its square root: ");
        double number = scanner.nextDouble();

        double sqrt = Math.sqrt(number);
        System.out.println("The square root of " + number + " is: " + sqrt);
    }
}
