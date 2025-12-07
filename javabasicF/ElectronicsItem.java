package javabasicF;

public class ElectronicsItem extends Item {
    private int warranty;
    public ElectronicsItem(String name, int price, int warranty){
        super(name, price,"전자제품");
        this.warranty = warranty;
    }
    @Override
    public int getDiscoungdPrice(){
        return (int)(price*0.8); //전자 제품 20%할인
    }
    @Override
    public int getShippingFee(){
        //고가제품은 무료배송
        return price >= 500000 ? 0: 5000;
    }
    
    public int getWarranty(){
        return
        warranty;
    }
}
