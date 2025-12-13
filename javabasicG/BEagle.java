package javabasicG;

public class BEagle implements BFlyable {
    private String name;
    public BEagle(String anme){
        this.name = name;
    }
    //인터페이스 메서드 정의 필수

    @Override
    public void fly(){
        System.out.println(name+"이(가) 하늘을 날아갑니다.");
    }

    
    @Override
    public void land(){
        System.out.println(name+"이(가) : 땅에 착륙을 합니다.");
    }
}
