package com.company;

import static com.company.A_CLASS.A_Func;
import static com.company.B_CLASS.B_Func;
import static com.company.C_CLASS.C_Func;

public class Main {

    public static void main(String[] args) {
        C_Func();
        new A_CLASS();
        A_Func();
        B_Func();
        // P.S კლასების მეთოდები გავაერთიანე , რათა ბევრი მეთოდის წერა-გამოძახება არ დამჭირდეს ,იმედია პრობლემა არ შემექმნება
    }
}
