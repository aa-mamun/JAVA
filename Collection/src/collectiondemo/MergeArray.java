/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author MAMUN
 */



public class MergeArray {
   public static void main(String args[]) {
      String a[] = { "A", "E", "I" };
      String b[] = { "O", "U" };
      List list = new ArrayList();
      list.addAll(Arrays.asList(a));
      list.addAll(Arrays.asList(b));
      System.out.println(list);
   }
}