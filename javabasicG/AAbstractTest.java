package javabasicG;

public class AAbstractTest {
    public static void main(String[] args) {
        System.out.println("==== 추상 클래스 테스트 ===== \n");
        //추상 클래스 객체 생성 불가 new Animal() == > 불가

        ADog dog = new ADog("진순이", 3);
        ACat cat = new ACat("토톨이", 2);
        ABird bird = new ABird("깜둥이", 1);

        //다형성

        AAnimal[] animals = {dog, cat, bird};
        System.out.println("1. 동물의 정보");
        // for (AAnimal animal : animals){
        //     animal.printInfo();
        // } 이런 방식도 있고

        for (int i = 0; i < animals.length; i++){
            animals[i].printInfo();
        } // 이런 방식도 있음


        System.out.println("2. 동물 소리 :");
        for (int i = 0; i < animals.length; i++){
            animals[i].makeSound();
        } 


        System.out.println("3. 동물 이동 :");
        for (int i = 0; i < animals.length; i++){
            animals[i].move();
        } 

        System.out.println("4. 공통행동 :");
        for (int i = 0; i < animals.length; i++){
            animals[i].eat();
            animals[i].sleep();
            System.out.println();
        } 


    }
}
