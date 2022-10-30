package Vehicles.VehicleTypes;

import Vehicles.BasicVehicleParts.Body;
import Vehicles.BasicVehicleParts.Chassis;
import Vehicles.BasicVehicleParts.Engine;

public class Helicopter extends Transport {
    private final float rotorDiameter; // диаметр ротора
    private final int workCeiling; // рабочий потолок
    private final float endurance; // выносливость

    public Helicopter(Engine engine,
                      Chassis chassis,
                      Body body,
                      float rotorDiameter,
                      int workCeiling,
                      float endurance){
        super(engine, chassis, body);
        this.rotorDiameter = rotorDiameter;
        this.workCeiling = workCeiling;
        this.endurance = endurance;
    }

}
