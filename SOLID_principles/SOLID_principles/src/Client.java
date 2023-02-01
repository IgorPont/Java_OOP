public class Client {
    public static void main(String[] args) {
        Car car = new ConcretCar("BMW", "7",
                "white", "Sedan", 4,
                "A95", "Auto", 6.5);

        car.wheelCount = 3;

        Car car1 = new DTCar("BMW", "7",
                "white", "Sedan", 4,
                "DT", "Auto", 6.5);

        Car car2 = new PetrolCar("BMW", "7",
                "white", "Sedan", 4,
                "Petrol", "Auto", 6.5);

        car1.fuel();
        car2.fuel();
    }
}
