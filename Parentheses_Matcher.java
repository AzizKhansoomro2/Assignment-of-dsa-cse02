import java.util.Scanner;
import java.util.Stack;

public class Parentheses_Matcher {

    // Method to check if parentheses are balanced
    public static boolean isParenthesesBalanced(String expression) {
        Stack<Character> stack = new Stack<>(); // Stack to store opening parentheses

        // Traverse each character in the string
        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            // If opening parenthesis, push to stack
            if (currentChar == '(') {
                stack.push(currentChar);
            }
            // If closing parenthesis, check for matching opening
            else if (currentChar == ')') {
                if (stack.isEmpty()) {
                    return false; // No matching opening
                }
                stack.pop(); // Pop the matched opening parenthesis
            }
        }

        // If stack is empty, all parentheses matched
        return stack.isEmpty();
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with parentheses: ");
        String input = scanner.nextLine();

        if (isParenthesesBalanced(input)) {
            System.out.println("The parentheses are balanced.");
        } else {
            System.out.println("The parentheses are NOT balanced.");
        }

        scanner.close(); // Close the scanner
    }
}


/*output 
 * Enter a string with parentheses: (a-b)(a+b)) 
The parentheses are NOT balanced.
 */