public class SweepCar extends Car implements LightOptions, WipingGlass {

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

    @Override
    public void fuel() {

    }

    @Override
    public void wipingTheGlass() {

    }

    @Override
    public void headlightWipe() {

    }

    @Override
    public void wipingTheMirrors() {

    }
}
