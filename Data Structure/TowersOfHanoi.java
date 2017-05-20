/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author MAMUN
 */
public class TowersOfHanoi {
    public static void main(String[] args) {
      int nDisks = 3;
      doTowers(nDisks, 'A', 'B', 'C' );
   }
   public static void doTowers(int top, char from, char inter, char to) {
      if (top == 1) {
         System.out.println("Disk 1 from " + from + " to " + to);
      } else {
         doTowers(top - 1, from, to, inter);
         System.out.println("Disk " + top + " from " + from + " to " + to);
         doTowers(top - 1, inter, from, to);
      }
   }
}
