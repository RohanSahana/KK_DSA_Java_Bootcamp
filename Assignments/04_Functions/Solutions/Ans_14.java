//Write a function that returns the sum of first n natural numbers.
package com.company;

import java.util.Scanner;

public class Ans_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>0) {
            System.out.println(sumfrstn(n));
        }
    }
    static int sumfrstn(int n){
        if(n==1){
            return 1;
        }
        else{return n*(n-1)/2;}
    }
}
