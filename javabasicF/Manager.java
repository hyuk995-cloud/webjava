package javabasicF;

public class Manager extends Employee {
    private int bouns;
    public Manager(String name, int baseSalary, int bouns){
        super(name, baseSalary);
        this.bouns = bouns;
    }
    
    //오버라이딩
    //급여 = 기본급 + 보너스
    @Override
    public int calculateSalary(){
        return baseSalary+bouns;
    }
}
