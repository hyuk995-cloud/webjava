package javabasicE;

public class GetterSetter {
    private double celsius; // 섭씨로 저장
    
    //화씨로 반환
    public double getCelsius(){
        return celsius*9/5+32; // 변환 후 반환
    }
}

//     private String password;
//     public void setPassword(String password){
//         System.out.println("[로그] 비밀번호가 변경되었습니다.");
//         System.out.println("[시간" + java.time.LocalTime.now());
//         this.password = password;
//     }
// }



