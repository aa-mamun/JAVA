
package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author MAMUN
 */
public class CommonElementsInTwoArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,6,8,10,0};
        int[] b = {2,3,0,1,1,9,11,12,10};
        int[] temp = new int[a.length];
      
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i]==b[j]){
                   temp[i] =a[i];
                   set.add(a[i]);
                      
                }
            }
        }
        
        System.out.println(set);
        for (int i = 0; i < temp.length; i++) {
            //if(temp[i] != 0)
            System.out.print(" "+temp[i]);
        }
     
        System.out.println("\n");
        int[] result = arrayWithoutInitializedZero(temp);
        for(int i = 0 ; i<result.length ; i++){
            
            System.out.print(" "+result[i]);
        }
        
        
    }
    //As array inintializes non-matched place by 0
    //below method is used to remove those additional 0 (zeros)
    //But this method remove matched 0 also :(
    static int[] arrayWithoutInitializedZero(int[] input){
        int n = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != 0)
                n++;
        }

        int[] newArray = new int[n];
        int j=0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] != 0)
               { 
                 newArray[j]=input[i]; 
                 j++;
               }
        }

        return newArray;
    }
    
}
