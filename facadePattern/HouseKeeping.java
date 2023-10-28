package facadePattern;

public class HouseKeeping implements HotelService{
    private String roomNumber;
    public HouseKeeping(String roomNumber){
        this.roomNumber = roomNumber;
    }

    @Override
    public void executeService() {
        valetService(roomNumber);
    }

    public void valetService(String roomNumber){
        System.out.println("🧹Cleaning Room Number: "+roomNumber+"✨\n");
        System.out.println("✅Service Done!!✅ \n---Returning to Main Menu↩---\n");
    }
}
