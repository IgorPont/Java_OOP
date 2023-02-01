public class DTCar extends Car implements GasStation {
    protected DTCar(String brand, String model,
                    String color, String cabin,
                    int wheelCount,
                    String gearBox, String auto, double engineVolume) {
        super(brand, model,
                color, cabin,
                wheelCount, "DT",
                gearBox, engineVolume);
    }

    @Override
    public void fuel() {
        System.out.println("Refuelling with DT");
    }
}
