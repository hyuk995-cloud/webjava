public class TernaryAndBitwise {
    public static void main(String[] args) {
        System.out.println("=== 삼항 연산자 ====");
        int score = 85;
        
        // 삼항식 기본형태
        String result = (score>=60) ? "합격" : "불합격";
        System.out.println("점수 : " +score+" >>> " +result);
        
        //중첩 삼항식
        String grade = (score>=90) ? "A" :
                       (score>=80) ? "B" :
                       (score>=70) ? "C" :
                       (score>=60) ? "D" : "F";
        System.out.println("학점 : "+grade);

        int a = 15, b = 20;

        int num = -18;

        int max = (a>b) ? a:b;
        System.out.println("최대값 : "+max);

        int abs = (num>=0) ? num:-num;
        System.out.println(num+"의 절대값은 "+abs);
    }
}
