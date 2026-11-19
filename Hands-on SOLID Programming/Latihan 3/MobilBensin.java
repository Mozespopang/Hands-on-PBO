public class MobilBensin implements EngineVehicle, FuelRefuelable {
   
    @Override
    public void startEngine() {
        System.out.println("Menyalakan mesin bensin kendaraan...");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Mengisi bahan bakar kendaraan...");
    }
}
