package javabasicB;

import java.util.Scanner;

public class ForBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("기본 for문 실행 확인");
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
            System.out.println("i = " + i + " (반복 " + i + "회차)");
        }
        System.out.println("\n === 1부터 100까지의 합===");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1부터 100까지의 합계는" + sum);
        System.out.println("\n =======4단 구구단=======");
        for (int i = 1; i <= 9; i++) {
            System.out.println("4 x " + i + " = " + (4 * i));
        }

        System.out.println("\n === 출력되는 구구단 선택 ====");
        System.out.println("출력할 단을 입력하세요");
        int dan = sc.nextInt();
        System.out.println("\n " + dan + "단");
        System.out.println("------------------");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %d/n", dan, i, dan * i);
        }
        int n = sc.nextInt();
        int evenSum1 = 0;
        for (int i = 2; i <= n; i += 2) {
            evenSum1 += i;
        }
        System.out.println("방식1 결과 2씩 증가하는 증감식 결과 : " + evenSum1);

        int evenSum2 = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum2 += i;
            }
        }
        System.out.println("방식2 결과 i가 2의 배수인 경우에만 누적 더하기 : " + evenSum2);
        int evenSum3 = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                continue;
            }
            evenSum3 += i;
        }
        System.out.println("방식3 결과 i가  : " + evenSum3);
        sc.close();
    }
}
