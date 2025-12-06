package javabasicE;

public class CarMaker {
    public static void main(String[] args) {
        System.out.println("==== 자동차 만들기 ==== \n");

        CarClass car1 = new CarClass();
        CarClass car2 = new CarClass("기아","K5");
        CarClass car3 = new CarClass("벤츠","E-Class", "검은색");
        CarClass car4 = new CarClass("BMW","M5", "파란색", 300);

        car1.showInfo();
        car2.showInfo();
        car3.showInfo();
        car4.showInfo();

        System.out.println("\n==== 주행 테스트 ====");
        System.out.println("\n [ " +car4.getModel()+ " 주행 ]");
        car4.accelerate(40);
        car4.accelerate(100);
        car4.accelerate(120);
        car4.accelerate(100);
        car4.brake(60);
        car4.brake(200);
        car4.brake(40);
        car4.showInfo();
    }
}
