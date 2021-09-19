//Write a program to print whether a number is even or odd, also take input.

import java.util.Scanner;

public class Ans_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a%2==0){
            System.out.print("Even");
        }
        else{
            System.out.print("Odd");
        }
    }
}
