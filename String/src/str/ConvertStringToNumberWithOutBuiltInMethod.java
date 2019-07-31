
package str;

/**
 *
 * @author MAMUN
 */
public class ConvertStringToNumberWithOutBuiltInMethod {
 
    //Convert string to number without uisng Java method e.g String.valueOf()
    public static int convert_String_To_Number(String numStr){
         
        
        int sum = 0;
        //get ascii value for zero
        int asciiValueOfZero = (int)'0';
        for(char c:numStr.toCharArray()){
            //here getting the ASCII value of each character
            int tmpAscii = (int)c;
            System.out.println("ACII - "+tmpAscii);
            sum = (sum*10)+(tmpAscii-asciiValueOfZero);
            System.out.println("SUM - "+sum);
        }
        return sum;
    }
     
    public static void main(String a[]){
         
        System.out.println("\"1234\" : "+convert_String_To_Number("1234"));
        System.out.println("\"9876\" : "+convert_String_To_Number("76289"));
       
    }
}
