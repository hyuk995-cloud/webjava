package javabasicC;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        System.out.println(" ==== Arrays.toString() ====");
        int[] arr1 = {5, 2, 8, 1, 9};
        System.out.println("arr1 : "+arr1);
        System.out.println("arr1 : "+Arrays.toString(arr1));
        System.out.println("===== Arrays.sort()=====");
        int[] arr2 = {5, 2, 8, 1, 9, 3, 6, 7, 4};
        System.out.println("정렬 전 : "+Arrays.toString(arr2));
        Arrays.sort(arr2); //오름차순 정렬
        System.out.println("정렬 후 : "+Arrays.toString(arr2));
        System.out.println("\n === Arrays.copyof() ====");
        int[] original = {1, 2, 3, 4, 5};
        int[] copy1 = Arrays.copyOf(original,original.length);
        int[] copy2 = Arrays.copyOf(original,3);
        int[] copy3 = Arrays.copyOf(original,8);
        int[] copy4 = original; //얕은 복사 shallow copy
        System.out.println("원본 배열 : " +Arrays.toString(original));
        System.out.println("전체 복사 배열 : " +Arrays.toString(copy1));
        System.out.println("부분 복사 배열 : " +Arrays.toString(copy2));
        System.out.println("확장 복사 배열 : " +Arrays.toString(copy3));      
        System.out.println("얕은 복사 배열 : " +Arrays.toString(copy4));
        System.out.println("\n === Arrays.fill() ===");
        int[] arr5 = new int[5];
        Arrays.fill(arr5, 7);
        System.out.println("7로 채워진 arr5 배열 : " +Arrays.toString(arr5));

        System.out.println("\n ==== Arrays.equals ====");
        int[] arr6 = {1, 2, 3};
        int[] arr7 = {1, 2, 3};
        int[] arr8 = {1, 2, 4};
        System.out.println("arr6 == arr7: "+(arr6 == arr7)); //false
        System.out.println("Arrays.equals(arr6,arr7): "+Arrays.equals(arr6,arr7)); //true
        System.out.println("Arrays.equals(arr6,arr8): "+Arrays.equals(arr6,arr8)); //false

        System.out.println("\n ==== Arrays.binarySerach() ====");
        int[] arr9 = {10, 20, 30, 40, 50, 60, 70};
        int index1 = Arrays.binarySearch(arr9, 40); // 3 출력
        int index2 = Arrays.binarySearch(arr9, 35); // 음수 출력(없는 값)
    }
    
    
}
