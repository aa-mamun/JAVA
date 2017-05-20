/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * Convert a given string as "11/12/2010" to a Date object. 
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class StringToDate {
    public static void main(String args[]) throws ParseException{
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        String dateString="11/12/2010";
        try{
        Date d=sdf.parse(dateString);
         System.out.println(d);
        }catch(ParseException p){
            System.out.println(p);
        }
       
    }
}