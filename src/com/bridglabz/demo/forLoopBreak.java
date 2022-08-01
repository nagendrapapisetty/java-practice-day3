package com.bridglabz.demo;

public class forLoopBreak {
    public static void main(String[] args) {
        int x;
        for (x = 0; x<=50 ; x++) {
            if (x == 5) {
                break;

            }
            System.out.println("x = " + x);
        }
    }
}
