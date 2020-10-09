package com.company;

import java.util.Scanner;

public class B_CLASS extends A_CLASS {
    static void B_Func(){
        System.out.print("Write your Y number:");
        Scanner sc_Y = new Scanner(System.in);
        int y = sc_Y.nextInt();
        System.out.println("Y number is:    " + y);

    }
}
