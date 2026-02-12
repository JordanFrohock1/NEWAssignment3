import java.util.Scanner;

public class NEWAssignment3 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.println("Enter in two numbers"); 
        System.out.println("Enter in the first number: "); 
        double number1 = input.nextInt(); 
        System.out.println("Enter in the second number: "); 
        double number2 = input.nextInt();

        System.out.println("Would you like to use addition or subtraction?");
        String operation = input.next();
    }
}