package com.bridglabz.demo;

public class forLoopContinue {
    public static void main(String[] args) {
        int [] number = {10, 20, 30, 40, 50};
        for ( int x : number ){
            if (x == 30) {
                continue;
            }
            System.out.println("x = " + x);
            }
        }
}
