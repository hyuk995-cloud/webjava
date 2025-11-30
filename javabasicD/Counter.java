package javabasicD;

public class Counter {
    int instanceCount; // 객체마다 별도 인식
    static int staticCount; //모든 객체가 공유
    public Counter(){
        instanceCount++;
        staticCount++;
    }
    void showCount(){
        System.out.println("Instance Count : "+instanceCount);
        System.out.println("Static Count : "+staticCount);
    }
}
