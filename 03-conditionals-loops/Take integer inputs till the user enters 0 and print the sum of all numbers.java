package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        int n;
        System.out.println("Please enter number: ");
        do
        {
            n = in.nextInt();
            sum=sum+n;
        }while(n!=0);
        System.out.println("Sum = " + sum);


            }
        }










