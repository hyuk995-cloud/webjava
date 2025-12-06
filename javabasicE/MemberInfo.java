package javabasicE;

public class MemberInfo {
    private String name;
    private int age;
    
    //getter 이름 호출만
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    //setter 값을 설정, 검증
    public void setName(String name){
        //유효성 검사
        if(name==null || name.isEmpty()){
            System.out.println("이름은 비어있을 수 없습니다.");
            return;
        }
        this.name = name;
    }

    public void setAge(int age){
        if( age  < 0 || age > 160){
            System.out.println("나이는 0 ~ 160 사이여야 합니다.");
            return;
            
        }
        this.age = age;
    }

    public static void main(String[] args) {
        MemberInfo member = new MemberInfo();
        member.setAge(-5);
        member.setAge(250);
        member.setName("");
        member.setName(null);
        member.setName("고길동");
        member.setAge(50);
        System.out.println("멤버 이름 : " + member.getName());
        System.out.println("멤버 나이 : " + member.getAge() + "세");
    }

}
