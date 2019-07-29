/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author MAMUN
 */
public class CommonElementsInTwoArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,6,8,10};
        int[] b = {2,3,0,1,1,9,11,12,10};
        int[] temp = new int[a.length];
       
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i]==b[j]){
                   // System.out.println(a[i]);
                   set.add(a[i]);
                    temp[i] =a[i];  
                }
            }
        }
        
        System.out.println(set);
        for (int i = 0; i < temp.length; i++) {
            //if(temp[i] != 0)
            System.out.print(" "+temp[i]);
        }
        
    }
    
}
