/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author MAMUN
 */
public class RotationOfString {
    
public static void main(String[] args)
    {
        String s1 = "abfcd"; //ab cd       ab f cd
 
        String s2 = "cdabf"; //cd ab       cd ab f
 
        //Step 1
 
        if(s1.length() != s2.length())
        {
            System.out.println("s2 is not rotated version of s1");
        }
        else
        {
            //Step 2
 
            String s3 = s1 + s1;
 
            //Step 3
 
            if(s3.contains(s2))
            {
                System.out.println("s2 is a rotated version of s1");
            }
            else
            {
                System.out.println("s2 is not rotated version of s1");
            }
        }
    }
    
}