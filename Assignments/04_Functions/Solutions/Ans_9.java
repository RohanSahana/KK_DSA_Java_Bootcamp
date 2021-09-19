/*
Write a program to print the factorial of a number by defining a method named 'Factorial'.
Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
        4! = 1 * 2 * 3 * 4 = 24
        3! = 3 * 2 * 1 = 6
        2! = 2 * 1 = 2
        Also,
        1! = 1
        0! = 1
*/
package com.company;

import java.util.Scanner;

public class Ans_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        System.out.println(fact(m));
    }
    static int fact(int n){
        int f = 1;
        for(int i = n; i>0; i--){
            f = f * i;
        }
        return f;
    }
}
