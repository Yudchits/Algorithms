package by.yudchits.binarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[128];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.println(Arrays.toString(array));

        int index = binarySearch(array, 64);

        System.out.println("index of 64 is " + index);
    }

    public static int binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;


        while (low <= high) {
            int middle = (low + high)/2;

            if(array[middle] == value) return middle;

            if (array[middle] < value) {
                low = middle+1;
            }
            else high = middle-1;
        }

        return -1;
    }
}
