package javabasicH;

public class DTheadCreation {
    public static void main(String[] args) {
        System.out.println("=== 스레드 생성 3가지 ===");
        //Thread 상속
        MyThread mt1 = new MyThread();
        mt1.start();

        //Runnable
        Thread mt2 = new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println("권장 방법 : Runnale로 새 스레드 실행");
            }
        });
        mt2.start();
        //Rambda code
        Thread mt3 = new  Thread(() -> {
            System.out.println("람다식 새 스레드 실행, 가장 간단 버전");
        });
        mt3.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("방법1 - Thread 상속으로 새 스레드 실행");
    }
}