package javabasicB;

import java.util.Scanner; // Scanner class 호출

public class ScannerBasic {
    public static void main(String[] args) {
        //Scanner객체 생성
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("=== 정보 입력 ===");
        String name =  scanner.next();
        
        System.out.println("이름 : "+name);

        scanner.close();
    }

}
