package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Km2Mile toMile = new Km2Mile(1.6);
        toMile.run();
    }
}
abstract class Converter {
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
        System.out.print(getSrcString() + "을 입력하세요>> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: " + res + getDestString() + "입니다.");
        scanner.close();
    }
}
class Km2Mile extends Converter {
    public Km2Mile(double ratio) {
        super();
        this.ratio=ratio;
    }

    @Override
    protected double convert(double src) {
        return src/1.6;
    }

    @Override
    protected String getSrcString() {
        return "Km";
    }

    @Override
    protected String getDestString() {
        return "Mile";
    }
}