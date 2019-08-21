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
public class EqualityOfArrays {
    public static void main(String[] args) {
        int[] ary = {1,2,3,4,5,6};
      int[] ary1 = {1,2,3,4,5,6};
      int[] ary2 = {1,2,3,4};
      System.out.println("Is array 1 equal to array 2?? "
      +Arrays.equals(ary, ary1));
      System.out.println("Is array 1 equal to array 3?? "
      +Arrays.equals(ary, ary2));
      String[] st1 ={"qw" , "we" , "er"};
      String[] st2 ={"qw" , "we" , "er"};
      System.out.println("Is array 1 equal to array 2?? "
      +Arrays.equals(st1, st2));
    }
}
