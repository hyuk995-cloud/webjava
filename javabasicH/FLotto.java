package javabasicH;
import java.util.HashSet; // 중복 제거
import java.util.Random; // 랜덤 클래스
import java.util.ArrayList; // 정렬용
import java.util.Collections; // 정렬 메서드 기능들


public class FLotto {
    public static void main(String[] args) {
        HashSet<Integer> lotto = new HashSet<>(); //중복없는 번호 저장
        Random rand = new Random();
        while(lotto.size() < 6){
            int num = rand.nextInt(45)+1; //(0~44)+1
            lotto.add(num);
        }
        ArrayList<Integer> sorted = new ArrayList<>(lotto);// set -->List변환
        Collections.sort(sorted); // 오름차순 정렬
        System.out.println("로또 번호 : " + sorted);
    }
}
