//Define a method to find out if a number is prime or not.
package com.company;

import java.util.Scanner;

public class Ans_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        System.out.println(isprime(r));
    }
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c < n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
