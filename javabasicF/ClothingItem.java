package javabasicF;

public class ClothingItem extends Item {
    private String size;
    public ClothingItem(String name, int price, String size){
        super(name, price, "의류");
        this.size = size;
    }
    @Override
    public int getDiscoungdPrice(){
        return (int)(price*0.7); //30%할인
    }
    @Override
    public int getShippingFee(){
        return 0;
    }

    public String getSize(){
        return size;
    }
}
