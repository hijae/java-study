package com.company;
public class Main {
    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}
class TV {
    private int size;
    public TV(int size) { this.size = size; }
    protected int getSize() { return size; }
}
class ColorTV extends TV{
    public ColorTV(int size) {
        super(size);
    }
}
class IPTV extends ColorTV{
    String address;
    int color;
    public IPTV(String addrres, int size, int color) {
        super(size);
        this.address=addrres;
        this.color=color;
    }

    public void printProperty() {
        System.out.println("나의 IPTV는 "+address+" 주소의 "+getSize()+"인치 "+color+"컬러");
    }
}