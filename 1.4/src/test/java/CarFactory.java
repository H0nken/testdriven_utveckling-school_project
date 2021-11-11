public class CarFactory {

    VehicleRegistrationNumberGenerator vehicleRegistrationNumberGenerator;
    String brand;


    public CarFactory(VehicleRegistrationNumberGenerator vehicleRegistrationNumberGenerator,String brand) {
        this.brand = brand;
        this.vehicleRegistrationNumberGenerator = vehicleRegistrationNumberGenerator;
    }


    public Car createNewCar(String color) {
        return new Car(color, this.brand, vehicleRegistrationNumberGenerator.getNextRegNo());
    }
}

