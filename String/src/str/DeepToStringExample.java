
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Arrays;

/**
 *
 * deepToString() is used to represent multidimensional string
 */
public class DeepToStringExample {
    

    public static void main(String[] args)
    {

        String[] oneDArray = new String[] {"ONE", "TWO", "THREE", "FOUR", "FIVE"};
 
        System.out.println("One Dimensional Array : ");
        System.out.println(Arrays.deepToString(oneDArray));
        String[][] twoDArray = new String[][] {
                                                    {"ONE", "TWO", "THREE", "FOUR"},
                                                    {"FIVE", "SIX", "SEVEN"},
                                                    {"EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE"}
                                                };
 
        System.out.println("Two Dimensional Array : ");
        System.out.println(Arrays.deepToString(twoDArray));
        String[][][] threeDArray = new String[][][] {
                                                        {
                                                            {"ONE", "TWO", "THREE"},
                                                            {"FOUR", "FIVE", "SIX", "SEVEN"}
                                                        },
                                                        {
                                                            {"EIGHT", "NINE", "TEN", "ELEVEN"},
                                                            {"TWELVE", "THIRTEEN", "FOURTEEN"}
                                                        },
                                                        {
                                                            {"FIFTEEN", "SIXTEEN"} ,
                                                            {"SEVENTEEN", "EIGHTEEN", "NINETEEN"},
                                                            {"TWENTY", "TWENTY ONE"}
                                                        }
                                                    };
 
        System.out.println("Three Dimensional Array : ");
        System.out.println(Arrays.deepToString(threeDArray));
    }
}