package javabasic;

public class VariableBasic {
    public static void main(String[] args) {
        //변수 선언
        int age;
        // 변수 초기화
        age = 31;
        //선언과 초기화 동시
        String name = "홍길동";
        double height = 185.7;
        //변수 여러개 동시 선언
        int x, y, z;
        x = 10;
        y = 20;
        z = 30;
        //다중 선언과 초기화
        int a = 1, b = 2, c = 3;
        System.out.println("이름 : " +name);
        System.out.println("나이 : " +age);
        System.out.println("키 :" +height+ "cm");
        System.out.println("x+ y + z =" +(x+y+z));
        System.out.println("a x b x c = "+(a*b*c));
        //변수 변경
        age = 32;        
        System.out.println("변경나이 :" +age);
    }
}
