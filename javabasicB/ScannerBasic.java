package javabasicB;

import java.util.Scanner; // Scanner class 호출

public class ScannerBasic {
    public static void main(String[] args) {
        //Scanner객체 생성
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== 정보 입력 ===");

        
        System.out.println("이름 : ");
        String name =  scanner.next();

        System.out.println("나이 : ");
        int age =  scanner.nextInt();

        System.out.println("키(cm) : ");
        double height =  scanner.nextDouble();

        System.out.println("\n ==== 입력 결과 =====");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age + "세");
        System.out.println("키 : " + height);

        scanner.close();
    }

}
