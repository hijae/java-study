package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String [] arg){
        Scanner scanner = new Scanner(System.in);
        int a,b;
        String k;
        System.out.print("두 정수와 연산자를 입력하시오>>");
        a=scanner.nextInt();
        b=scanner.nextInt();
        k=scanner.next();
        boolean flag=false;
        if(k.equals("+"))
        {
            Add add = new Add();
            add.setValue(a,b);
            System.out.println(add.calculate());
            flag=true;
        }
        if(k.equals("-"))
        {
            Sub sub=new Sub();
            sub.setValue(a,b);
            System.out.println(sub.calculate());
            flag=true;
        }
        if(k.equals("*"))
        {
            Mul mul = new Mul();
            mul.setValue(a,b);
            System.out.println(mul.calculate());
            flag=true;
        }
        if(k.equals("/"))
        {
            Div div = new Div();
            div.setValue(a,b);
            System.out.println(div.calculate());
            flag=true;
        }
        if(flag==false)
        {
            System.out.println("해당하는 연산이 없습니다.");
        }
    }
}
class Add{
    int a, b;
    void setValue(int a, int b) {
        this.a=a;
        this.b=b;
    }
    int calculate() {
        return a+b;
    }
}
class Sub{
    int a, b;
    void setValue(int a, int b) {
        this.a=a;
        this.b=b;
    }
    int calculate() {
        return a-b;
    }
}
class Mul{
    int a, b;
    void setValue(int a, int b) {
        this.a=a;
        this.b=b;
    }
    int calculate() {
        return a*b;
    }
}
class Div{
    int a, b;
    void setValue(int a, int b) {
        this.a=a;
        this.b=b;
    }
    int calculate() {
        return a/b;
    }
}
