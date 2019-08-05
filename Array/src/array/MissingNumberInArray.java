package array;

/**
 *
 * @author MAMUN
 */
import java.util.Arrays;
import java.util.BitSet;

/**
 * Java program to find missing elements in a Integer array containing numbers
 * from 1 to 100.
 *
 * @author Javin Paul
 */
public class MissingNumberInArray {

    public static void main(String args[]) {

        int[] a = {1, 6, 3, 2};
        int b[] = {1, 2, 4, 5, 6};
        //Arrays.sort(a);
        printMissingNumber(a, 10);

    }

    /**
     * A general method to find missing values from an integer array in Java.
     * This method will work even if array has more than one missing element.
     */
    public static void printMissingNumber(int[] arr, int size) {
        int missingElement = size - arr.length;
        BitSet bitSet = new BitSet(size);
        // BitSet is an array of bits & size can be grown as necessary

        for (int n : arr) {
            bitSet.set(n - 1);
            System.out.println(bitSet);
        }

        System.out.printf("Missing numbers in integer array %s, with given size %d is \n",
                Arrays.toString(arr), size);
        int lastMissingIndex = 0;

        System.out.println("Missing numbers are ");
        for (int i = 0; i < missingElement; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            /*nextClearBit() retruns the index of first bit that is set to false on/after the 
            specified index e.g nextClearBit(int fromIndex)
             */
            // System.out.println("last value print"+lastMissingIndex);

            System.out.print(" " + ++lastMissingIndex);
        }

    }



}
