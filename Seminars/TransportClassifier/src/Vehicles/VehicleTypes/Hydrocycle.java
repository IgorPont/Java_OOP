package Vehicles.VehicleTypes;

import Vehicles.BasicVehicleParts.Body;
import Vehicles.BasicVehicleParts.Chassis;
import Vehicles.BasicVehicleParts.Engine;

public class Hydrocycle extends Transport {
    private final String vehicleType; // тип транспортного средства
    private final String vehicleModel; // модель транспортного средства
    private final String sponsonType; // тип спонсонов

    public Hydrocycle(String vehicleType,
                      String vehicleModel,
                      Engine engine,
                      Chassis chassis,
                      Body body,
                      String sponsonType) {
        super(engine, chassis, body);
        this.vehicleType = vehicleType;
        this.vehicleModel = vehicleModel;
        this.sponsonType = sponsonType;
    }

    @Override
    public String toString(){
        return String.format("\nType of vehicle: " + vehicleType +
                "\nModel: " + vehicleModel +
                engine + chassis + body +
                "\nSponson type: " + sponsonType);
    }

    @Override
    public String getEnvironment(){
        return String.format("\nType of vehicle: " + vehicleType +
                "\nModel: " + vehicleModel +
                "\nSponson type: " + sponsonType);
    }
}
