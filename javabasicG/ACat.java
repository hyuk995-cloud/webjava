package javabasicG;

public class ACat extends AAnimal {
    public ACat(String name, int age){
        super(name, age);
    }
    
    @Override
    public void makeSound(){
        System.out.println(name+ " : 야옹");
    }

    @Override
    public void move(){
        System.out.println(name+"이(가) 살금 살금 걷습니다.");
    }
}
