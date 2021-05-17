package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String [] arg) {
        PhoneBook phonebook = new PhoneBook();
        phonebook.run();
    }
}
class Phone {
    private String name;
    private String tel;
    public Phone(String name, String tel) {
        this.name = name; this.tel = tel;
    }
    public String getName() { return name; }
    public String getTel() { return tel; }
}
class PhoneBook {
    private Scanner scanner;
    Scanner Sc = new Scanner(System.in);
    private Phone [] pArray;
    public PhoneBook() {
        int n=0;
        while (n<=0)
        {
            System.out.print("인원수>>");
            n=Sc.nextInt();
        }
        pArray=new Phone[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name=Sc.next();
            String tel=Sc.next();
            pArray[i]= new Phone(name,tel);
        }
        System.out.println("저장되었습니다...");
    }
    void run() {
        while(true){
            System.out.print("검색할 이름>>");
            String name=Sc.next();
            if(name.equals("그만")){
                break;
            }
            String tel = search(name);
            if(tel==null)
                System.out.println(name+" 이 없습니다.");
            else
                System.out.println(name+"의 번호는 "+tel+" 입니다.");
        }
    }
    String search(String name) {
        for(int i=0; i<pArray.length; i++) {
            if(pArray[i].getName().equals(name))
                return pArray[i].getTel();
        }
        return null;
    }
}