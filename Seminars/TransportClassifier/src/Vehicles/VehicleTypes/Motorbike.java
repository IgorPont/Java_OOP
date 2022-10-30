package Vehicles.VehicleTypes;

import Vehicles.BasicVehicleParts.Body;
import Vehicles.BasicVehicleParts.Chassis;
import Vehicles.BasicVehicleParts.Engine;

public class Motorbike extends Transport {
    private int[] wheelSize; // размер колес
    private final float steering; // рулевое управление, угол поворота

    public Motorbike(Engine engine,
                Chassis chassis,
                Body body,
                     int[] wheelSize,
                float steering){
        super(engine, chassis, body);
        this.wheelSize = new int[3];
        this.steering = steering;
    }


}
