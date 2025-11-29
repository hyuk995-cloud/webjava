package javabasicC;

import java.util.Scanner;

public class AtmProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        boolean running = true;

        System.out.println("========================================");
        System.out.println("              ATM Program               ");
        System.out.println("========================================");
        System.out.println("현재 잔액 : " + balance + "원 \n");
        while (running) {
            System.out.println("=====================");
            System.out.println("1. 잔액조회");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 이체");
            System.out.println("0. 종료");
            System.out.println("====================");
            System.out.println("메뉴 선택 : ");

            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("\n [잔액조회]");
                    System.out.println("현재 잔액 : " + balance + "원 \n");
                    break;

                case 2:
                    System.out.println("\n [입금]");
                    System.out.println("입금할 금액 : ");
                    int deposit = sc.nextInt();
                    if( deposit <= 0){
                        System.out.println("올바른 금액을 입력하세요. \n");
                        continue;
                    }
                    balance += deposit;
                    System.out.println(deposit+"원이 입금되었습니다.");
                    System.out.println("현재 잔액 : " + balance +"원\n");
                    break;

                case 3:
                    System.out.println("\n [출금]");
                    System.out.println("출금할 금액 : ");
                    int withdraw = sc.nextInt();
                    if (withdraw > balance){
                        System.out.println("출금할 금액이 잔액보다 큽니다.\n");
                        continue;
                    }
                    if (withdraw <=0){
                        System.out.println("올바른 금액을 입력해주세요.\n");
                        continue;
                    }
                    balance -= withdraw;
                    System.out.println(withdraw+"원이 출금되었습니다.");
                    System.out.println("현재 잔액 : " + balance +"원\n");
                    break;

                case 4:
                    System.out.println("\n [이체]");
                    System.out.println("받는 사람 계좌번호 : ");
                    String account = sc.next();

                    System.out.println("이체할 금액 : ");
                    int transfer = sc.nextInt();

                    if (transfer > balance){
                        System.out.println("이체할 금액이 잔액보다 큽니다.");
                        continue;
                    }
                    if (transfer < 0){
                        System.out.println("올바른 금액을 입력해주세요.");
                        continue;
                    }

                    balance -= transfer;
                    System.out.println(account+" 계좌로 "+transfer+" 원이 출금되었습니다.");
                    System.out.println("현재 잔액 : " + balance +"원\n");
                    break;

                case 0:
                    System.out.println("\n ATM을 종료합니다.");
                    System.out.println("이용해주셔서 감사합니다.");
                    running = false;
                    break;

                default:
                    System.out.println("\n 메뉴 선택이 잘못되었습니다. \n올바른 숫자를 입력해주세요.");
                    break;
            }
        }
        sc.close();
    }
}
