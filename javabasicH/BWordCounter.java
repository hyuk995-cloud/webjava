package javabasicH;

import java.util.HashMap; // Map인터페이스 구현
import java.util.Map;    // 키, 벨류를 가지고 있는 자료 구조 인터페이스

public class BWordCounter {
    public static void main(String[] args) {
        String text = "apple banana apple grape banana orange apple";
        String[] words = text.split(" "); //특정단어를 찾을때 사용하는 명령어
        System.out.println("원본 : "+text);
        System.out.println("단어 수 : "+words.length);
        
        //단어 빈도수 저장 HashMap 생성 단어(키값), 빈도수(벨류값)
        //["ap","ba","ap","gr","ba","or","ap"]
        HashMap<String, Integer> counter = new HashMap<>();
        for(String word: words){
            int count = counter.getOrDefault(word, 0);
            counter.put(word, count+1);
        }

        System.out.println("\n====단어 빈도수====");
        //Map(interface) - 한 요소 출력 하위 인터페이스(Map.Entry), HashMap(클래스)
        //Map.entrySet() 모든 키, 벨류를 쌍으로 호출
        for(Map.Entry<String, Integer > entry : counter.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue()+"번");
        }

        //가장 많이 입력된 단어 찾기
        String maxWord = "";
        int maxCount = 0;

        for(Map.Entry<String, Integer > entry : counter.entrySet()){
            if(entry.getValue() > maxCount ){
                maxWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("\n가장 많이 사용된 단어는 "+maxWord+"("+maxCount+"번)");
        
    }
    
}
