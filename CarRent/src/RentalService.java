import java.util.ArrayList;
import java.util.List;
public class RentalService {
    private List<Car> cars = new ArrayList<>();

    void addCar(Car car){
        cars.add(car);
        System.out.println("Car added to rental service: "+car.getName());
    }

    void rentCar(Customer customer,Car car){
        customer.rents.add(car);
        cars.remove(car);
        System.out.println(customer.getNameCus() +" rented: "+ car.getName());
    }

    void returnCar(Customer customer,Car car){
        cars.add(car);
        customer.rents.remove(car);
        System.out.println(customer.getNameCus() + "returned: " + car.getName());
    }

    void displayAvailableCars(){
        System.out.println("Cars available for rental:");
        for(Car car : cars){
            car.printName();
        }
    }
}
