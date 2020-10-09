package com.company;

import java.util.Scanner;

public class A_CLASS {
    public A_CLASS(){
        String MESSAGE = "Hello";
        System.out.println(MESSAGE);
    }
    static void A_Func(){
        System.out.print("Write your X number:");
        Scanner sc_X = new Scanner(System.in);
        int x = sc_X.nextInt();
        System.out.println("X number is:    " + x);

        int xPLUS12 = x + 12;
        System.out.println("X+12 is:    " + xPLUS12);


        if((x%2)==0){
            System.out.println(x + " is even ");
        }
        else{
                System.out.println(x + " is odd ");
        }
    }
}
