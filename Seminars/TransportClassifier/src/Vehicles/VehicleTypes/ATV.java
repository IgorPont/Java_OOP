package Vehicles.VehicleTypes;

import Vehicles.BasicVehicleParts.Body;
import Vehicles.BasicVehicleParts.Chassis;
import Vehicles.BasicVehicleParts.Engine;

public class ATV extends Motorbike {
    public ATV(String vehicleType,
               String vehicleModel,
               Engine engine,
               Chassis chassis,
               Body body,
               int[] wheelSize,
               float steering) {
        super(vehicleType, vehicleModel,
                engine, chassis, body, wheelSize,
                steering);
    }
}
