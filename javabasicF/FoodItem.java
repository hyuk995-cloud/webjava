package javabasicF;

public class FoodItem extends Item{
    private String expireDate;
    public FoodItem(String name, int price, String expireDate){
        super(name, price, "식품");
        this.expireDate = expireDate;
    }
    @Override
    public int getDiscoungdPrice(){
        return
        (int)(price*0.95); //5%할인
    }
    @Override
    public int getShippingFee(){
        return
        4000; // 빠른배송
    }

    public String getExpireDate(){
        return
        expireDate;
    }
}
