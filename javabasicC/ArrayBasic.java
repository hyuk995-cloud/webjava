package javabasicC;

public class ArrayBasic {
    public static void main(String[] args) {
        //배열 선언, 생성
        // System.out.println("<---배열 선언과 생성---->");
        // int[] scores;
        // scores = new int[5]; // 배열 크기를 5로 생성
        // System.out.println("배열 길이 : "+scores.length);
        // System.out.println("\n초기값(상태) 확인 : ");
        // for(int i = 0; i < scores.length; i++){
        //     System.out.println("scores["+i+"] = "+scores[i]);
        // }
        //배열 초기값 지정
        // System.out.println("\n<---- 초기값 지정 생성 ---->");
        // int[] arr1 = {10, 20, 30, 40, 50};
        // for(int index : arr1){
        //     System.out.println(index);
        //     System.out.println(arr1[index]);
        // }
        //실수형
        double[] heights = {175.5, 180.3, 167.8};
        System.out.println("키 배열 : ");
        for( int i = 0; i<heights.length; i++){
            System.out.println(heights[i]+"cm");
        }
        //문자형
        String[] names ={"홀길동", "김철수", "이영희"};
        System.out.println("이름 배열 : ");
        for( int i = 0; i<names.length; i++){
            System.out.println((i+1) + ". "+names[i]);
        }
        //숫자 -- 특정요소 값 수정 --> 누적 합계 구하기
        System.out.println("\n ----- 누적 합계 ----- ");
        int[] values = {5, 10, 15, 20, 25};
        values[1] = 30; // 새로운 값 할당(대입)
        values[3] = 40; // 새로운 값 할당(대입)
        int sum = 0;
        for(int j = 0; j < values.length; j++){
            sum += values[j];
        }
        System.out.println("배열 : "+java.util.Arrays.toString(values));
        System.out.println("합계 : "+sum);
        System.out.println("평균 : "+(double)sum/values.length);
    }
}
