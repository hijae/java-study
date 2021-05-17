
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.print("Input money>> ");
        Scanner scanner = new Scanner(System.in);
        int money=scanner.nextInt();
        if(money/50000!=0) {
            System.out.print(money / 50000);
            System.out.println(" 50,000won bill(s)");
            money = money % 50000;
        }
        if(money/10000!=0) {
            System.out.print(money / 10000);
            System.out.println(" 10,000won bill(s)");
            money = money % 10000;
        }
        if(money/1000!=0) {
            System.out.print(money / 1000);
            System.out.println(" 1,000won bill(s)");
            money = money % 1000;
        }
        if(money/500!=0) {
            System.out.print(money / 500);
            System.out.println(" 500won coin");
            money = money % 500;
        }
        if(money/100!=0) {
            System.out.print(money / 100);
            System.out.println(" 100won coin(s)");
            money = money % 100;
        }
        if(money/50!=0) {
            System.out.print(money / 50);
            System.out.println(" 50won coin");
            money = money % 50;
        }
        if(money/10!=0) {
            System.out.print(money / 10);
            System.out.println(" 10won coin(s)");
            money = money % 10;
        }
        if(money!=0) {
            System.out.print(money);
            System.out.println(" 1won coin(s)");
        }
    }
}
