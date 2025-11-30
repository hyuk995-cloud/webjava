package javabasicD;

public class CounterTest {
    public static void main(String[] args) {
        System.out.println("초기 Static Count : "+Counter.staticCount);
        Counter c1 = new Counter();
        c1.showCount();
        Counter c2 = new Counter();
        c2.showCount();
        Counter c3 = new Counter();
        c3.showCount();

        System.out.println("\n=== 각 개체 카운트 확인 ===");
        System.out.println("c1 : ");
        c1.showCount();

        System.out.println("c2 : ");
        c2.showCount();

        System.out.println("c3 : ");
        c3.showCount();
        System.out.println("생성된 객체 수 : "+Counter.staticCount);
    }
    
}
