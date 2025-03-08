
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String nameCus;
    List<Car> rents = new ArrayList<>();
    Customer(String nameCus){
        this.nameCus = nameCus;
    }

    public String getNameCus(){
        return nameCus;
    }

    void displayRentedCars(){
        System.out.println(nameCus+ "'s Rented Cars:");
        for(Car car : rents){
            car.printName();
        }
    }
}
