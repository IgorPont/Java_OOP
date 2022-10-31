package Vehicles.VehicleTypes;

import Vehicles.BasicVehicleParts.Body;
import Vehicles.BasicVehicleParts.Chassis;
import Vehicles.BasicVehicleParts.Engine;

public class Car extends Transport {
    private final String vehicleType; // тип транспортного средства
    private final String vehicleModel; // модель транспортного средства
    private int[] wheelSize; // размер колес
    private final float wheelSteering; // угол поперечного наклона оси поворота колеса

    public Car(String vehicleType,
               String vehicleModel,
               Engine engine,
               Chassis chassis,
               Body body,
               int[] wheelSize,
               float wheelSteering){
        super(engine, chassis, body);
        this.vehicleType = vehicleType;
        this.vehicleModel = vehicleModel;
        this.wheelSize = wheelSize;
        this.wheelSteering = wheelSteering;
    }

    @Override
    public String toString(){
        return String.format("Type of vehicle: " + vehicleType +
                "\nModel: " + vehicleModel +
                engine + chassis + body +
                "\nWheel size: " + wheelSize[0] + "/" + wheelSize[1] + "/" + wheelSize[2] +
                "\nAngle of the wheel steering axle: " + wheelSteering);
    }

    @Override
    public String getEnvironment(){
        return String.format("Type of vehicle: " + vehicleType +
                "\nModel: " + vehicleModel +
                "\nWheel size: " + wheelSize[0] + "/" + wheelSize[1] + "/" + wheelSize[2] +
                "\nAngle of the wheel steering axle: " + wheelSteering);
    }
}
