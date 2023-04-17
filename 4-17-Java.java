/**
Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num until the array length reaches length.

Examples

arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]

arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]

arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayOfMultiples(7, 5)));
        System.out.println(Arrays.toString(arrayOfMultiples(12, 10)));
        System.out.println(Arrays.toString(arrayOfMultiples(17,6)));
    }

    public static int[] arrayOfMultiples(int num, int size){
        int[] array = new int[size];
        for(int i = 0;i < size; i++){
            array[i] = (num * (i+1));
        }
        return array;
    }
}
