 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.text.DateFormatSymbols;

/**
 *
 * @author MAMUN
 */


public class MonthDay {
   public static void main(String[] args) {
      String[] arr = new DateFormatSymbols()
      .getShortMonths();
      //getMonths() getShortWeekdays() getWeekdays()
      for (int i = 0; i < (arr.length); i++) {
         
         System.out.print(" " +  arr[i]);
      }
   }
}