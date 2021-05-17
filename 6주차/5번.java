package com.company;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(">>");
        String arr = scanner.nextLine();
        StringBuffer sb = new StringBuffer(arr);
        while(true)
        {
            System.out.print("명령: ");
            String t=scanner.nextLine();
            String[] st = t.split("!");
            if(t.equals("그만"))
            {
                System.out.println("종료합니다.");
                break;
            }
            if(st.length!=2)
            {
                System.out.println("잘못된 명령입니다!");
                continue;
            }
            if(st[0].equals("") || st[1].equals(""))
            {
                System.out.println("잘못된 명령입니다!");
                continue;
            }
            if(arr.contains(st[0]))
            {
                arr=arr.replace(st[0],st[1]);
                System.out.println(arr);
            }
            else {
                System.out.println("찾을 수 없습니다!");
            }
        }
    }
}