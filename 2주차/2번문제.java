package com.company;
import java.util.Scanner;

public class Main {
    public static <string> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 3 integer values>> ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if(a>=b && a>=c){
            if(b+c>a) System.out.println("Yes, this is a triangle.");
            else System.out.println("No, this is NOT a triangle.");
        }
        else if(b>=a && b>=c){
            if(a+c>b) System.out.println("Yes, this is a triangle.");
            else System.out.println("No, this is NOT a triangle.");
        }
        else if(c>=a && c>=b){
            if(a+b>c) System.out.println("Yes, this is a triangle.");
            else System.out.println("No, this is NOT a triangle.");
        }
    }
}
