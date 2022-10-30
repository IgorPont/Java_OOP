package Vehicles.VehicleTypes;

import Vehicles.BasicVehicleParts.Body;
import Vehicles.BasicVehicleParts.Chassis;
import Vehicles.BasicVehicleParts.Engine;

public class ATV extends Motorbike {
    public ATV(Engine engine, Chassis chassis, Body body, float steering){
        super(engine, chassis, body, steering);
    }


}
