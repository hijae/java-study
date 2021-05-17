package com.company;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요. 빈 칸이나 있어도 되고 영어 한글 모두 됩니다.");
        String arr = scanner.nextLine();
        int cnt = arr.length();
        for(int i=1;i<=cnt;i++)
        {
            for(int j=i;j<cnt+i;j++) {
                System.out.print(arr.charAt(j%cnt));
            }
            System.out.println();
        }
    }
}