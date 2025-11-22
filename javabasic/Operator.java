package javabasic;

public class Operator {
    public static void main(String[] args) {
        System.out.println("=== 산술 연산자 ===");
        int a =10, b = 3;
        System.out.println("a + b = " +(a+b));
        System.out.println("a - b = " +(a-b));
        System.out.println("a * b = " +(a*b));
        System.out.println("a / b = " +(a/b)); // a를 b로 나눈 몫 (정수)
        System.out.println("a % b = " +(a%b)); // a를 b로 나눈 나머지 값 출력

        System.out.println("\n === 나눗셈 ====");
        System.out.println("10 / 3 = " +(10/3)); // 3
        System.out.println("10.0 / 3 = " +(10.0/3)); // 3.3333
        System.out.println("10 / 3.0 = " +(10/3.0)); // 3.3333
        System.out.println("(double)10 / 3.0 = " +((double)10/3.0)); // 3.3333

        System.out.println("\n ==== 비교 연산자 ====");
        int x = 10, y = 20;
        System.out.println("x == y : " +(x==y));
        System.out.println("x != y : " +(x!=y));
        System.out.println("x < y : " +(x<y));
        System.out.println("x > y : " +(x>y));
        System.out.println("x <= y : " +(x<=y));
        System.out.println("x >= y : " +(x>=y));

        // 논리 연산자 연습
        System.out.println("\n=== 논리 연산 연습===");
        int age = 28;
        boolean hasLicense = true;
        boolean canDrive = (age>=18) && hasLicense; //true
        System.out.println("운전 가능 여부 : " + canDrive);

        int score = 75;
        boolean pass = (score<=100 && score >=90) || (score>=60 && score<90);
        System.out.println("합격 여부 : " + pass);

        System.out.println("\n====평가 관리====");
        int num = 0;
        boolean result2 = (num!=0)&&(10/num>1);
        System.out.println("평가 결과 : " +result2);

    }
}
