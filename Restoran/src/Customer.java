import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String cusName;
    List<Dish> orders = new ArrayList<>();

    Customer(String cusName){
        this.cusName = cusName;
    }

    String getCusName(){
        return cusName;
    }

    void displayOrders(){
        System.out.println(cusName+"'s Orders: ");
        for(Dish dish : orders){
            dish.printMenu();
        }
    }
}
