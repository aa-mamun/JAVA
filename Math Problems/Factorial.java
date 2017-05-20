 
package newpackage;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MAMUN
 */
public class Factorial {
    static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        
        return fact;
    }
    
    
  int factRecursion(int n){
   if(n==1)
       return 1;
   else
       return(n*factRecursion(n-1));
 }
    static int npr(int n,int r){
        int npr;
        int factN=factorial(n);
        int factNR=factorial((n-r));
        npr=factN/(factNR);
        return npr;
    }
    
     static int ncr(int n,int r){
        int ncr;
        int factN=factorial(n);
        int factNR=factorial(r)*factorial((n-r));
        ncr=factN/(factNR);
        return ncr;
    }
    
    public static void main(String args[]){
        int n;
        int r;
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
                System.out.println(random.nextInt(5)); //0 to 5
                 System.out.println((int) Math.random() * 10); //0 to 10
        }
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n & r ");
        n=sc.nextInt();
        r=sc.nextInt();
        int npr=npr(n,r);   //nPr=n!/(n-r)! Permutation
        System.out.println("nPr value is :" + npr);
        int ncr =ncr(n,r);  //nCr=n!/(r!(n-r)!) Combination
        System.out.println("nCr value is :" + ncr);
        
    }
}
