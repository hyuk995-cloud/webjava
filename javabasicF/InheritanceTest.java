package javabasicF;

public class InheritanceTest {
    public static void main(String[] args) {
        //상품 생성
        Electronics laptop = new Electronics("삼성", 1500000, 24);
        Food apple = new Food("사과",5000,"2025-12-31");

        //상속 메서드, 개별 메서드
        laptop.printInfo(); //Product //부모 메서드 - 상속
        laptop.showWarranty(); //Electronics // 자식 메서드 - 개별
        System.out.println("할인가 : "+laptop.getDiscountPrice()+"원 \n");

        apple.printInfo(); //Product //부모 메서드 - 상속
        apple.showExprieDate(); //Food // 자식메서드 - 개별
        System.out.println("할인가 : "+apple.getDiscountPrice()+"원");
    }
}
