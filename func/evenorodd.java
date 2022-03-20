package com.company;

import java.util.Scanner;

//Define a program to find out whether a given number is even or odd.
public class Fuc1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the numbers :");
        int a;
        a = in.nextInt();


        int evenorodd=evenorodd(a);



    }

    public static int evenorodd(int a) {
        if (a%2==0){
            System.out.println("it is an even number");
        }
        else System.out.println("it is an odd number");

        return a;
    }}



