package com.company;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);
        System.out.println("enter the radius nd height of cylinder");
        float r=in.nextFloat();
        float h=in.nextFloat();
        System.out.println("THE csa OF cylinder IS :"+ (2*3.14*r*h));
    }

    }











