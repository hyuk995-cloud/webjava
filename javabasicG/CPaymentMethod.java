package javabasicG;

public interface CPaymentMethod {
    //결제 처리
    boolean pay(int amount);
    String getMethodName();
}
