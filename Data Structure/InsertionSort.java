package newpackage;

/**
 *
 * @author MAMUN
 */
public class InsertionSort {  
    public static void insertionSort(int array[]) {  
        for (int i = 0; i < array.length; i++) {  
            int key = array[i];  
            int j = i-1;  
            System.out.println("j = i-1  "+j);
           
            while ( (j > -1) && ( array [j] > key ) ) {  
                
                array [j+1] = array [j];  
                j--;  
            }  
            array[j+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] arr1 = {9,14,3,2,43,11,58,22};    
        System.out.println("Before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }    
} 