package Vehicles.BasicVehicleParts;

public class Engine {
    private final String idEngine; // номер двигателя
    private final String engineType; // Тип двигателя
    private final float power; // Мощность
    private final float torque; // Крутящий момент
    private final float maxEngineSpeed; // Максимально допустимое число оборотов коленчатого вала в минуту
    private final String fuelType; // Тип топлива
    private final float fuelConsumption; // Расход топлива

    public Engine(String idEngine,
                  String engineType,
                  float power,
                  float torque,
                  float maxEngineSpeed,
                  String fuelType,
                  float fuelConsumption){
        this.idEngine = idEngine;
        this.engineType = engineType;
        this.power = power;
        this.torque = torque;
        this.maxEngineSpeed = maxEngineSpeed;
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString(){
        return String.format("\n\t--Engine--" +
                "\nNumber: " + idEngine +
                "\nType: " + engineType +
                "\nPower: " + power +
                "\nTorque: " + torque +
                "\nMaximum number of revolutions: " + maxEngineSpeed +
                "\nFuel type: " + fuelType +
                "\nFuel consumption: " + fuelConsumption);
    }
}
