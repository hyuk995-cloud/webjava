package javabasicD;

public class MathUtil {
    //상수 정의(static final)
    public static final double PI = 3.141592;
    
    //static method
    public static int add(int a, int b){
        return a+b;
    }
    public static int subtract(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static double divide(int a, int b){
        if(b==0){
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return (double)a/b;
    }
    public static int max(int a, int b){
        return (a>b) ? a:b; //(a>b)가 사실이면 true실행 : false 실행
    }
    public static int min(int a, int b){
        return (a<b) ? a:b;
    }
    public static double circleCircumference(double radius){
        return 2*PI*radius;
    }
    public static double circleArea(double radius){
        return PI*radius*radius;
    }
    
}
