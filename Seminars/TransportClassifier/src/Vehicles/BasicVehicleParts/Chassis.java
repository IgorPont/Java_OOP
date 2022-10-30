package Vehicles.BasicVehicleParts;

public class Chassis {
    private final String idChassis; // номер шасси
    private final int seats; // количество мест
    private final float loadCapacity; // грузоподъемность
    private final float fuelTank; // объем топливного бака
    private final float maxSpeed; // максимальная скорость
    private final String wheelFormula; // колесная формула
    private final int wheelbase; // колесная база
    private final String transmission; // трансмиссия
    private final String controlMechanism; // механизм управления

    public Chassis(String idChassis,
                   int seats,
                   float loadCapacity,
                   float fuelTank,
                   float maxSpeed,
                   String wheelFormula,
                   int wheelbase,
                   String transmission,
                   String controlMechanism){
        this.idChassis = idChassis;
        this.seats = seats;
        this.loadCapacity = loadCapacity;
        this.fuelTank = fuelTank;
        this.maxSpeed = maxSpeed;
        this.wheelFormula = wheelFormula;
        this.wheelbase = wheelbase;
        this.transmission = transmission;
        this.controlMechanism = controlMechanism;
    }




}
