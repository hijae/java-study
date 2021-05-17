package com.company;
import java.util.Scanner;

public class Main {
    public static boolean inRect(int x,int y){
        if ((x>=100 && x <= 200) && y>=100 && y<=200)
        {
            return true;
        }
        else return false;
    }
    public static <string> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first coordination(x1, y1)>> ");
        int x1=scanner.nextInt();
        int y1=scanner.nextInt();

        System.out.print("Input the second coordination(x2, y2)>> ");
        int x2=scanner.nextInt();
        int y2=scanner.nextInt();

        if(inRect(x1,y1) || inRect(x1,y2) || inRect(x2,y1) || inRect(x2,y2))
        {
            System.out.println("Yes, two rectangles are collided.");
        }
        else System.out.println("No, two rectangles are NOT collided.");
    }
}
