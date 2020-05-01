package com.mussie;
// import java.math.BigInteger;

public class math_func{
    Long num = (long)0;
    public Long fibonacci(int f) {
        for (int i=1; i <= f; i++) {
            num = i + num;
        }
        return(num);
    }
    /*** Checks to see if the number of prime number 

     */
    public boolean prime_num(int f){
        return(f % 2 == 0);
    }

    /** Checks to see if the number is palindrome. 
     * When the number of written in reverse order it matches with the original number
     *  param integer
     *  return boolean
     */
    public boolean palindrome(int p){
        int r,sum=0;

        int temp=p;
        while(p>0){
            r=p%10;  //getting remainder
            sum=(sum*10)+r;
            p=p/10;
        }
        return(temp==sum);
    }

    /*** Armstrong if the cube sum of the individual digits that make up the number
      matches with the number

     */
    public boolean armstrong(int p){
        int r,sum=0;

        int temp=p;
        while(p>0){
            r=p%10;  //getting remainder
            sum=sum+(r*r*r);
            p=p/10;
        }
        return(temp==sum);
    }

}  