package javabasicG;

public class BInterfaceTest {
    public static void main(String[] args) {
        System.out.println("=== 인터페이스 테스트 === \n");

        //객체 생성
        BEagle eagel = new BEagle("수리");
        BDuck duck = new BDuck("뚱이");
        BFish fish = new BFish("금붕어");

        //다형성 - Flyable
        System.out.println("1. 날 수 있는 동물");
        BFlyable[] flyables = {eagel, duck}; //인터페이스 타입 배열
        for(int i = 0; i < flyables.length; i++){
            flyables[i].fly();
            flyables[i].land();
            System.out.println();
        }
        System.out.println("2. 수영할 수 있는 동물");
        BFlyable[] swimables = {duck}; //인터페이스 타입 배열
        for(int i = 0; i < swimables.length; i++){
            swimables[i].fly();
            swimables[i].land();
            System.out.println();
        }
    }
}
