//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

package com.company;

import java.util.Scanner;

public class Ans_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(vote(a));
    }
    static boolean vote(int a){
        return a >= 18;
    }
}
