package javabasic;

public class TypeCasting {
    public static void main(String[] args) {
        // 자동타입 변환 (작은타입 --> 큰타입 )
        System.out.println("=== 자동 타입 변환 ====");
        byte byteVal = 10;
        int intVal = byteVal;        // byt -->int 자동 변환
        long longVal = intVal;       // int -->long 자동 변환
        float floatVal = longVal;    // long -->float 자동 변환
        double doubleVal = floatVal; // float -->double 자동 변환
        System.out.println("byte - > int :" +intVal);
        System.out.println("int - > long :" +longVal);
        System.out.println("long - > float :" +floatVal);
        System.out.println("float - > double :" +doubleVal);
        
        //강제 타입 변환 (큰 타입 -> 작은 타입 )
        System.out.println("\n === 강제 타입 변환 ====");
        int num1 = 1000;
        byte num2 = (byte)num1; //int -> byte (손실가능)
        System.out.println("원본 int : "+num1);
        System.out.println("변환 byte : "+num2);

        double d = 3.14;
        int i =(int)d; // double -> int (소수점 버림)
        System.out.println("원본 double: "+d);
        System.out.println("변환 int :"+i);

        System.out.println("\n ==== 연산시 타입 자동변환, 강제 변환 ===");
        int num3 = 10;
        double num4 = 3.6;
        double result1 = num3+num4; //int가 double로 자동변환
        System.out.println("10 + 3.6 = "+result1);
        int result2 = (int)(num3+num4); // 결과 int로 강제 변환
        System.out.println("(int)(10+3.6) = " +result2);

        //문자와 숫자 변환
        System.out.println("\n=== 문자와 숫자 변환 ====");
        char ch = 'A';
        int ascii = ch; // char -> int : ASCII CODE 값
        System.out.println("'A'의 ASCII코드 : "+ascii);
        int code = 66;
        char letter = (char)code;
        System.out.println(" ASCII 66: "+letter);

        // String과 기본형 변환
        System.out.println("\n=== String 변환 ====");
        String str1 = "123";
        int numFromStr = Integer.parseInt(str1); // string ->int || parseDouble()
        System.out.println("String \"123\" -> int : "+numFromStr);

        int numVal = 456;
        String strFromNum = String.valueOf(numVal); // int -> string
        System.out.println("int 456 -> string : \""+strFromNum+"\"");
    }
}
