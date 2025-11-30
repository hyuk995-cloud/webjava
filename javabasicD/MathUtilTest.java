package javabasicD;

public class MathUtilTest {
    public static void main(String[] args) {
        System.out.println("==== MathUtil Test ====");

        //상수 확인
        System.out.println("PI : " + MathUtil.PI);

        //사칙연산
        System.out.println("\n === 사칙연산 ===");
        System.out.println("10 + 5 = "+MathUtil.add(10,5));
        System.out.println("10 - 5 = "+MathUtil.subtract(10,5));
        System.out.println("10 * 5 = "+MathUtil.multiply(10,5));
        System.out.println("10 / 5 = "+MathUtil.divide(10,5));

        //최소값, 최대값
        System.out.println("\n === 최대/최소값 ===");
        System.out.println("max(15, 27) = " +MathUtil.max(15,27));
        System.out.println("min(15, 27) = " +MathUtil.min(15,27));

        //원 계산 반지름(5)
        System.out.println("\n === 원계산(반지름5) ===");
        double radius = 5.0;
        System.out.printf("넓이 : %.2f \n", MathUtil.circleArea(radius));
        System.out.printf("둘레 : %.2f \n", MathUtil.circleCircumference(radius));
    }

}
