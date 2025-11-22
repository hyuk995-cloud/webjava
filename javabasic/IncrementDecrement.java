package javabasic;

public class IncrementDecrement {
    public static void main(String[] args) {
       System.out.println("==== 전위 증감 연산자 ====");
       int a = 5;
       System.out.println("초기값 a = "+a);
       System.out.println("++a = "+ (++a));
       System.out.println("현재 a = " + a);
       System.out.println("--a = " (--a));
       System.out.println("현재 a = "+ a);
       System.out.println("\n==== 전위 증감 연산자 ====");
       int b = 5;
       System.out.println("초기값 b = "+b);
       System.out.println("b++ = "+ (b++));
       System.out.println("현재 b = " + b);
       System.out.println("b-- = " (b--));
       System.out.println("현재 b = "+ b);
       System.out.println("\n==== 연산예제 ====");
       int x = 10;
       int y = 20;
       int result1 = ++x + y++; // (11)+(20) 이후에 y 21
       System.out.println("++x + y++ =" +result1); // 31
       System.out.println("x = "+x + ", y = "+y);



    }
    
}
