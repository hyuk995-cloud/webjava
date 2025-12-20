package javabasicH;

import java.util.Random;
import java.time.LocalDate;

public class EDice {
    public static void main(String[] args) {
        Random rad = new Random(); //랜덤 객체 생성
        int dice = rad.nextInt(6)+1; //new Random().nextInt(6) -- 0~5생성
        System.out.println("주사위 결과 : "+dice);

        LocalDate today = LocalDate.now(); //현재 날짜를 저장 ( yyyy - mm - dd)
        System.out.println("오늘은 " + today + "입니다.");
    }
}
