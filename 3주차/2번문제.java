package com.company;
import java.util.Scanner;

public class Main {
    public static <string> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=0;
        do{
            System.out.print("정수를 입력하시오>>");
            n=scanner.nextInt();
            if(n>0)
                break;
            else
                System.out.print("잘못 입력했습니다. ");
        }while(true);

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}