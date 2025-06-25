import java.util.Stack;

public class Reverse_Array_Using_Stack {

    public static void main(String[] args) {
        // Initialize the array
        int[] numbers = {10, 20, 30, 40, 50};

        // Display original array
        System.out.println("Original Array:");
        printArray(numbers);

        // Reverse the array using a stack
        reverseArrayUsingStack(numbers);

        // Display reversed array
        System.out.println("Reversed Array:");
        printArray(numbers);
    }

    // Method to reverse the array using a Stack
    public static void reverseArrayUsingStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // Push each element into the stack
        for (int element : arr) {
            stack.push(element);
        }

        // Pop elements back into the array
        int index = 0;
        while (!stack.isEmpty()) {
            arr[index++] = stack.pop();
        }
    }

    // Method to print elements of the array
    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println(); // Print new line after array
    }
}
