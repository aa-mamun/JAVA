/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.text.*;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author MAMUN
 */
public class DateValidation {
    
    boolean validateJavaDate(String strDate)
{
    /* Check if date is 'null' */
    if (strDate.trim().equals(""))
    {
        return true;
    }
    /* Date is not 'null' */
    else
    {
        /*
         * Set preferred date format,
         * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.*/
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
  /*setLenient(false) is used to strictlt math the pattern*/
        /* Create Date object */
        Date javaDate = null;
        /* parse the string into date form */
        try
        {
            javaDate = sdf.parse(strDate); 
            System.out.println("Date after validation: " + javaDate);
        }
        /* Date format is invalid */
        catch (ParseException e)
        {
            System.out.println("The date you provided is in an invalid date format.");
         
        }
        /* Return 'true' - since date is in valid format */
        return true;
    }
}
    
    public static void main(String args[]){
        DateValidation obj = new DateValidation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date");
        String inputDate =sc.nextLine();
        obj.validateJavaDate(inputDate);
        
    }
}
