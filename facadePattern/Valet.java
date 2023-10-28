package facadePattern;

public class Valet implements HotelService{
    private String plateNumber;
    private String service;

    public Valet(String plateNumber, String service){
        this.plateNumber = plateNumber;
        this.service = service;
    }

    @Override
    public void executeService() {
    valetService(plateNumber, service);
    }

    public void valetService(String plateNumber, String service){
        System.out.println("🅿"+service+" Vehicle with the Plate Number: 🚗"+plateNumber+"🔢\n");
        System.out.println("✅Service Done!!✅ \n---Returning to Main Menu↩---\n");
    }
}
