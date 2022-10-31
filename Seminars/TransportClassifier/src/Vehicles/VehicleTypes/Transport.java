package Vehicles.VehicleTypes;
import Vehicles.BasicVehicleParts.Body;
import Vehicles.BasicVehicleParts.Chassis;
import Vehicles.BasicVehicleParts.Engine;
import Vehicles.Interface.VehiclesInterface;


public abstract class Transport implements VehiclesInterface {
    protected final Engine engine;
    protected final Chassis chassis;
    protected final Body body;

    public Transport(Engine engine, Chassis chassis, Body body) {
        this.engine = engine;
        this.chassis = chassis;
        this.body = body;
    }

    public float getMaxSpeed(){
        return chassis.getMaxSpeed();
    }
}
