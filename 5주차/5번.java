package com.company;
import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        int a,b;
        String k;
        Calc calc = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오>>");
        a=scanner.nextInt();
        b=scanner.nextInt();
        k=scanner.next();
        if(k.equals("+")){
            calc=new Add();
        }
        else if(k.equals("-"))
        {
            calc=new Sub();
        }
        else if(k.equals("*")){
            calc=new Mul();
        }
        else if(k.equals("/"))
        {
            if(b==0){
                System.out.println("계산할 수 없습니다.");
                return;
            }
            calc=new Div();
        }
        else{
            System.out.println("잘못된 연산자입니다.");
            return;
        }
        calc.setValue(a,b);
        System.out.println(calc.calculate());
    }
}
abstract class Calc { // 추상 클래스
    public int a,b;
    public void setValue(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    public abstract int calculate();
}
class Add extends Calc {
    public int calculate() {
        return a+b;
    }
}
class Mul extends Calc {
    public int calculate() {
        return a*b;
    }
}
class Sub extends Calc {
    public int calculate() {
        return a-b;
    }
}
class Div extends Calc {
    public int calculate() {
        return a/b;
    }
}
