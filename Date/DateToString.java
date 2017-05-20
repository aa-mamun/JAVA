/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.text.SimpleDateFormat;
//import java.sqll.Date;
import java.util.Date;
import java.util.TimeZone;
/**
 *
 * @author MAMUN
 */

public class DateToString {

    public static void main(String[] args) {
        //long millis=System.currentTimeMillis(); 
        //Date date = new Date(millis);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd-MMM-yyyy hh:mm:ss a");
        String strDate = sdf.format(date);// format() to convert date to string
        System.out.println(strDate); 
        
       



     
       
    }
}
