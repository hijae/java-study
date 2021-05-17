package com.company;
import java.util.*;


public class Main{
    public static void print(Vector<Integer> v){
        int sum=0;
        for(int i=0;i< v.size();i++)
        {
            sum+=v.elementAt(i);
            System.out.print(v.elementAt(i)+" ");
        }
        System.out.println();
        sum=sum/(v.size());
        System.out.println("현재 평균 "+sum);
    }
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int t;
        Vector<Integer> v=new Vector<>();
        while (true)
        {
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            t=scanner.nextInt();
            v.add(t);
            if(t==0) break;
            print(v);
        }
    }
}

