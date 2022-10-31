import Vehicles.BasicVehicleParts.Body;
import Vehicles.BasicVehicleParts.Chassis;
import Vehicles.BasicVehicleParts.Engine;
import Vehicles.Interface.VehiclesInterface;
import Vehicles.VehicleTypes.*;

/**
 * Vehicle classifier
 */

public class Main {
    public static void main(String[] args) {
        Motorbike bmw_g_310_r = new Motorbike(
                "Motorbike",
                "BMW G 310 R",
                new Engine(
                        "AS34GP7684QZX",
                        "Injector",
                        34f,
                        28f,
                        9500f,
                        "AI-95",
                        3.3f),
                new Chassis(
                        "LDHS823H9",
                        2,
                        158.5f,
                        11f,
                        145f,
                        "1x2",
                        1374,
                        "Mechanical",
                        "Steering"),
                new Body(
                        "QLSD618SP",
                        "Tubular steel frame",
                        "Aluminium",
                        1988f,
                        896f,
                        1227f,
                        "Red"),
                new int[]{110, 70, 17},
                64.9f);

        ATV rm_800_duo = new ATV("ATV",
                "RM 800 DUO",
                new Engine(
                        "ALCNWT4672DP",
                        "Injector",
                        60f,
                        73f,
                        5000f,
                        "AI-92",
                        4.2f),
                new Chassis(
                        "PDNW329LAW",
                        2,
                        120f,
                        24.5f,
                        100f,
                        "4x4",
                        2145,
                        "Mechanical",
                        "Steering"),
                new Body(
                        "LANW529mSw",
                        "Tubular steel frame",
                        "Aluminium",
                        2340f,
                        1210f,
                        1480f,
                        "Orange"),
                new int[]{26, 9, 14},
                0f);

        Car ford_fiesta = new Car(
                "Car",
                "Ford Fiesta",
                new Engine(
                        "LDPZX72MS",
                        "Hybrid",
                        125f,
                        290f,
                        6450f,
                        "AI-95",
                        6.3f),
                new Chassis(
                        "PANW396JDKE12",
                        5,
                        500f,
                        45f,
                        166f,
                        "2x4",
                        3417,
                        "Mechanical",
                        "Steering"),
                new Body(
                        "PXNS45QWY",
                        "Hatchback bodies",
                        "Aluminium",
                        3917f,
                        1683f,
                        1417f,
                        "Black"),
                new int[]{175, 65, 14},
                11f);

        Helicopter gen_h_4 = new Helicopter(
                "Helicopter",
                "GEN H-4",
                new Engine(
                        "PCMQ493FGN",
                        "Two-cylinder, two-stroke aircraft engine",
                        40f,
                        8500f,
                        8500f,
                        "Petrol",
                        0f),
                new Chassis(
                        "PBDJSGF675",
                        1,
                        220f,
                        0f,
                        125f,
                        "No data",
                        156,
                        "No data",
                        "Control panel, throttle lever"),
                new Body(
                        "CNMDHSJ213",
                        "Cardan",
                        "Metal",
                        156f,
                        156f,
                        212f,
                        "White"),
                4,
                3000,
                2,
                30);

        Hydrocycle sea_doo_performance_rxp_x_300 = new Hydrocycle(
                "Hydrocycle",
                "SEA-DOO PERFORMANCE RXP-X 300",
                new Engine(
                        "PKGKGJKGS567",
                        "ROTAX 1630 ACE-300",
                        300f,
                        0f,
                        0f,
                        "AI-95",
                        3.5f),
                new Chassis(
                        "AJHFDKJFDF",
                        2,
                        182f,
                        70f,
                        162f,
                        "No data",
                        0,
                        "Automatic",
                        "Steering wheel"),
                new Body(
                        "KHJDGKHSGKYUY",
                        "T3-R",
                        "Fiberglass",
                        331.8f,
                        125f,
                        111f,
                        "Yellow"),
                "Sporty X-sponsors");

        System.out.println();
        System.out.println(rm_800_duo.getMaxSpeed());




    }
}
