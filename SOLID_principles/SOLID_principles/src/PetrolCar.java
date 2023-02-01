public class PetrolCar extends Car implements GasStation {
    protected PetrolCar(String brand, String model,
                        String color, String cabin,
                        int wheelCount,
                        String gearBox, String auto, double engineVolume) {
        super(brand, model,
                color, cabin,
                wheelCount, "Petrol",
                gearBox, engineVolume);
    }

    @Override
    public void fuel() {
        System.out.println("Refuelling with petrol");
    }
}
