package javabasicG;

public class EExceptionDemo {
    public static void main(String[] args) {
        // int result = 10/0; --- try catch없이 실행시 강제 종료
        try{
            int result = 15/0;
            System.out.println("결과 : "+result);
        } catch(ArithmeticException e){ // 산술 예외(ArithmeticException), 입출력 예외
            System.out.println("오류 발생 : 0으로 나눌 수 없습니다!");
        }
        System.out.println("프로그램 계속 실행 중");
    }
}
