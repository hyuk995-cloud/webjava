package javabasicB;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("기본 계산기 만들기 ");
        System.out.println("======================");

        System.out.println("첫 번째 숫자 입력하세요.");
        double num1 = sc.nextDouble();
        System.out.println("연산자를 입력하세요. (+,-,*,/) ");
        String operator = sc.next();
        System.out.println("두 번째 숫자 입력하세요.");
        double num2 = sc.nextDouble();

        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;

            default:
                System.out.println("오류 : 잘못된 연산자입니다.");
                break;
        }
        System.out.println("\n========================");
        System.out.println("계산 결과");
        System.out.printf("%.2f %s %.2f = %.2f", num1, operator, num2, result);
        sc.close();
    }

}
