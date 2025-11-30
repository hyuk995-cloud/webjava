package javabasicD;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "홍길동";
        s1.studentId = 2025001;
        s1.korean = 85;
        s1.english = 90;
        s1.math = 88;
        Student s2 = new Student();
        s2.name = "김철수";
        s2.studentId = 2025002;
        s2.korean = 78;
        s2.english = 82;
        s2.math = 91;
        Student s3 = new Student();
        s3.name = "이영희";
        s3.studentId = 2025003;
        s3.korean = 99;
        s3.english = 88;
        s3.math = 94;

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
        // 배열 관리
        System.out.println("\n ====== 학생 목록 =======");
        Student[] students = {s1, s2, s3};
        for(int i=0; i<students.length; i++){
            System.out.printf("%d. %s - 평균: %.2f, 학점 : %s\n", (i+1),students[i].name,students[i].getAverage(),students[i].getGrade());
        }
        //최고 점수 학생 - 수석학생
        Student topStudent = students[0];
        for(int i=0; i<students.length; i++){
            Student s = students[i];
            if( s.getAverage() > topStudent.getAverage() ){
                topStudent = s;
            }

        }
        System.out.println("\n === 수석 학생 ===");
        topStudent.printInfo();
    }
}
