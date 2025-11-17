public class CountOccurrences {

    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] reversedArr = new int[n];
        
        for (int i = 0; i < n; i++) {
            reversedArr[n - 1 - i] = arr[i];
        }
        
        return reversedArr;
    }

    public static void main(String[] args) {
        
        System.out.println("--- Testing the reverseArray function ---");
        
        int[] originalArr1 = {10, 20, 30, 40, 50};
        int[] reversedArr1 = reverseArray(originalArr1);
        System.out.print("\nOriginal Array 1: ");
        printArray(originalArr1);
        System.out.print("Reversed Array 1: ");
        printArray(reversedArr1); 
        
        int[] originalArr2 = {1, 2, 3, 4};
        int[] reversedArr2 = reverseArray(originalArr2);
        System.out.print("\nOriginal Array 2: ");
        printArray(originalArr2);
        System.out.print("Reversed Array 2: ");
        printArray(reversedArr2); 
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
