package javabasicG;

public class BFish implements BSwimable {
    private String name;
    public BFish(String name){
        this.name = name;
    }
    
    @Override
    public void swim(){
        System.out.println(name+"이(가) 물속에서 빠르게 헤엄칩니다.");
    }
}
