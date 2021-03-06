
package array;

/**
 *
 * @author MAMUN
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CountOccurrence {
    public static void main(String[] args) {
        int[] numbers =  {1, 8,1, 3, 4, 3, 2, 2,2};
        String str = "Read Java,Do Java,Discover Java";
        char[] ch = str.toCharArray();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : numbers) {
          
          
            if (map.containsKey(i)) {

                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }  
        Set<Integer> set = map.keySet();
        System.out.println("Duplicate Elements In Array");
        
        for (int i : set) {
            if (map.get(i) > 1) {
                //If any char has a count of more than 1, printing it's count

                System.out.println(i + " : " + map.get(i));
            }
        }
        System.out.println(map);
        for(Map.Entry me : map.entrySet()){
            System.out.println(me.getKey() + " occured " + me.getValue() + " time(s).");
            
        }
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            //char key = (Character) iterator.next();
//            int key =  (int) iterator.next();
//            int occurrence = map.get(key);

            System.out.println(iterator.next()  + " time(s).");
          
        }
        
       
    }
    

}