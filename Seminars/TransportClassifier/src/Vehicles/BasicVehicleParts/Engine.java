package Vehicles.BasicVehicleParts;

public class Engine {
    private final String engineType; // Тип двигателя
    private final float power; // Мощность
    private final float torque; // Крутящий момент
    private final float maxEngineSpeed; // Максимально допустимое число оборотов коленчатого вала в минуту
    private final String fuelType; // Тип топлива
    private final float fuelConsumption; // Расход топлива

    public Engine(String engineType,
                  float power,
                  float torque,
                  float maxEngineSpeed,
                  String fuelType,
                  float fuelConsumption){
        this.engineType = engineType;
        this.power = power;
        this.torque = torque;
        this.maxEngineSpeed = maxEngineSpeed;
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;

    }


}
