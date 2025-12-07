package javabasicF;

public class Employee {
    protected String name;
    protected int baseSalary; //기본급

    public Employee(String name, int baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    //급여계산 ( 자식이 오버라이딩 하는 메서드 )
    public int calculateSalary(){
        return baseSalary; // 기본급만
    }

    public void printInfo(){
        System.out.println("이름 : "+name);
        System.out.println("급여 : "+calculateSalary()+"원");
    }

    
}
