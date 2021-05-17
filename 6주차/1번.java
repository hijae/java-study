package com.company;
class Circle {
    int x, y, n;

    public Circle(int x, int y, int n) {
        this.x=x;
        this.y=y;
        this.n=n;

    }

    public String toString() {
        return "Circle("+x+","+y+")반지름"+n;
    }
    public boolean equals(Object a){
        Circle cir=(Circle) a;
        return x==cir.x && y==cir.y;
    }
}
public class Main {
    public static void main(String[] args) {
        Circle a = new Circle(2, 3, 5);
        Circle b = new Circle(2, 3, 20);
        System.out.println("원 a : " + a);
        System.out.println("원 b : " + b);
        if(a.equals(b)) System.out.println("같은 원");
        else System.out.println("서로 다른 원");
    }
}