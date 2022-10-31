package Vehicles.VehicleTypes;

import Vehicles.BasicVehicleParts.Body;
import Vehicles.BasicVehicleParts.Chassis;
import Vehicles.BasicVehicleParts.Engine;

public class Helicopter extends Transport {
    private final String vehicleType; // тип транспортного средства
    private final String vehicleModel; // модель транспортного средства
    private final float rotorDiameter; // диаметр ротора
    private final int workCeiling; // рабочий потолок
    private final int liftingSpeed; // скорость подъема
    private final float endurance; // выносливость

    public Helicopter(String vehicleType,
                      String vehicleModel,
                      Engine engine,
                      Chassis chassis,
                      Body body,
                      float rotorDiameter,
                      int workCeiling,
                      int liftingSpeed,
                      float endurance) {
        super(engine, chassis, body);
        this.vehicleType = vehicleType;
        this.vehicleModel = vehicleModel;
        this.rotorDiameter = rotorDiameter;
        this.workCeiling = workCeiling;
        this.liftingSpeed = liftingSpeed;
        this.endurance = endurance;
    }

    @Override
    public String toString(){
        return String.format("Type of vehicle: " + vehicleType +
                "\nModel: " + vehicleModel +
                engine + chassis + body +
                "\nRotor diameter: " + rotorDiameter +
                "\nWork ceiling: " + workCeiling +
                "\nLifting speed: " + liftingSpeed +
                "\nEndurance: " + endurance);
    }

    @Override
    public String getEnvironment(){
        return String.format("Type of vehicle: " + vehicleType +
                "\nModel: " + vehicleModel +
                "\nRotor diameter: " + rotorDiameter +
                "\nWork ceiling: " + workCeiling +
                "\nLifting speed: " + liftingSpeed +
                "\nEndurance: " + endurance);
    }
}
