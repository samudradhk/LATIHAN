public class Main {
    public Main() {
        Manufacturer manufacturer1 = new Manufacturer("Toyota", "Reliable and affordable vehicles.");
        Manufacturer manufacturer2 = new Manufacturer("Tesla", "Innovative electric cars.");

        Car car1 = new Car("Corolla", "C001", manufacturer1);
        Car car2 = new Car("Model S", "C002", manufacturer2);

        RentalService rentalService = new RentalService();

        rentalService.addCar(car1);
        rentalService.addCar(car2);

        Customer customer = new Customer("Alice");

        rentalService.rentCar(customer, car1);
        rentalService.rentCar(customer, car2);

        customer.displayRentedCars();

        rentalService.returnCar(customer, car1);

        customer.displayRentedCars();

        rentalService.displayAvailableCars();
    }

    public static void main(String[] args) {
        new Main();
    }
}

/*
Car added to rental service: Corolla
Car added to rental service: Model S
Alice rented: Corolla
Alice rented: Model S
Alice's Rented Cars:
Model: Corolla
ID: C001
Manufacturer: Toyota
Description: Reliable and affordable vehicles.
------------------------
Model: Model S
ID: C002
Manufacturer: Tesla
Description: Innovative electric cars.
------------------------
Alice returned: Corolla
Alice's Rented Cars:
Model: Model S
ID: C002
Manufacturer: Tesla
Description: Innovative electric cars.
------------------------
Cars available for rental:
Model: Corolla
ID: C001
Manufacturer: Toyota
Description: Reliable and affordable vehicles.
------------------------
 */
