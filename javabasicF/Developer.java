package javabasicF;

public class Developer extends Employee {
    private int projectCount;
    public Developer(String name, int baseSalary, int projectCount){
        super(name, baseSalary);
        this.projectCount = projectCount;
    }

    //오버라이딩
    @Override
    public int calculateSalary(){
        return baseSalary+(projectCount*500000);
    }
}

