package javabasicG;

public class CPaymentSystem {
    //인터페이스 타입 받아서 -- 어떤 결제 방식이든 처리
    public void processPayment(CPaymentMethod method, int amount){
        System.out.println("\n ==================================");
        System.out.println("결제 수단 : "+method.getMethodName() );
        System.out.println("결제 금액 : "+amount+"원 ");
        System.out.println("\n ==================================");
        boolean success = method.pay(amount);
        if( success ){
            System.out.println("결제 성공");
        }else{
            System.out.println("결제 실패!");
        }
    }
}
