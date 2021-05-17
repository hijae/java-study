package com.company;
import java.util.*;

public class Main{
    public static void printBig(Vector<Integer> v){ // 벡터 v의 정수 중 가장 큰 수 출력
        int big=Collections.max(v);

        System.out.println("가장 큰 수는 " + big);	// 가장 큰 수가 변수 big에 저장되어 있다고 가정
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        int t;
        v.clear();
        System.out.print("정수(-1이 입력될 때까지)>> ");
        while (true) {
            t=sc.nextInt();
            if(t==-1)
                break;
            if(t>0)
                v.add(t);
        }
        if(v.size()==0) {
            System.out.println("수가 하나도 없음");
        }
        else {
            printBig(v);
        }
    }
}
