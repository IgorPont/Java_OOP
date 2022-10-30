package Vehicles.VehicleTypes;

import Vehicles.BasicVehicleParts.Body;
import Vehicles.BasicVehicleParts.Chassis;
import Vehicles.BasicVehicleParts.Engine;

public class Car extends Transport {
    private int[] wheelSize; // размер колес
    private final float wheelSteering; // угол поперечного наклона оси поворота колеса

    public Car(Engine engine,
               Chassis chassis,
               Body body,
               int[] wheelSize,
               float wheelSteering){
        super(engine, chassis, body);
        this.wheelSize = new int[3];
        this.wheelSteering = wheelSteering;
    }


}
