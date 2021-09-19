//Define a program to find out whether a given number is even or odd.

package com.company;

import java.util.Scanner;

public class Ans_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(odd(a));
    }
    static String odd(int a){
        if(a == 1){
            return "Neither";
        }
        else if (a % 2 == 0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
}
