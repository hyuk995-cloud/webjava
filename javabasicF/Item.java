package javabasicF;

public class Item {
    protected String name;
    protected int price;
    protected String category;

    public Item(String name, int price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getDiscoungdPrice(){
        return (int)(price*0.9);
    }
    public int getShippingFee(){
        return 3000; // 배송비 3000원
    }

    public void printlnfo(){
        System.out.println("상품명 : "+name);;
        System.out.println("경기 : "+price+"원 ");;
        System.out.println("할인가 : "+getDiscoungdPrice());;
    }

    public String getName(){
        return
        name;
    }

    public int getPrice(){
        return
        price;
    }

    public String getCategory(){
        return
        category;
    }

}
