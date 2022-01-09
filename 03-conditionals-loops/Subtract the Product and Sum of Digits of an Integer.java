//Subtract the Product and Sum of Digits of an Integer- Leetcode easy
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER :");
        int n=in.nextInt();
        System.out.println("the product of digits of the number :");
        int temp;
        int sum=0;
        int pod=1;
        while(n!=0){
            temp=n%10;//storing digit
            sum=sum+temp;//sum of digits
            pod=pod*temp;// pod of digits
            n=n/10;//reducing number
        }
        System.out.println(" the diff of product and sum of digits is :"+(pod-sum));
    }

    }











