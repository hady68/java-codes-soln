package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER :");
        int n=in.nextInt();
        System.out.println("factors of this number are:");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0) {
                System.out.println(i);
            }
        }
    }

    }











