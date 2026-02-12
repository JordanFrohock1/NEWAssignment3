import java.util.Scanner;

public class NEWAssignment3 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Enter in two numbers that can include decimals"); 
        System.out.println("Enter in the first number: ");
        double number1 = input.nextDouble();
        System.out.println("Enter in the second number: ");
        double number2 = input.nextDouble();
         System.out.println("Would you like to use addition,subtraction, multiplicaiton of division?");
        String operation = input.next();

        if (operation.equalsIgnoreCase("addition")) {
            double result = number1 + number2;
            System.out.println("The result of the addition is: " + result);
        } else if (operation.equalsIgnoreCase("subtraction")) {
            double result = number1 - number2;
            System.out.println("The result of the subtraction is: " + result);
        } else if (operation.equalsIgnoreCase("multiplication")) {
            double result = number1 * number2;
            System.out.println("The result of the multiplication is: " + result);
        } else if (operation.equalsIgnoreCase("division")) {
            if (number2 != 0) {
                double result = (double) number1 / number2;
                System.out.println("The result of the division is: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
           
        } else {
            System.out.println("Invalid operation. Please enter either 'addition', 'subtraction', 'multiplication', or 'division'.");
        }
        System.out.println("Thank you for using the calculator!");
        
    
    }
}