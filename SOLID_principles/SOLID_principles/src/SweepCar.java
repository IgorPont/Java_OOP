public class SweepCar extends Car implements LightOptions {

    protected SweepCar(String brand, String model,
                       String color, String cabin,
                       int wheelCount, String fuel,
                       String gearBox, double engineVolume) {
        super(brand, model,
                color, cabin,
                wheelCount, fuel,
                gearBox, engineVolume);
    }

    void sweepStreet() {
        System.out.println("Sweep");
    }

    @Override
    public void antiFogLight() {

    }
}
