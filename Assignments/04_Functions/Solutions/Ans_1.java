//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class max_min 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("enter first num : ");
        n1 = scan.nextInt();
        System.out.print("enter second num : ");
        n2 = scan.nextInt();
        System.out.print("enter third num : ");
        n3 = scan.nextInt();
        scan.close();
        max(n1,n2,n3);
        min(n1,n2,n3);
    }
    
    static void max(int n1, int n2, int n3)
    {
        System.out.println("the maximum is : " +Math.max(n1,  Math.max(n2, n3)));
    }

    static void min(int n1, int n2, int  n3)
    {
        System.out.println("the minimum is : " +Math.min(n1, Math.min(n2, n3)));
    }
}

