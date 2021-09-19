//Define a method that returns the product of two numbers entered by user.
package com.company;

import java.util.Scanner;

public class Ans_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(prod(a,b));
    }
    static int prod(int a, int b){
        return a*b;
    }
}
