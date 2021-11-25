package com.company;
import java.util.Scanner;
public class Main{
    public static void main(String [] arg) {
        DicApp dicapp = new DicApp();
        dicapp.run();
    }
}
class Dictionary {
    private static String [] kor = {"사랑", "아기", "돈", "미래", "희망" };
    private static String [] eng = {"love", "baby", "money", "future", "hope"};
    public static String kor2Eng(String word) {
        for(int i=0; i<kor.length; i++) {
            if(kor[i].equals(word)) {
                return eng[i];
            }
        }
        return null;
    }
}
class DicApp{
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("한글 단어?");
            String t = scanner.next();
            if(t.equals("그만"))
                break;
            String word=Dictionary.kor2Eng(t);
            if(word==null)
            {
                System.out.println(getPostPosition(t, "은", "는")+" 저의 사전에 없습니다.");
            }
            else
                System.out.println(getPostPosition(t, "은", "는")+ " " + Dictionary.kor2Eng(t));
        }
    }
    public static final String getPostPosition(String name, String firstValue, String secondValue) {
        char lastName = name.charAt(name.length() - 1);

        // 한글의 제일 처음과 끝의 범위 밖일 경우는 오류
        if (lastName < 0xAC00 || lastName > 0xD7A3) { return name;}

        String seletedValue = (lastName - 0xAC00) % 28 > 0 ? firstValue : secondValue;

        return name+seletedValue;
    }
}