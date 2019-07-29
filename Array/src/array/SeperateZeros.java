/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Arrays;

/**
 *
 * @author MAMUN
 */
public class SeperateZeros {
    public static void main(String[] args){
        int[] a = {0,1,2,0,0,3,4,0,0};
        int index=0;
        
        for (int i = 0; i < a.length; i++) {
            if(a[i] != 0){
                a[index] = a[i];
                index++;
            }
        }
        
        while(index < a.length)
        {
            a[index] = 0;
            index++;
        }
        
       
      /*  int count=a.length-1;
        for (int  i = a.length-1; i>=0; i--) {
            if(a[i] != 0){
                a[count] = a[i];
                count--;
            }
        }
        
        while(count > 0)
        {
            a[count] = 0;
            count--;
        }*/
        
        System.out.println(Arrays.toString(a));
    }
}
