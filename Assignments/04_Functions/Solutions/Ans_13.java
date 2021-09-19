//Write a function that returns all prime numbers between two given numbers.
package com.company;

import java.util.Scanner;

public class Ans_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        prime(n1,n2);
    }
    static void prime(int a, int b){
        for (int i = a+1; i < b; i++) {
            if(isprime(i)){
                System.out.println(i);
            }
        }
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
