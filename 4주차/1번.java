package com.company;
public class Main {
    public static void main(String [] arg) {
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }
}
class TV {
    //add code here.
    String maker;
    int year;
    int size;
    public TV(String maker, int year, int size) {
        this.maker = maker;
        this.year = year;
        this.size = size;
    }
    public void show() {
        System.out.println(maker+"에서 만든 "+year+"년형 "+size+"인치 TV");
    }
}