

package newpackage;

/**
 *
 * @author MAMUN
 */
public class MergeSort {

    int[] array;
    int[] tempMergArr;
    int length;

    public void sort(int inputArr[]) {
        array = inputArr;
        length = inputArr.length;
        tempMergArr = new int[length];
        mergeSort(0, length - 1);
    }

    private void mergeSort(int low, int high) {

        if (low < high) {
            int mid = low + (high - low) / 2;
            // Below step sorts the left side of the array
            mergeSort(low, mid);
            // Below step sorts the right side of the array
            mergeSort(mid + 1, high);
            // Now merge both sides
            merge(low, mid, high);
        }
    }

    private void merge(int low, int mid, int high) {

        for (int i = low; i <= high; i++) {
            tempMergArr[i] = array[i];
        }
        int i = low;               
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }

    }

    public static void main(String a[]) {

        int[] inputArr = {45, 23, 11, 89, 77, 98, 4, 28, 65, 43};
        MergeSort mms = new MergeSort();
        mms.sort(inputArr);
        for (int i : inputArr) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
