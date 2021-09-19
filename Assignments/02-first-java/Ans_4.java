//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Ans_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        char c = in.next().charAt(0);
        if(c == '+'){
            System.out.println(a+b);
        }
        else if (c == '-'){
            System.out.println(a-b);
        }
        else if (c=='*'){
            System.out.println(a*b);
        }
        else if (c == '/'){
            System.out.println(a/b);
        }
        else{
            System.out.println("Enter correct operator");
        }
    }
}
