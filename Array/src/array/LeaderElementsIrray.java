
package array;

/*
 An element is said to be leader if all the elements on it’s right side are smaller than it.
Rightmost element is always a leader. For example, if {14, 9, 11, 7, 8, 5, 3} 
is the given array then {14, 11, 8, 5, 3} are the leaders in this array.
 */
public class LeaderElementsIrray {
    public static void main(String[] args){
        int[] arr = {12,9,7,16,8,6,3};
        System.out.println("Leader elements are : " );
        for (int i = 0; i < arr.length; i++) {
            boolean isLeader =true;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[i]){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader){
                System.out.println( arr[i]);
            }
        }
    }
}
