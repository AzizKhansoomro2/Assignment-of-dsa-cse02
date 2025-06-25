public class Recursive_Array_Sum {

    // Recursive method to calculate sum of array elements
    public static int recursiveSum(int[] array, int currentIndex) {
        // Base case: when index reaches the end of the array
        if (currentIndex == array.length) {
            return 0;
        }
        // Recursive case: add current element to the sum of the rest
        return array[currentIndex] + recursiveSum(array, currentIndex + 1);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 10, 3, 15}; // Sample input array

        // Calculate sum starting from the first index
        int totalSum = recursiveSum(numbers, 0);

        // Print the result
        System.out.println("Sum of array elements: " + totalSum);
    }
}

/* OUTPUT

{5, 8, 2, 10, 3}
Sum of array elements: 28

*/
