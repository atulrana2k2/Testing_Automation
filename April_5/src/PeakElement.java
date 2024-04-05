import java.util.Scanner;

//Find a peak element which is not smaller than its neighbours
//Input: array[]= {5, 10, 20, 15}
//Output: 20
//Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

public class PeakElement {


    public static int findPeak(int[] arr) {
        int n = arr.length;
        // Edge cases
        if (n == 0) {
            return -1;
        } else if (n == 1) {
            return arr[0];
        }

        // Check the first element
        if (arr[0] >= arr[1]) {
            return arr[0];
        }

        // Check the last element
        if (arr[n - 1] >= arr[n - 2]) {
            return arr[n - 1];
        }

        // Check middle elements
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        System.out.println("Enter the elements of the array : ");
        for (int element = 0; element < arraySize; element++) {
            array[element] = scanner.nextInt();
        }


        System.out.println(findPeak(array));


    }
}
