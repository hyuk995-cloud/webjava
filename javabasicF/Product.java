package javabasicF;

public class Product {
    protected String name;
    protected int price;

    //생성자
    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    //정보 출력
    public void printInfo(){
        System.out.println("상품명 : " + name);
        System.out.println("가격 : "+price+"원");
    }

    //할인가 계산( 10% 기본 할인 )
    public int getDiscountPrice(){
        return (int)(price*0.9);
    }
}
