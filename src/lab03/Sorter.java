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
    // Java program for implementation of Insertion Sort
    public static class InsertionSort {
        /*Function to sort array using insertion sort*/
        void sort(int arr[])
        {
            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }

        /* A utility function to print array of size n*/
        static void printArray(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");

            System.out.println();
        }

        // Driver method
        public static void main(String args[])
        {
            int arr[] = { 12, 11, 13, 5, 6 };

            InsertionSort ob = new InsertionSort();
            ob.sort(arr);

            printArray(arr);
        }
    };
}

