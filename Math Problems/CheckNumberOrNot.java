/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author MAMUN
 */
public class CheckNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a somthing ");
        String str =sc.nextLine();
        
        try {
            Integer.parseInt(str);
            System.out.println(str + " is an Integer  number");
        } catch (NumberFormatException e) {
            try {
                Double.parseDouble(str);
                System.out.println(str + " is a Double  number");
            } catch (NumberFormatException ee) {
                //System.out.println("Not a number");
            }
            System.out.println("Not a number");
        }
    }
}
/*
   width                     minimum                         maximum
byte:   8 bit                        -128                            +127
short: 16 bit                     -32 768                         +32 767
int:   32 bit              -2 147 483 648                  +2 147 483 647
long:  64 bit  -9 223 372 036 854 775 808      +9 223 372 036 854 775 807
*/