package javabasicG;

public class ABird extends AAnimal {
    public ABird(String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.println(name+" : 까악까악!");
    }

    @Override
    public void move(){
        System.out.println(name+"이(가) 날개로 날아갑니다.");
    }
}
