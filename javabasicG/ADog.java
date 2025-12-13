package javabasicG;

public class ADog extends AAnimal {
    public ADog(String name, int age){
        super(name, age); // 부모생성자 호출 // super : 부모생성자
    }

    //추상 메서드 구현
    @Override
    public void makeSound(){
        System.out.println(name + " : 멍멍");
    }

    @Override
    public void move(){
        System.out.println(name + "이(가) 네 발로 달립니다.");
    }
}
