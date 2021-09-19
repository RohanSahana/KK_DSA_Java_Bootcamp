package com.company;

import java.util.Scanner;

public class Ans_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        System.out.println(crcf(r));
        System.out.println(area(r));
    }
    static double crcf(int r){
        return (2 * 22 * r) / (float)(7);
    }
    static double area(int r){
        return 22*r*r/(float)(7);
    }
}
