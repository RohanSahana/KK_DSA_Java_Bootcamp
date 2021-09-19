//Write a program to input principle, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Ans_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int r = in.nextInt();
        int t = in.nextInt();
        float si = (p*r*t)/(float)(100);
        System.out.println(si);
    }
}
