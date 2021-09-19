//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

package com.company;

import java.util.Scanner;

public class Ans_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("Max = " + max(a,b,c));
        System.out.println("Min = " + min(a,b,c));
    }

    static int max(int a, int b, int c){
        if(b>a){
            if(b>c){
                return b;
            }
            else{
                return c;
            }
        }
        else{
            return a;
        }
    }

    static int min(int a, int b, int c){
        if(a<b){
            if(a<c){
                return a;
            }
            else{
                return c;
            }
        }
        else{ //b<a
            if(b<c){
                return b;
            }
            else{ //b>c
                return c;
            }
        }
    }
}
