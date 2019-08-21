/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * Remove duplicate element from List
 */
public class ReomoveDuplicateElements {
    public static void main(String[] args){
        Integer[] arr ={1,4,4,2,5,67,7,8,8};
        List<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(arr));
        
        System.out.println(list);
        
        Set<Integer> set = new HashSet<Integer>();
        for(int i : list){
            set.add(i);
        }
        
      
        for(int i : set){
            System.out.print(i+" ");
        }
    }
}
