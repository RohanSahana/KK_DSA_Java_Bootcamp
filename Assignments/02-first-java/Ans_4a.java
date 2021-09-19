//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use Switch)

import java.util.Scanner;

public class Ans_4a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        char c = in.next().charAt(0);
        switch (c) {
            case '+' -> System.out.println(a + b);
            case '-' -> System.out.println(a - b);
            case '*' -> System.out.println(a * b);
            case '/' -> System.out.println(a / b);
        }
    }
}
