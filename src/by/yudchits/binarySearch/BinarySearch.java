package by.yudchits.binarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length;
        do {
            System.out.print("Enter array`s length: ");
            while (!sc.hasNextInt()) {
                System.out.print("Error! Try again: ");
                sc.next();
            }
            length = sc.nextInt();
        }while (length<1);

        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.print("Enter a value: ");
        while(!sc.hasNextInt()){
            System.out.print("Error! Try again: ");
            sc.next();
        }
        int value = sc.nextInt();

        sc.close();

        System.out.println("index of "+value+" is " + binarySearch(array,value));
    }

    public static Integer binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = (low + high)/2;

            if(array[middle] == value)
                return middle;

            if (array[middle] < value) {
                low = middle+1;
            }
            else high = middle-1;
        }

        return null;
    }
}
