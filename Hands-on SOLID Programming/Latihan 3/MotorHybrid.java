public class MotorHybrid implements EngineVehicle, FuelRefuelable, BatteryChargeable {

    public void startEngine() {
        System.out.println("Menyalakan mesin hybrid...");
    }

    public void isiBahanBakar() {
        System.out.println("Mengisi bahan bakar motor hybrid...");
    }

    public void isiBaterai() {
        System.out.println("Mengisi baterai motor hybrid...");
    }
}
