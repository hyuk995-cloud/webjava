package javabasicF;

public class Food extends Product {
    private String exprireDate; //유통기한

    public Food(String name, int price, String exprireDate){
        super(name, price);
        this.exprireDate = exprireDate;
    }

    public void showExprieDate(){
        System.out.println("유통기한 : "+exprireDate);
    }
}
