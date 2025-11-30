package javabasicD;

public class Car {
    //속성 - 변수
    String color;
    String model;
    int speed;

    //메서드 (기능)
    void speedUp(){
        speed += 10;
        System.out.println("속도 증가 : "+speed+"km/h");
    }
    void speedDown(){
        if(speed>=10){
            speed-=10;
            System.out.println("속도 감소 : "+speed+"km/h");
        }else{
            speed=0;
            System.out.println("정지");
        }
    }

    void showInfo(){
        System.out.println("==== 자동차 정보 ====");
        System.out.println("모델 : "+model);
        System.out.println("색상 : "+color);
        System.out.println("현재 속도 : "+speed+"km/h");
    }
}
