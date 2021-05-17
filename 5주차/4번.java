package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StackApp.run();
    }
}
interface Stack {
    int length(); // 현재 스택에 저장된 개수 리턴
    int capacity(); // 스택의 전체 저장 가능한 개수 리턴
    String pop(); // 스택의 톱(top)에 실수 저장
    boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
}
class StringStack implements Stack {

    int len=-1;
    private String[] arr;

    public StringStack(int cap) {
        arr = new String[cap];
    }

    @Override
    public int length() {
        return this.len+1;
    }

    @Override
    public int capacity() {
        return this.arr.length;
    }

    @Override
    public String pop() {
        if(len == -1)
            return null;
        len--;
        return this.arr[len+1];
    }

    @Override
    public boolean push(String str) {
        if(len == arr.length-1)
            return false;
        else {
            len++;
            arr[len] = str;
            return true;
        }
    }
}
class StackApp {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int cap=scanner.nextInt();
        StringStack stack = new StringStack(cap);

        while(true) {
            System.out.print("문자열 입력 >> ");
            String arr = scanner.next();
            if(arr.equals("그만"))
                break;
            boolean res = stack.push(arr);
            if(res == false) {
                System.out.println("스택이 꽉 차서 푸시 불가!");
            }
        }
        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        int len = stack.length();
        for(int i=0; i<len; i++) {
            System.out.print(stack.pop() + " ");
        }
    }
}
