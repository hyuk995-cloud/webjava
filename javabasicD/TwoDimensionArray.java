package javabasicD;

public class TwoDimensionArray {
    public static void main(String[] args) {
        // 2차원 배열 생성
        // System.out.println("==== 2차원 배열 ====");
        // int[][] arry1 = new int[3][4]; // 3행 4열
        // System.out.println("행의 개수는 : " + arry1.length);
        // System.out.println("1행의 열 개수는 : " + arry1[0].length);
        // System.out.println("\n==== 중첩 for문과 2차원 배열 =====");
        // int[][] arry2 = {
        //         { 1, 2, 3, 4 },
        //         { 5, 6, 7, 8 },
        //         { 9, 10, 11, 12 }
        // };
        // for (int i = 0; i < arry2.length; i++) {
        //     for (int j = 0; j < arry2[i].length; j++) {
        //         System.out.print(arry2[i][j] + "\t");
        //     }
        //     System.out.println();
        // }
        // 과목, 학생별 총점, 평균
        System.out.println("\n <==== 행과 열의 합계구하기( 과목별 점수) ====>");
        int[][] scores = {
                { 90, 85, 88 }, // 1번 학생의(국어, 영어, 수학)
                { 78, 92, 80 },
                { 88, 78, 95 }
        };
        String[] subjects = { "국어", "영어", "수학" };

        // System.out.println("학생들 총점 : ");
        // for (int i = 0; i < scores.length; i++){
        // int sum = 0;
        // for(int j = 0; j < scores[i].length; j++){
        // sum+=scores[i][j];
        // }
        // System.out.printf("%d번 학생: %d 점 (평균:%.2f 점)\n", (i+1), sum,
        // (double)sum/scores[i].length);
        // }

        // System.out.println("\n 과목별 총점: ");
        // for (int i = 0; i < subjects.length; i++){
        // int sum = 0;
        // for (int j = 0; j <scores.length; j++){
        // sum+=scores[j][i];
        // }
        // double avg = (double)sum/scores.length;
        // System.out.printf("%s : %d점 ( 평균 : %.2f)\n", subjects[i], sum, avg);
        // }

        System.out.println("\n 과목별 높은점수: ");
        int max = scores[0][0]; //초기값 지정
        int maxrow = 0, maxcol = 0;
        for (int i = 0; i < subjects.length; i++) {
            for (int j = 0; j < scores.length; j++) {
                if (scores[j][i] > max) {
                    max = scores[j][i];
                    maxrow = i;
                    maxcol = j;
                }
            }
            System.out.printf("최고점 : "+max);
            System.out.printf(" 위치 : %d번 학생, %s\n",(maxcol+1), subjects[maxrow]);
        }
        // System.out.printf("최고점 : "+max);
        // System.out.printf(" 위치 : %d번 학생, %s\n",(maxcol+1), subjects[maxrow]);
        // // 최고점, 위치 ? 번 학생, 과목명, ~점
    }
}