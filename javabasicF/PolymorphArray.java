package javabasicF;

public class PolymorphArray {
    public static void main(String[] args) {
        System.out.println("==== 다양성 배열 관리 ==== \n");
        
        //다형성 -- 하나의 배열로 다양한 타입 관리
        Employee[] team = new Employee[5];
        team[0] = new Manager("김팀장", 5000000, 2000000);
        team[1] = new Developer("박개발", 3500000, 4);
        team[2] = new Developer("이개발", 3500000, 3);
        team[3] = new Manager("최부장", 6000000, 300000);
        team[4] = new Developer("정개발", 4500000, 5);

        // 전체 직원 정보 출력
        for(int i = 0; i < team.length; i++){
            Employee employ = team[i];
            if( employ != null){
                employ.printInfo();
            }
        }
        // 총 급여 계산
        int totalSalary = 0;
        for (int i = 0; i < team.length; i++){
            Employee employ = team[i];
            if( employ != null){
                totalSalary += employ.calculateSalary();
            }
        }
        System.out.println("2. 총 급여 : "+totalSalary+"원");

        // 평균 급여
        System.out.println("3. 평균 급여 : "+(double)totalSalary/team.length+"원"); 

        //최고 급여자 찾기

        int max = 0;
        for (int i = 0; i < team.length; i++){
            Employee employ = team[i];
            if(employ.calculateSalary() > max){
                max += employ.calculateSalary();
            }
        }
        System.out.println("4. 최고급여 : "+max+"원");

        Employee hightest = team[0];
        for(int i = 0; i < team.length; i++){
            Employee emp = team[i];
            if(emp.calculateSalary() > hightest.calculateSalary()){
                hightest = emp;
            }
        }
        System.out.println("최고 급여자");
        hightest.printInfo();

        
    }
}
