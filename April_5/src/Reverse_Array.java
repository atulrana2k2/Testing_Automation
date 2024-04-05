

//Write a program to reverse the array

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        System.out.println("Enter the elements of the array : ");
        for (int element = 0; element < arraySize; element++) {
            array[element] = scanner.nextInt();
        }

        //REVERSE THE ARRAY
        int left=0;
        int right=arraySize-1;

        while (left < right) {
            // Swap
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move pointers towards the center
            left++;
            right--;
        }
        System.out.println("REVERESED ARRAY\n"+Arrays.toString(array));


    }

}

