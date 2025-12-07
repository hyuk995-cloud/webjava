package javabasicF;

public class CastingExample {
    public static void main(String[] args) {
        System.out.println("==== 타입 변환 ==== \n");
        
        //업캐스팅(자동)
        System.out.println("업 캐스팅: ");
        Anmal animal1 = new Dog();
        Anmal animal2 = new Cat();

        animal1.eat();
        animal2.eat();
        //animal1.bark() : 빨간줄 생김( 부모에 bark가 없기 때문에) -> 다운 캐스팅 필요
        
        System.out.println("다운 캐스팅");
        Dog dog = (Dog)animal1; // 형 변환
        dog.bark();
        Cat cat = (Cat)animal2;
        cat.meow();

        //안정적인 다운 캐스팅 -- instanceof를 사용
        System.out.println("안정적인 다운 캐스팅");
        Anmal animal3 = new Dog();
        if ( animal3 instanceof Dog){
            Dog safeDog = (Dog)animal3;
            safeDog.bark();
        }
        
        if( animal3 instanceof Cat){
            Cat safeCat = (Cat)animal3;
            safeCat.meow();
        }else{
            System.out.println("animal3은 cat가 아닙니다.");
            animal3 = new Cat();
            ((Cat)animal3).meow();
        }



    }
}
