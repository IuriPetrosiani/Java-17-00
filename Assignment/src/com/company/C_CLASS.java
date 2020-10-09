package com.company;

import java.util.Scanner;

public class C_CLASS {
    static void C_Func() {
        System.out.print("Write your A number:");
        Scanner sc_A = new Scanner(System.in);
        int a = sc_A.nextInt();
        System.out.println("A number is:    " + a);

        System.out.print("Write your B number:");
        Scanner sc_B = new Scanner(System.in);
        int b = sc_B.nextInt();
        System.out.println("B number is:    " + b);

        System.out.print("Write your C number:");
        Scanner sc_C = new Scanner(System.in);
        int c = sc_C.nextInt();
        System.out.println("C number is:    " + c);

        String A_str = String.valueOf(a);
        char a_LAST = A_str.charAt(A_str.length() - 1);
        System.out.println("A number's LAST digit is:    " + a_LAST);

        String B_str = String.valueOf(b);
        char b_FIRST = B_str.charAt(0);
        System.out.println("B number's FIRST digit is:     " + b_FIRST);


        int sum = 0;
        while(c > 0){
            sum = sum + c % 10;
            c = c / 10;
        }
        System.out.println("The summary of C number's digits is:    " + sum);

        int int_a_LAST = Character.getNumericValue(a_LAST);
        int int_b_FIRST = Character.getNumericValue(b_FIRST);
        int multiple = int_a_LAST * int_b_FIRST;
        System.out.println("The multiple of A's last digit and B's first digit is:     " + multiple);

        int TASK_6 = sum + multiple;
        System.out.println("The Task 6's answer is:     " + TASK_6);
    }
}
