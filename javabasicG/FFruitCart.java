package javabasicG;

import java.util.ArrayList;

public class FFruitCart {
    public static void main(String[] args) {

        //컬렉션 타입 생성
        ArrayList<String> cart = new ArrayList<>();
        System.out.println("초기 과일 바구니 내용 : "+cart); //[] {} 아무것도 없음 / 비어있는 카트
        
        //추가 (add)
        cart.add("사과");
        cart.add("바나나");
        cart.add("포도");
        System.out.println("추가 후 결과 : "+cart);
        System.out.print("개수 : "+cart.size());

        //조회
        String first = cart.get(0);
        System.out.println("첫 번째 과일 :" +first);

        //수정
        cart.set(1,"딸기");
        System.out.println("수정 후 과일 바구니 : "+cart);

        //삭제
        cart.remove(0);
        System.out.println("삭제 후 과일 바구니 : "+cart);
    }
}
