package Vehicles.VehicleTypes;

import Vehicles.BasicVehicleParts.Body;
import Vehicles.BasicVehicleParts.Chassis;
import Vehicles.BasicVehicleParts.Engine;

public class Hydrocycle extends Transport {
    private final String sponsorType;

    public Hydrocycle(Engine engine,
                      Chassis chassis,
                      Body body,
                      String sponsorType){
        super(engine, chassis, body);
        this.sponsorType = sponsorType;
    }

}
