package com.company;

import java.util.Scanner;

//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class Fuc1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 3 numbers :");
        int a , b ,c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.println("the maximum and minimum among the 3 numbers are :");
        int largest=largest(a,b,c);
        int smallest=smallest(a,b,c);
        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n", a, b, c, largest);
        System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n", a, b, c, smallest);


    }

    public static int smallest(int a, int b, int c) {
        int min = a;
        if (b< min)
        { min = b; }
        if (c < min)
        { min = c; }
        return min;



    }

    public static int largest(int a, int b, int c) {
        int max = a ;
        if(b>max)
        {
            max = b;
        }
        if (c>max){
            max=c;
        }
        return max;
    }
}
