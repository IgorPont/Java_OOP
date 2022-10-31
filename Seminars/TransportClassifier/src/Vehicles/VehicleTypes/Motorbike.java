package Vehicles.VehicleTypes;

import Vehicles.BasicVehicleParts.Body;
import Vehicles.BasicVehicleParts.Chassis;
import Vehicles.BasicVehicleParts.Engine;

public class Motorbike extends Transport {
    private final String vehicleType; // тип транспортного средства
    private final String vehicleModel; // модель транспортного средства
    private final int[] wheelSize; // размер колес
    private final float steering; // рулевое управление, угол поворота

    public Motorbike(String vehicleType,
                     String vehicleModel,
                     Engine engine,
                     Chassis chassis,
                     Body body,
                     int[] wheelSize,
                     float steering) {
        super(engine, chassis, body);
        this.vehicleType = vehicleType;
        this.vehicleModel = vehicleModel;
        this.wheelSize = wheelSize;
        this.steering = steering;
    }

    @Override
    public String toString() {
        return String.format("Type of vehicle: " + vehicleType +
                "\nModel: " + vehicleModel +
                engine + chassis + body +
                "\nWheel size: " + wheelSize[0] + "/" + wheelSize[1] + "/" + wheelSize[2] +
                "\nSteering angle: " + steering);
    }

    @Override
    public String getEnvironment(){
        return String.format("Type of vehicle: " + vehicleType +
                "\nModel: " + vehicleModel +
                "\nWheel size: " + wheelSize[0] + "/" + wheelSize[1] + "/" + wheelSize[2] +
                "\nSteering angle: " + steering);
    }

}
