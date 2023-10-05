import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(number1);
        System.out.println(number2);
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
