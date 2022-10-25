package Vehicles.VehicleTypes;
import Vehicles.BasicVehicleParts.Body;
import Vehicles.BasicVehicleParts.Chassis;
import Vehicles.BasicVehicleParts.Engine;


public abstract class Transport {
    protected final Engine engine;
    protected final Chassis chassis;
    protected final Body body;

    public Transport(Engine engine, Chassis chassis, Body body) {
        this.engine = engine;
        this.chassis = chassis;
        this.body = body;
    }


}
