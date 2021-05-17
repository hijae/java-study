package com.company;
import java.util.Scanner;

public class Main {
    public static <string> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c;
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        do{
            String str = scanner.next();
            c = str.charAt(0);
            if(c>='a' && c<='z')
                break;
            else
                System.out.print("잘못 입력했습니다. 다시 입력하시오>>");
        }while(true);

        for(int i=0 ;i<=(int)c-(int)'a' ;i++)
        {
            for(int j=(int)'a';j<=(int)c-i;j++)
            {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}