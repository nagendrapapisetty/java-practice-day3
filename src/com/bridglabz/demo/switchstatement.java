package com.bridglabz.demo;

public class switchstatement {
    public static void main(String[] args) {
        char grade = 'c';
        switch (grade){
            case 'A' :
                System.out.println(" Exellent!");
                break;
            case 'B' :
            case'c' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("you passed");
            case 'F' :
                System.out.println("Better tay again");
                break;
            default:
                System.out.println(" invalid grade");

        }
        System.out.println("your grade is " + grade);
    }
}
