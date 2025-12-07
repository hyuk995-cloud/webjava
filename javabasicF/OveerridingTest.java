package javabasicF;

public class OveerridingTest {
    public static void main(String[] args) {
        Manager manager = new Manager("박팀장", 2400000, 2000000);
        Developer dev = new Developer("이개발", 1800000, 5);
        
        manager.printInfo();
        System.out.println();
        dev.printInfo();
    }

    
}
