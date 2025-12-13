package javabasicG;

public class BDuck implements BFlyable, BSwimable {
    private String name;
    public BDuck(String name){
        this.name = name;
    }
    @Override
    public void fly(){
        System.out.println(name+"이(가) 짧게 날아갑니다.");
    }
    @Override
    public void land(){
        System.out.println(name+"이(가) 물 위에 착륙합니다.");
    }
    @Override
    public void swim(){
        System.out.println(name+"이(가) 물에서 헤엄칩니다.");
    }
}
