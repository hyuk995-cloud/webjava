package javabasicD;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car(); //객체 생성
        myCar.model = "그랜저";
        myCar.color = "흰색";
        myCar.speed = 0;
        myCar.showInfo();
        System.out.println("\n 운전 시작~");
        myCar.speedUp();
        myCar.speedUp();
        myCar.speedUp();
        System.out.println();
        myCar.showInfo();
        System.out.println("\n 감속");
        myCar.speedDown();
        myCar.speedDown();
        myCar.showInfo();

        // Car car3 = myCar; --- 참조 복사( 얕은 복사)
        System.out.println("\n ====== 두번째 자동차 ======");
        Car yourCar = new Car();
        yourCar.model =  "k9";
        yourCar.color =  "검정";
        yourCar.speed =  0;
        yourCar.showInfo();
        yourCar.speedUp();
        yourCar.speedUp();
        yourCar.showInfo();

        System.out.println("\n === 각 자동차 상태 ====");
        System.out.println("내 차 속도 : "+myCar.speed);
        System.out.println("네 차 속도 : "+yourCar.speed);
    }
    
}
