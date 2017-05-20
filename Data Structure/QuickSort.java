package newpackage;

/**
 *
 * @author MAMUN
 */
 //Select an element ,most commonly the mid element whic is called pivot
    //place the elements which are smaller than pivot in one array & place the larger in another 
    // sort these array using quicksort
    //combine two array
/*
    This algorithm is quite efficient for large sized data sets as its 
    average and worst case complexity are of O(nlogn) where n are no. of items.
    */
public class QuickSort {
   
     int[] array;
     int length;
 
    public void sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int low, int high) {
         
        int i = low;
        int j = high;
        // Get the pivot element from the middle of the list
        int pivot = array[low+(high-low)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (low < j)
            quickSort(low, j);
        if (i < high)
            quickSort(i, high);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
    public static void main(String a[]){
         
        QuickSort ob = new QuickSort();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        ob.sort(input);
        for(int i:input){
            System.out.print(i+" ");
            
        }
        
    }
}
