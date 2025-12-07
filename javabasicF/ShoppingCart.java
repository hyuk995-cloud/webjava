package javabasicF;

public class ShoppingCart {
    private Item[] items;
    private int itemCount;

    public ShoppingCart(int capacity){
        items = new Item[capacity];
        itemCount = 0;
    }

    //상품 추가
    public void addItem(Item item){
        if(itemCount < items.length){
            items[itemCount++] = item;
            System.out.println(item.getName()+"추가됨");
        }else{
            System.out.println("장바구니가 가득 찼습니다.");
        }
    }

    // 전체 상품 출력
    public void showItems(){
        System.out.println("\n==== 장바구니 목록 ====");
        for(int i = 0; i < itemCount; i++){
            System.out.println((i+1)+". "+items[i].getName());
        }
    }

    // 총 금액 계산 - 가격 + 배송비
    public int calculateTotal(){
        int total = 0;
        for ( int i = 0; i < itemCount; i++){
            total += items[i].getDiscoungdPrice();
            total += items[i].getShippingFee();
        }
        return total;
    }

    // 카테고리 개수 통계
    public void showStatistics(){
        int elecCount = 0,
            foodCount = 0, 
            clothingCount = 0;

        for (int i = 0; i < itemCount; i++){
            if( items[i] instanceof ElectronicsItem ){
                elecCount++;
            }else if( items[i] instanceof FoodItem){
                foodCount++;
            }else if( items[i] instanceof ClothingItem){
                clothingCount++;
            }
        }
        System.out.println("\n ==== 카테고리 통계 ====");
        System.out.println("전자제품 : "+elecCount+"개");
        System.out.println("식품 : "+foodCount+"개");
        System.out.println("의류 : "+clothingCount+"개");
    }
    // 상세 정보
    public void printReceipt(){
        System.out.println("\n ==== 상세 영수증 =====");
        int subtotal = 0; //가격
        int totalshipping = 0; //배송비

        for (int i = 0; i < itemCount; i++){

            //필드
            Item p = items[i];
            int discount = p.getDiscoungdPrice();
            int shipping = p.getShippingFee();

            //정보
            System.out.println("\n "+(i+1)+". "+p.getName());
            System.out.println(" 정가 : "+p.getPrice()+"원");
            System.out.println("할인가 : "+discount+"원");
            System.out.println(" 배송비 : "+shipping+"원");

            //부분정보
            if( p instanceof ElectronicsItem ){
                ElectronicsItem e = (ElectronicsItem)p;
                System.out.println("  보증기간 : "+e.getWarranty()+"개월");
            }else if( p instanceof FoodItem ){
                FoodItem f = (FoodItem)p;
                System.out.println("  유통기한 : "+f.getExpireDate());
            }else if( p instanceof ClothingItem ){
                ClothingItem c = (ClothingItem)p;
                System.out.println("   사이즈 : "+c.getSize());
            }
            
            //누적 더하기
            subtotal += discount;
            totalshipping += shipping;
        }
        System.out.println("\n " +"=".repeat(15));
        System.out.println("상품 금액: "+subtotal+"원");
        System.out.println("배송비: "+totalshipping+"원");
        System.out.println("총 결제 금액: "+(subtotal+totalshipping)+"원");
    }
    
}
