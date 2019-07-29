/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.IOException;

/**
 *
 * @author MAMUN
 */

public class LaunchingExternalApps
{
    public static void main(String[] args)
    {
        //Runtime runtime = Runtime.getRuntime();     //getting Runtime object
 
        try
        {
            Runtime.getRuntime().exec("notepad I:\\sample.txt");        //opens "sample.txt" in notepad
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}