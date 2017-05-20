package newpackage;

/*
Note- A number is armstrong if the sum of the cubes of digit of number is equal to the number.
ex- 407 = 4*4*4 + 0*0*0 + 7*7*7
 */


import java.util.Scanner;

public class ArmstrongNumber {
   static int armstrongNumber(int n){
       int temp=0; int r = 0, sum = 0;
        
             temp = n;
            while (temp != 0) {
                r = temp % 10;
                sum = sum + ( r * r * r );
                temp = temp / 10;
            }
            
            if (sum == n) {
                return sum;
            } else {
                return 0;
            }
   }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number which you want to check whether that is armstrong or not: ");
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
             int result =armstrongNumber(i);
        if (result!=0){
            System.out.println(result + " is  armstrong number");
        }
//      else{
//            System.out.println(i + " is  not armstrong number");
//       }  
        }
     
   
        }

    }


