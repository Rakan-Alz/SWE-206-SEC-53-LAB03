package lab03;

public class Sorter {

    public static void sort(int[] arr) {
        int n = arr.length;

        // Traverse through all elements in the array
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already sorted, so we don't need to check them
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int[] myArray = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        printArray(myArray);

        // Sort the array using the sort method
        sort(myArray);

        System.out.println("\nSorted array:");
        printArray(myArray);
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

