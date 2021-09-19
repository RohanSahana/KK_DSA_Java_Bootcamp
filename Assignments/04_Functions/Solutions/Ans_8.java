/*Write a program that will ask the user to enter his/her marks (out of 100).
Define a method that will display grades according to the marks entered as below:

        Marks        Grade
        91-100         AA
        81-90          AB
        71-80          BB
        61-70          BC
        51-60          CD
        41-50          DD
        <=40          Fail
*/
        package com.company;

import java.util.Scanner;

public class Ans_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        grade(m);
    }
    static void grade(int m){
        if (m >= 0 && m <= 100){
            if(m >= 91){
                System.out.println("AA");
            }
            else if (m >= 81){
                System.out.println("AB");
            }
            else if (m >= 71){
                System.out.println("BB");
            }
            else if (m >= 61){
                System.out.println("BC");
            }
            else if (m >= 51){
                System.out.println("CD");
            }
            else if (m >= 41){
                System.out.println("DD");
            }
            else {
                System.out.println("Fail");
            }
        }
    }
}
