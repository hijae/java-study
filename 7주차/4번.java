package com.company;

import java.util.*;
import java.util.Vector;

public class Main {
    public static void main(String [] args) {
        GraphicEditor ge = new GraphicEditor("beauty");
        ge.run();
    }
}


class GraphicEditor {
    private String editorName;
    private Scanner scanner = new Scanner(System.in);
    private Vector<Shape> v = new Vector<Shape>();

    public GraphicEditor(String editorName) {
        this.editorName = editorName;
    }

    public void run() {
        System.out.println("그래픽 에디터 beauty를 실행합니다.");
        int t,k,flag=0;
        while (flag==0)
        {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            t= scanner.nextInt();
            switch (t)
            {
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3)>>");
                    k=scanner.nextInt();
                    if(k>0 && k<4)
                    {
                        insert(k);
                    }
                    else
                    {
                        System.out.println("잘못 선택하셨습니다.");
                    }
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치>>");
                    k=scanner.nextInt();
                    if(!delete(k))
                    {
                        System.out.println("삭제할 수 없습니다.");
                    }
                    break;
                case 3:
                    view();
                    break;
                case 4:
                    flag=1;
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    continue;
            }
        }
        System.out.println("beauty를 종료합니다.");
    }

    private void view() {
        for(int i=0; i<v.size(); i++) v.get(i).draw();
    }

    private boolean delete(int index) {
        if (v.size() == 0 || index >= v.size()) // 리스트가 비거나, 인덱스에 도형이 없는 경우
            return false;
        v.remove(index);
        return true;
    }

    private void insert(int choice) {
        Shape shape=null;
        switch (choice) {
            case 1: // Line
                shape = new Line();
                break;
            case 2: // Rect
                shape = new Rect();
                break;
            case 3: // Circle
                shape = new Circle();
        }
        v.add(shape);
    }
}

abstract class Shape {
    private Shape next;
    public Shape() { next = null;}
    public void setNext(Shape obj) {next = obj;} // 링크 연결
    public Shape getNext() {return next;}
    public abstract void draw();
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Circle");
    }

}
class Line extends Shape {
    public void draw() {
        System.out.println("Line");
    }
}
class Rect extends Shape {
    public void draw() {
        System.out.println("Rect");
    }

}