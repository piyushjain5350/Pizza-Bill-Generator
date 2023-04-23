package Pizza;
import java.util.Scanner;

public class Pizza_Bill {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Headline
        System.out.println("       ----------------------------------       ");
        System.out.println("      |  Hello Welcome To The Pizza Cafe |      ");
        System.out.println("       ----------------------------------       ");

        //Menu Card
        System.out.println("Would you Like to order Veg Pizza : YES/NO ");
        String type=sc.next();
        Pizza_Price pizza;

        if(type.equals("YES")){
            pizza=new Pizza_Price(true);
        }else{
            pizza=new Pizza_Price(false);
        }

        // Adding Extra Toppings
        System.out.println("Would you Like to add extra Toppings : YES/NO ");
        String top=sc.next();

        if(top.equals("YES")){
            pizza.addExtraToppings();
        }


        // Adding Extra Cheese
        System.out.println("Would you Like to add extra Cheese : YES/NO ");
        String cheese=sc.next();

        if(cheese.equals("YES")){
            pizza.addExtraCheese();
        }

        // Have it or take away
        System.out.println("Would you need paper bag: YES/NO ");
        String paper=sc.next();
        if(paper.equals("YES")){
            pizza.paperBag();
        }

        System.out.println("Here is Your Total Bill:"+pizza.printBill());

        System.out.println("Would you like to print bill: YES/NO");
        String  print= sc.next();

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Here is Your Bill :");
        if(print.equals("YES")){
            System.out.println();
            System.out.println(pizza.totalBill());
        }

        System.out.println("HAVE A NICE DAY!!!");




    }


}
