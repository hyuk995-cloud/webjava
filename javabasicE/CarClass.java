package javabasicE;

public class CarClass {
    //주석 처리는 내가 만든거

    //기본 값
    private String company;
    private String model;
    private String color;
    private int maxSpeed;
    private int currentSpeed;
    
    //생성자
    public CarClass(){
        this.company = "현대";
        this.model = "소나타";
        this.color = "흰색";
        this.maxSpeed = 250;
        this.currentSpeed = 0;

        System.out.println("==== 기본 자동차가 생성 되었습니다. ==== ");
        // System.out.println("제조사 : " + company);
        // System.out.println("모델명 : " + model);
        // System.out.println("색상 : " + color);
        // System.out.println("최고속도 : " + maxSpeed);
        // System.out.println("현재속도 : " + currentSpeed);
    }

    public CarClass(String company, String model){
        this.company = company;
        this.model = model;
        this.color = "흰색";
        this.maxSpeed = 250;
        this.currentSpeed = 0;
        System.out.println(company+"자동차 "+model+" 이(가) 생성되었습니다.");
    }

    public CarClass(String company, String model, String color){
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = 250;
        this.currentSpeed = 0;
        System.out.println(company+"자동차 "+model+" "+color+ "이(가) 생성되었습니다.");
    }
    
    public CarClass(String company, String model, String color, int maxSpeed){
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
        System.out.println("주문한 커스텀 "+company+" "+model+" "+color+ " "+maxSpeed+"이(가) 생성되었습니다.");
    }

    public String getCompany(){
        return company;
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public int getCurrentSpeed(){
        return currentSpeed;
    }

    public void accelerate(int speed){
        currentSpeed += speed;
        if( currentSpeed >= maxSpeed ){
            currentSpeed = maxSpeed;
            System.out.println("최고속도에 도달 했습니다.");
        }else{
            System.out.println("가속 : "+currentSpeed+"km/h");
        }
    }

    public void brake(int speed){
        currentSpeed -= speed;
        if( currentSpeed < 0 ){
            currentSpeed = 0;
        }
        System.out.println("감속 : "+currentSpeed+"km/h");
    }

        public void showInfo(){
        System.out.println("===============");
        System.out.println("제조사 : "+company);
        System.out.println("모델 : "+model);
        System.out.println("색상 : "+color);
        System.out.println("최고 속도 : "+maxSpeed);
        System.out.println("현재 속도 : "+currentSpeed);
        System.out.println("===============");
    }


    // //메서드
    // //최고속도
    // public void accelerate(int accel){
    //     if( accel <= maxSpeed && currentSpeed <= maxSpeed){
    //         currentSpeed += accel;
    //         System.out.println("현재 속도 : " + currentSpeed);
    //     }else {
    //         System.out.println("현재 속도는 최고 속도를 넘길 수 없습니다.");
    //     }
    // }

    // //감속
    // public void braek(int brk){
    //     if(currentSpeed > 0){
    //         currentSpeed -= brk;
    //         System.out.println("현재 속도 : " + currentSpeed);
    //     }else{
    //         System.out.println("현재 속도는 0 이하가 될 수 없습니다.");
    //     }
    // }

    // //정보출력
    // public void carInfo(){
    //     System.out.println("=== 정보 출력 ===");
    //     System.out.println("제조 회사 : "+company);
    //     System.out.println("제조 회사 : "+model);
    //     System.out.println("제조 회사 : "+color);
    //     System.out.println("제조 회사 : "+maxSpeed);
    //     System.out.println("제조 회사 : "+currentSpeed);
    // }
    
}
