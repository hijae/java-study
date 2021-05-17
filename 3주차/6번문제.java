package com.company;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static <string> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        do {
            try {
                System.out.print("곱하고자 하는 두 수 입력>>");

                a = scanner.nextInt();
                b = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("실수는 입력하면 안됩니다.");
                scanner.nextLine();
            }
        } while (true);
        System.out.println(a+"x"+b+"="+a*b);
    }
}