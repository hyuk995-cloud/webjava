package javabasicG;

public class DAnonymousClassTest {
    public static void main(String[] args) {
        System.out.println("==== 익명 클래스 =====");

        // 기본 사용
        DButton saveButton = new DButton() {
            @Override
            public void onClick(){
                System.out.println("파일 저장!");
            }
        }; // 익명 클래스 -- 인터페이스 구현 + 객체 생성 동시에, 세미콜론 필수

        // 다중 생성
        DButton deleteButton = new DButton() {
            @Override
            public void onClick(){
                System.out.println("파일 삭제");
            }
        };

        DButton cancelButton = new DButton() {
            @Override
            public void onClick(){
                System.out.println("작업 취소!");
            }
        };

        saveButton.onClick();
        deleteButton.onClick();
        cancelButton.onClick();
        
        //계산기
        System.out.println("\n==========계산기============");
        DCalculator add = new DCalculator() {
            @Override
            public int calculate(int a, int b){
                return a+b;
            }
        };

        DCalculator multiply = new DCalculator() {
            @Override
            public int calculate(int a, int b){
                return a*b;
            }
        };

        DCalculator subtract = new DCalculator() {
            @Override
            public int calculate(int a, int b){
                return a-b;
            }
        };

        System.out.println("10 + 5 = "+add.calculate(10, 5));
        System.out.println("11 * 5 = "+multiply.calculate(11, 5));
        System.out.println("8 - 5 = "+subtract.calculate(8, 5));
    }
}
