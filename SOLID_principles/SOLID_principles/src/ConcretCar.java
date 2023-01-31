public class ConcretCar extends Car{
    protected ConcretCar(String brand, String model,
                         String color, String cabin,
                         int wheelCount, String fuel,
                         String gearBox, double engineVolume) {
        super(brand, model,
                color, cabin,
                wheelCount, fuel,
                gearBox, engineVolume);
    }
}
