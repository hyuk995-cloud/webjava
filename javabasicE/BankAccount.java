package javabasicE;

public class BankAccount {
    //정적 변수
    private static int totalAccounts = 0;
    private static int nextAccountNumber = 1000;

    //인스턴스 변수 - 계좌번호, 예금주, 잔액
    private int accountNumber;
    private String ownerName;
    private int balance;

    //생성자
    public BankAccount(String ownerName, int initialBlance){
        this.accountNumber = nextAccountNumber++;
        this.ownerName = ownerName;
        this.balance = initialBlance;
        totalAccounts++;
        System.out.println("계좌 개설 완료~");        
        System.out.println("계좌 번호 : "+accountNumber);
        System.out.println("예금주 : "+ownerName);
        System.out.println("초기 잔액 : "+balance+"원");
    }

    //입금 -- 메서드 선언
    public void deposit(int amount){
        if(amount > 0){
            balance += amount;
            System.out.println(amount+"원이 입금되었습니다.");
            System.out.println("현재 잔액: "+balance+"원");
        }else{
            System.out.println("올바른 금액을 입력하세요.");
        }
    }
    //출금
    public void withdraw(int amount){
        if(amount > 0 && amount <= balance){
            balance-=amount;
            System.out.println(amount+"원이 출금되었습니다.");
            System.out.println("현재 잔액: "+balance+"원");
        }else if(amount > balance){
            System.out.println("잔액이 부족합니다.");
        }else{
            System.out.println("올바른 금액을 입력하세요.");
        }
    }

    //이체
    public void rtansfer(BankAccount target, int amount){
        if(amount > 0 && amount <= balance){
            this.balance-=amount;
            target.balance+=amount;
            System.out.println("이체 완료");
            System.out.println("내 계좌 잔액: "+this.balance+"원");
            System.out.println(target.ownerName+"님 잔액: "+target.balance+"원");
        }else if(amount > balance){
            System.out.println("잔액이 부족합니다.");
        }else{
            System.out.println("올바른 금액을 입력하세요.");
        }
    }
    //계좌 정보 출력
    public void printInfo(){
        System.out.println("==========");
        System.out.println("계좌번호"+accountNumber);
        System.out.println("예금주"+ownerName);
        System.out.println("잔액"+balance+"원");
        System.out.println("==========");
    }
    
    //전체 계좌 수 조회
    public static int getTotalAccounts(){
        return totalAccounts;
    }
    //잔액 호출
    public int getBlacne(){
        return this.balance;
    }
    //이자 계산
    public static int calculateInterest(int balance, double rate){
        return (int)(balance+rate);
    }
}
