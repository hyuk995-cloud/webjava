package javabasicG;

public class CPaymentTest {
    public static void main(String[] args) {
        System.out.println("=== 결제 시스템 ====");

        // 결제 시스템 생성
        CPaymentSystem system = new CPaymentSystem();
        
        // 여러 결제 방식 생성
        CPaymentMethod card = new CCreditCard("1234-5678", 500000);
        CPaymentMethod cash = new CCash(1000000);

        //결제 처리
        system.processPayment(card,50000);
        system.processPayment(cash,30000);

        //실패

        system.processPayment(cash,8000000);



    }
}
