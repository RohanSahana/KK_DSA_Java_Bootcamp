//Write a program to print the sum of two numbers entered by user by defining your own method.
package com.company;

import java.util.Scanner;

public class Ans_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(sum(a,b));
    }
    static int sum(int a, int b){
        return a+b;
    }
}
