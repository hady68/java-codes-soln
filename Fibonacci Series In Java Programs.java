package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p=0;//previous no. initializing wth zero
        int c = 1;//current no. initializing with 1
        System.out.println("enter the no. of terms");
        int n=in.nextInt();// enter the number till where to go
        //rough= 0 1 1 2 3 5 8
        for (int i=1;i<=n;i++)
        {
            int tempo=c;
            c=c+p;
            p=tempo;

        }
        System.out.println(c);
    }

    }











