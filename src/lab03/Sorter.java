package lab03;

//Sorter.java

public class Sorter {

 public static void main(String[] args) {
     // Main method for testing
     int[] array = {64, 25, 12, 22, 11};
     
     // Call the new sort method
     sort(array);
     
     // Print the sorted array
     printArray(array);
 }

 // The sort method that calls selectionSort
 public static void sort(int[] arr) {
     selectionSort(arr);
 }

 // Existing selectionSort method
 public static void selectionSort(int[] arr) {
     int n = arr.length;

     for (int i = 0; i < n - 1; i++) {
         int minIndex = i;
         for (int j = i + 1; j < n; j++) {
             if (arr[j] < arr[minIndex]) {
                 minIndex = j;
             }
         }

         // Swap the found minimum element with the first element
         int temp = arr[minIndex];
         arr[minIndex] = arr[i];
         arr[i] = temp;
     }
 }

 public static void printArray(int[] arr) {
     for (int value : arr) {
         System.out.print(value + " ");
     }
     System.out.println();
 }
}




// Java program for implementation of Insertion Sort
class InsertionSort {
    /* Function to sort array using insertion sort */
    void sort(int arr[]) {
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

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    // Driver method
    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6 };

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);
    }

}


