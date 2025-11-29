package javabasicC;

public class NestedFor {
    public static void main(String[] args) {
        System.out.println("=== 구구단 (중첩 반복문)====");
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("\n" + dan + "단");
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d x %d = %d\n", dan, i, dan * i);
            }
        }
    }
}
