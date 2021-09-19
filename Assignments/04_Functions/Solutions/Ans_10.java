//Write a function to find if a number is a palindrome or not.
// Take number as parameter.
package com.company;

import java.util.Scanner;

public class Ans_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(palin(n));
    }
    static boolean palin(int n){
        int temp = n;
        int m = 0;
        int c;
        while(n>0){
            c = n % 10;
            m = (m*10)+c;
            n = n/10;
        }
        return temp==m;
    }

}
