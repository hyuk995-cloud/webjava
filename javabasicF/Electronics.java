package javabasicF;

public class Electronics extends Product {
    private int warranty;

    public Electronics(String name, int price, int warranty){
        super(name, price); // 부모 생성자 호출
        this.warranty = warranty;
    }

    //메서드 추가
    public void showWarranty(){
        System.out.println("보증 기간 : "+warranty+ "개월");
    }
}
