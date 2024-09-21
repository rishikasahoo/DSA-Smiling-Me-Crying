import java.util.Arrays;
import java.util.Scanner;

public class BestBubble {

    // Function to calculate the number of swaps required to sort the array using bubble sort
    public static int bubbleSortSwaps(int[] arr, boolean ascending) {
        int n = arr.length;
        int swaps = 0;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if ((ascending && arr[j] > arr[j + 1]) || (!ascending && arr[j] < arr[j + 1])) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    swapped = true;
                }
            }
            // If no elements were swapped, array is sorted
            if (!swapped) {
                break;
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of elements in the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input: array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Clone the array to avoid modifying the original array
        int[] arrAsc = arr.clone();
        int[] arrDesc = arr.clone();

        // Calculate the number of swaps for ascending and descending order
        int ascSwaps = bubbleSortSwaps(arrAsc, true);
        int descSwaps = bubbleSortSwaps(arrDesc, false);

        // Output the minimum of the two swap counts
        System.out.println(Math.min(ascSwaps, descSwaps));

        sc.close();
    }
}
