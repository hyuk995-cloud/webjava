package javabasicC;

import java.util.Scanner;

public class SwitchBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 계절 판별(fall-through) ===");

        System.out.print("월을 입력하세요 (1-12) : ");
        int month = sc.nextInt();
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "겨울";
                break;
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            default:
                season = "잘못된 월을 넣었습니다.";
        }
        System.out.println(season);

        sc.close();
    }
    
}
