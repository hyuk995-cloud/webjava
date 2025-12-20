package javabasicH;

import java.util.HashMap;

public class APhoneBook {
    public static void main(String[] args) {
        //HasMap 생성
        HashMap<String, String> contacts = new HashMap<>();

        //추가(put)
        contacts.put("홍길동","010-1234-5678");
        contacts.put("김철수","010-2345-6789");
        contacts.put("박영희","010-3456-7890");
        System.out.println("전체 : "+contacts);
        System.out.println("개수 : "+contacts.size());

        //조회(get)
        String phone = contacts.get("홍길동");
        System.out.println("\n홍길동 전화번호 : "+phone);

        //없는 키 조회 -- null
        String phone2 = contacts.get("이길자");
        System.out.println("\n이길자 전화번호 : "+phone2);

        //null방지 - getOrDefault
        String phone3 = contacts.getOrDefault("이길자", "번호 없음");
        System.out.println("이길자 번호 : "+phone3);
        contacts.put("홍길동","010-2000-3000");
        System.out.println("\n수정된 번호"+contacts.get("홍길동"));

        //삭제
        contacts.remove("김철수");
        System.out.println("\n김철수 삭제 후 개수: "+contacts.size());

        //전체 보기(for문으로)
        System.out.println("\n==== 전체 연락처 ====");
        for(String name: contacts.keySet()){
            System.out.println(name+": "+contacts.get(name));
        }
        /*
        wile(다음 요소 있는지 확인){
            다음요소 개체 호출
            다음데이터 출력
        }



        set<String> keySet = contacts.keySet();
        keySet.forEach((name)->{
            System.out.println(name + ":" + contacts.get(name))
        })
        */ 
    }
}
