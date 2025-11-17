public class CountOccurrences {

    public static int countOccurrences(int[] arr, int n) {
        int count = 0;

        for (int element : arr) {
            if (element == n) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        
        System.out.println("--- Testing the countOccurrences function ---");
        
        int[] testArray1 = {1, 5, 2, 8, 5, 3, 5, 9};
        int targetN1 = 5;
        int result1 = countOccurrences(testArray1, targetN1);
        
        System.out.print("\nArray: ");
        printArray(testArray1);
        System.out.println("Target (n): " + targetN1);
        System.out.println("Occurrences: " + result1);

        int[] testArray2 = {10, 20, 30, 40, 10, 50, 10};
        int targetN2 = 10;
        int result2 = countOccurrences(testArray2, targetN2);

        System.out.print("\nArray: ");
        printArray(testArray2);
        System.out.println("Target (n): " + targetN2);
        System.out.println("Occurrences: " + result2);

        int[] testArray3 = {1, 2, 3};
        int targetN3 = 99;
        int result3 = countOccurrences(testArray3, targetN3);

        System.out.print("\nArray: ");
        printArray(testArray3);
        System.out.println("Target (n): " + targetN3);
        System.out.println("Occurrences: " + result3);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
