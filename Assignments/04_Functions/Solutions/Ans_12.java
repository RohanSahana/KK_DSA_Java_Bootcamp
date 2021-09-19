//Write a function to check if a given triplet is a Pythagorean triplet or not.
// (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
package com.company;

import java.util.Scanner;

public class Ans_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        System.out.println(pytrip(n1,n2,n3));
    }
    static boolean pytrip(int a, int b, int c){
        if((a*a)+(b*b)==(c*c)){
            return true;
        }
        else if((b*b)+(c*c)==(a*a)){
            return true;
        }
        else return (c * c) + (a * a) == (b * b);
    }
}
