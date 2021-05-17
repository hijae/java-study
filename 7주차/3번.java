package com.company;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        CustomerManager man = new CustomerManager();
        man.run();
    }
}
class CustomerManager{
    private HashMap<String, Integer> map = new HashMap<String, Integer>();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("** 포인트 관리 프로그램입니다 **");
        String name;
        int p;
        while (true) {
            System.out.print("이름과 포인트 입력>> ");
            name=scanner.next();
            if(name.equals("그만")) break;
            p=scanner.nextInt();
            if(map.containsKey(name))
            {
                p+=map.get(name);
                map.put(name,p);
            }
            else map.put(name,p);
            printAll();
        }
    }
    void printAll() {  // HashMap의 모든 원소를 출력하는 메소드
        Set<String> keys=map.keySet();
        Iterator<String> it=keys.iterator();

        while (it.hasNext()){
            String name= it.next();
            int score=map.get(name);
            System.out.print("("+name+", "+score+")");
        }
        System.out.println();
    }
}
