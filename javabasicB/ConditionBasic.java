package javabasicB;

import java.util.Scanner;

public class ConditionBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("단일 조건문 연습");
        System.out.println("점수를 입력하세요");
        int score = sc.nextInt();
        if (score >= 90) {
            System.out.println("축하합니다. 장학금 대상이 되셨습니다.");
        }
        // Scanner sc = new Scanner(System.in);

        System.out.println("점수를 입력하세요.");
        int num1 = sc.nextInt();

        if(num1>=90){
        System.out.println("장학금 대상입니다.");
        }else{
        System.out.println("장학금 대상이 아닙니다.");
        }

        System.out.println("\n========================");
        sc.close();
        // }
        System.out.println("\n === if-else 연습 ===");
        System.out.println("숫자를 입력해보세요");
        int num = sc.nextInt();
        if ((num % 2) == 0) {
            System.out.println("입력한 숫자 " + num + "은(는) 짝수입니다.");
        } else {
            System.out.println("입력한 숫자 " + num + "은(는) 홀수입니다.");
        }
        System.out.println("\n============놀이 기구 탑승 가능 여부 ============");
        System.out.println("나이를 입력하세요:");
        int age = sc.nextInt();
        System.out.println("키를 입력하세요:");
        double height = sc.nextDouble();

        if (age>=8) {
            if(height>=120){
                System.out.println("탑승 가능합니다.");
            }else{
                System.out.println("키가 작아서 탑승할 수 없습니다.");
            }
        }else{
            System.out.println("나이가 어려 탑승할 수 없습니다.");
        }

        String adminId = "admin";
        String adminPw = "a1234";
        System.out.println("\n============ 관리자 로그인 ============");
        System.out.println("아이디를 입력하세요 :");
        String id = sc.next();
        System.out.println("비밀번호를 입력하세요 :");
        String password = sc.next();

        if(id.equals(adminId)){
            if(password.equals(adminPw)){
                System.out.println("로그인에 성공하셨습니다.");
            }else{
                System.out.println("비밀번호가 틀렸습니다.");
            }
        }else{
            System.out.println("아이디가 틀렸습니다.");
        }

        sc.close();
    }
}
