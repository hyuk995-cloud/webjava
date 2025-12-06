package javabasicE;

public class OverLoadingRule {
    // 1개 매개변수
    void print(int a) {
        System.out.println("숫자 1개 - " + a);
    }

    // 2개 매개 변수
    void print(int a, int b) {
        System.out.println("숫자 2개 - " + a + ", " + b);
    }

    void print(int a, int b, int c) {
        System.out.println("숫자 3개 - " + a + ", " + b + ", " + c);
    }

    void display(int number){
        System.out.println("정수 : "+number);
    }

    void display(double number){
        System.out.println("실수 : "+number);
    }

    void display(String text){
        System.out.println("문자열 : "+text);
    }

    public static void main(String[] args) {
        OverLoadingRule obj = new OverLoadingRule();
        obj.print(10);
        obj.print(10, 20);
        obj.print(10, 20, 30);
        obj.display(100);
        obj.display(3.14);
        obj.display("overloading");
    }
}
