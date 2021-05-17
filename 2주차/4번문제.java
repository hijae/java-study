package com.company;
import java.util.Scanner;


public class Main {
    public static <string> void main(String[] args) {
        System.out.print("Input a equation >> ");
        Scanner scanner = new Scanner(System.in);
        float a=scanner.nextFloat();
        String by=scanner.next();
        float b=scanner.nextFloat();
        float c=0;
        switch (by){
            case "+":
                c=a+b;
                System.out.print(a+" + ");
                System.out.print(b+" = ");
                System.out.println(c);
                break;
            case "-":
                c=a-b;
                System.out.print(a+" - ");
                System.out.print(b+" = ");
                System.out.println(c);
                break;
            case "*":
                c=a*b;
                System.out.print(a+" * ");
                System.out.print(b+" = ");
                System.out.println(c);
                break;
            case "/":
                if(b==0){
                    System.out.println("Can not divide by 0");
                    break;
                }
                c=a/b;
                System.out.print(a+" / ");
                System.out.print(b+" = ");
                System.out.println(c);
                break;
        }
    }
}
