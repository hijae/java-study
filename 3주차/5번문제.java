package com.company;
import java.util.Scanner;

public class Main {
    public static <string> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score[] = {95, 88, 76, 62, 55};
        do{
            System.out.print("과목 이름>>");
            String t = scanner.next();
            if (t.equals("그만")) break;
            int i=0;
            for(i=0;i<5;i++)
            {
                if(t.equals(course[i]))
                {
                    System.out.println(course[i]+"의 점수는 "+score[i]);
                    break;
                }
            }
            if(i==5) System.out.println("없는 과목입니다.");
        }while (true);
    }
}