package javabasicD;

public class Student {
    //필드
    String name;
    int studentId;
    int korean;
    int english;
    int math;
    //총점 계산
    int getTotal(){
        return korean + english + math;
    }
    //평균 계산
    double getAverage(){
        return getTotal()/3.0;
    }
    //학점 계산(A, B, C, D, F)
    String getGrade(){
        double avg = getAverage();
        if( avg>=90 ){
            return "A";
        }else if( avg>=80 ){
            return "B";
        }else if (avg>=70){
            return "C";
        }else if (avg>=60){
            return "D";
        }else{
            return "F";
        }
    }
    //정보 출력
    void printInfo(){
        System.out.println("======================");
        System.out.println("이름 : " +name);
        System.out.println("학번 : " +studentId);
        System.out.println("국어 : " +korean);
        System.out.println("영어 : " +english);
        System.out.println("수학 : " +math);
        System.out.println("총점 : " +getTotal());
        System.out.printf("평균 : %.2f\n" ,getAverage());
        System.out.println("학점 : " +getGrade());
        System.out.println("======================");
    }
}
