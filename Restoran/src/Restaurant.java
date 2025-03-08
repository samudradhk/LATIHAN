
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private final List<Dish> menus = new ArrayList<>();

    void addDish(Dish dish){
        menus.add(dish);
    }

    void placeOrder(Customer customer,Dish dish){
        customer.orders.add(dish);
        menus.remove(dish);
        System.out.println(customer.getCusName() + "ordered: " + dish.getMenu());
    }
    void cancelOrder(Customer customer,Dish dish){
        menus.add(dish);
        customer.orders.remove(dish);
        System.out.println(customer.getCusName()+" canceled order: "+dish.getMenu());
    }

    void displayMenu(){
        System.out.println("Menu in Restaurant:");
        for(Dish dish : menus){
            dish.printMenu();
        }
    }
}
