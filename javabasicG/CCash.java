package javabasicG;

public class CCash implements CPaymentMethod {
    private int amount; // 가지고 있는 현금
    public CCash(int amount){
        this.amount = amount;
    }
    
    @Override
    public boolean pay(int price){
        if(amount >= price){
            int change = amount - price;
            System.out.println("[현금결제] "+price+"원 결제 완료");
            System.out.println("거스름 돈 "+change+"원");
            return true;
        }else{
            System.out.println("[현금 결제] 현금 부족!");
            return false;
        }

    }
    @Override
    public String getMethodName(){
        return "현금";
    }
}
