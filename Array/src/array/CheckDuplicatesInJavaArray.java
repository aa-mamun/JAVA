
package array;

/**
 *
 * @author MAMUN
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckDuplicatesInJavaArray {

    public static void main(String args[])  {
       
       String[] withDuplicates = new String[] {"one","two","three","one","f","f"};
       int[]  a = {-1,2,3,4,-1,1,1};
       

      bruteforce(a);
      checkDuplicateUsingHashSetAdd(a);
      
    }
  
    /*
     * brute force way of checking if array contains duplicates in Java
     * comparing each element to all other elements of array
     * complexity on order of O(n^2) not advised in production
     */
    public static void bruteforce(int[] input) {
        int count =0;
       for (int i = 0; i < input.length; i++)
        {
            for (int j = i+1; j < input.length; j++)
            {
                //System.err.println("jjjj" + input[j]);
                if( (input[i]==(input[j]))  )
                { 
                    count++;
                    System.out.print(" "+input[j]);
                }
            }
            
        }
        System.out.println("\nduplication occured " + count + " times");
    }
  
    /*
     * Since Set doesn't allow duplicates add() return false
     * if we try to add duplicates into Set and this property
     * can be used to check if array contains duplicates in Java
     */
    public static void checkDuplicateUsingHashSetAdd(int[] input) {
        Set tempSet = new HashSet();
        for (int n : input) {
            if (!tempSet.add(n)) {
               System.out.println("\nDuplicate Element is : "+ n);
            }
        }
        System.out.println(tempSet);
        
    }


   }
  
 

