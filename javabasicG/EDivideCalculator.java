package javabasicG;

import java.util.Scanner;

public class EDivideCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("==== 나눗셈 계산기 ====");
        try{
            System.out.println("첫 번째 숫자 입력 : ");
            int num1 = Integer.parseInt(sc.nextLine());
            System.out.println("두 번째 숫자 입력 : ");
            int num2 = Integer.parseInt(sc.nextLine());

            // int result = num1 / num2; // ArithmeticException 가능
            double result = num1 / num2;


            System.out.println("결과 : "+ result);
        } catch(NumberFormatException e) {
            System.out.println("숫자만 입력하세요!!!");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (Exception e) {
            System.out.println("알 수 없는 오류!!!!!");
        }

        sc.close();
    }
}
