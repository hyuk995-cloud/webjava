package javabasicG;

public class CCreditCard implements CPaymentMethod {
    private String cardNumber;
    private int balance;
    public CCreditCard(String cardNumber, int balance){
        this.cardNumber = cardNumber;
        this.balance = balance;
    }
    @Override
    public boolean pay(int amount){
        if(balance >= amount){
            balance-=amount;
            System.out.println("[카드 결제]" + amount + "원 결제 완료.");
            System.out.println("잔액 : "+balance+"원");
            return true;
        }else{
            System.out.println("[카드 결제] 잔액 부족");
            return false;
        }
    }

    @Override
    public String getMethodName(){
        return "체크카드("+cardNumber+")";
    }
}
