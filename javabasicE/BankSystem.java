package javabasicE;

public class BankSystem {
    public static void main(String[] args) {
        System.out.println("==== 은행 계좌 시스템 ====\n");
        
        //계좌 개설
        BankAccount account1 = new BankAccount("홍길동", 10000);
        System.out.println();
        BankAccount account2 = new BankAccount("김철수", 50000);
        System.out.println();
        BankAccount account3 = new BankAccount("이영희", 200000);
        System.out.println();//줄바꿈용 프린트린
        
        //전체 계좌수 확인
        System.out.println("현재 총 계좌 수 : "+BankAccount.getTotalAccounts());
        System.out.println();

        //입금
        System.out.println("==== 입금 연습 ====");
        account1.deposit(50000);
        System.out.println();

        //출금
        System.out.println("=== 출금 연습 ====");
        account2.withdraw(50000);
        System.out.println();

        //이체
        System.out.println("=== 이체 연습 ===");
        System.out.println("홍길동이 이영희에게 30000원 이체");
        account1.rtansfer(account3, 30000);
        System.out.println();

        //현재 게좌 정보 확인
        System.out.println("==== 전체 계좌 정보 ====");
        account1.printInfo();
        account2.printInfo();
        account3.printInfo();

        //이자 계산
        System.out.println("\n ==== 이자 계산(연3%) ====");
        BankAccount[] accounts = {account1, account2, account3};
        
        for(int i = 0; i < accounts.length; i++){
            BankAccount a = accounts[i];
            a.printInfo();
            int interest = BankAccount.calculateInterest(a.getBlacne(), 0.03);
            System.out.println("예상 이자 : "+interest+"원\n");
            
        }
    }
}
