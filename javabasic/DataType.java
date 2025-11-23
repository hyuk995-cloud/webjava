package javabasic;

public class DataType {
    public static void main(String[] arg) {
        //정수형
        byte byteNum = 127;
        short shortNum = 32767;
        int intNum = 2147483647;
        long longNum = 9223372036854775807L;
        System.out.println("=== 정수타입 ====");
        System.out.println("byte: " +byteNum);
        System.out.println("shor: " +shortNum);
        System.out.println("int: " +intNum);
        System.out.println("long: " +longNum);
        //실수 타입
        float floatNum = 3.14f;
        double doubleNum = 3.141592653589793;
        System.out.println("\n ===실수(자연수) ===");
        System.out.println("float: "+floatNum);
        System.out.println("double: "+doubleNum);
        //문자타입
        char grade = 'a';
        char unicode ='\uAC01';
        System.out.println("\n === 문자타입 ===");
        System.out.println("grad: "+grade);
        System.out.println("unicode: "+unicode);
        //논리형
        boolean isStudent = true;
        boolean isGradeuated = false;
        System.out.println("\n === 논리형 === ");
        System.out.println("isStudent" +isStudent);
        System.out.println("isGraduated: "+isGradeuated);

        //리터럴 표현
        int decimal = 100;
        int binary = 0b1100100; //2진수 ( 0b 접두사)
        int octal = 0144; //8진수 (0 접두사)
        int hexa = 0x64; //16진수 (0x 접두사)
        System.out.println("\n=== 리터럴 ===");
        System.out.println("decimal: "+decimal);
        System.out.println("binary: "+binary);
        System.out.println("octal: "+octal);
        System.out.println("hexa: "+hexa);
        }
    
}
