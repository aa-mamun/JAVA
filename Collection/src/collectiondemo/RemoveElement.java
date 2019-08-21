/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;

/**
 *
 * @author MAMUN
 */


public class RemoveElement {
   public static void main(String[] args)  {
      ArrayList al = new ArrayList();
      al.clear();
      al.add(0,"0th element");
      al.add(1,"1st element");
      al.add(2,"2nd element");
      System.out.println("Array before removing an element"+al);
      al.remove(1);
      al.remove("0th element");
      System.out.println("Array after removing an element"+al);
   }
}