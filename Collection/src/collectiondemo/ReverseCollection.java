/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseCollection {
   public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6};
      ArrayList arrayList = new ArrayList();
      arrayList.add("A");
      arrayList.add("B");
      arrayList.add("C");
      arrayList.add("D");
      arrayList.add("E");
      System.out.println("Before Reverse Order: " + arrayList);
      Collections.reverse(arrayList);
      System.out.println("After Reverse Order: " + arrayList);
     
}
}