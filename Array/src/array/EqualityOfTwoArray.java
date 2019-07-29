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
public class EqualityOfTwoArray {                     
    public static void main(String[] args) {
        int[] arrayOne = {2, 7, 1, 7, 4};

        int[] arrayTwo = {2, 5, 1, 7, 4};

        /*
        String[] arrayOne = {"java", "j2ee", "struts", "hibernate"};
         
        String[] arrayTwo = {"java", "j2ee", "struts", "hibernate"};
         */
        boolean equalOrNot = true;

        if (arrayOne.length == arrayTwo.length) {
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayOne[i] != arrayTwo[i]) {
                    equalOrNot = false;
                }
            }
        } else {
            equalOrNot = false;
        }

        if (equalOrNot) {
            System.out.println("Two Arrays Are Equal");
        } else {
            System.out.println("Two Arrays Are Not equal");
        }
    }
}
