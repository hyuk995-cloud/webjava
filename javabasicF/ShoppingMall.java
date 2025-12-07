package javabasicF;

public class ShoppingMall {
    public static void main(String[] args) {
        System.out.println("==== 쇼핑몰 장바구니 ====\n");
        
        // 장바구니 생성
        ShoppingCart cart = new ShoppingCart(10);
        
        // 상품 추가 (다형성)
        cart.addItem(new ElectronicsItem("lg노트북", 1200000, 24));
        cart.addItem(new FoodItem("사과", 3000,"2026-1-20"));
        cart.addItem(new ClothingItem("티셔츠", 5000, "L"));
        cart.addItem(new ElectronicsItem("삼성노트북", 2000000, 24));
        cart.addItem(new FoodItem("수박", 10000,"2026-1-20"));
        cart.addItem(new ClothingItem("바지", 35000, "XL"));
        cart.addItem(new ElectronicsItem("아이폰", 1500000, 24));
        cart.addItem(new FoodItem("복숭아", 5000,"2026-1-20"));
        cart.addItem(new ClothingItem("청바지", 15000, "XL"));

        cart.showItems(); // 장바구니 확인
        cart.showStatistics(); // 통계보기
        cart.printReceipt(); // 영수증 출력
    }
}
