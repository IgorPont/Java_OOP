public class ConcretCar extends Car implements WipingGlass {
    protected ConcretCar(String brand, String model,
                         String color, String cabin,
                         int wheelCount, String fuel,
                         String gearBox, double engineVolume) {
        super(brand, model,
                color, cabin,
                wheelCount, fuel,
                gearBox, engineVolume);
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
