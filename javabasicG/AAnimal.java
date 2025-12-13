package javabasicG;

public abstract class AAnimal {

    //일단 필드(공통속성) - 이름, 나이
    protected String name;
    protected int age;

    //생성자
    public AAnimal(String name, int age){
        this.name = name;
        this.age = age;
    }

    //일반메서드
    public void eat(){
        System.out.println(name + "이(가) 먹이를 먹고 있습니다.");
    }

    public void sleep(){
        System.out.println(name + "이(가) 잠을 잡니다.");
    }
    
    //추상메서드 {}안함 안씀

    public abstract void makeSound(); // 소리내기
    public abstract void move(); // 이동하기

    public void printInfo(){
        System.out.println("이름 : " + name+", 나이 : "+age+"살");
    }

}
