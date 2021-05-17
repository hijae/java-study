package com.company;
import java.util.Scanner;

public class Main {
    public static <string> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i=1;i<=99;i++)
        {
            if(i%10==3 || i/10==3 || i%10==6 || i/10==6 || i%10==9 || i/10==9)
            {
                System.out.print(i + " 박수 ");
                if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
                    System.out.print("짝");
                }
                if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9)
                    System.out.print("짝");
                System.out.println();
            }
        }
    }
}