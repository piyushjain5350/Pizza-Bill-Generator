package Pizza;

public class Pizza_Price {
    Boolean isVeg;
    private int basePrice;
    private int extraTopping;
    private int extraCheese;
    private int paperBagPrice;
    private int totalPrice;
    String bill;

    Pizza_Price(boolean isVeg){
        if(isVeg){
            basePrice=300;
            extraTopping=70;
            this.bill="Base Price of Veg Pizza     : "+basePrice+"\n";
            totalPrice=basePrice;
        }else{
            basePrice=400;
            extraTopping=120;
            this.bill="Base Price of Non Veg Pizza : "+basePrice+"\n";
            totalPrice=basePrice;
        }
        extraCheese=60;
        paperBagPrice=20;
    }

    //Extra Toppings

    public void addExtraToppings(){
        this.bill+="Extra toppings Price        :  "+extraTopping+"\n";
        totalPrice+=extraTopping;
    }

    //Extra Cheese

    public void addExtraCheese(){
        this.bill+="Extra cheese Price          :  "+extraCheese+"\n";
        totalPrice+=extraCheese;
    }

    //Paper Bag Price
    public void paperBag(){
        this.bill+="Bag Price                   :  "+paperBagPrice+"\n";
        totalPrice+=paperBagPrice;
    }

    //Print Total Price
    public int printBill(){
        return totalPrice;
    }

    //Total price
    public String totalBill(){
        this.bill+="---------------------------------------------\n";
        this.bill+="Total Bill of Pizza         : "+totalPrice+"\n";
        this.bill+="---------------------------------------------\n";
        return bill;
    }
}
