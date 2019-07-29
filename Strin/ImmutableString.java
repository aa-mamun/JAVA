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

 class ImmutableString
{
    public static void main(String[] args)
    {
        String s1 = "JAVA";
        String s2 = "JAVA";
        
        System.out.println(s1 == s2);         //Output : true
        
        s2 =  "J2EE";
        //s2 changes ,but it doesn't affect the vlaue of s1 since String is immutable
        //s2= "Mamun";
        System.out.println(s1 == s2);         //Output : false
        //System.out.println(s2);
    }
}