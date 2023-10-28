package facadePattern;
import java.util.*;
public class HotelApp {
    public static void main(String[] args) {
        Scanner services = new Scanner(System.in);
        System.out.println("---🏨Welcome to Hotel Service App🛎🛌---");

        while (true) {
            System.out.println("Services Offered:");
            System.out.println("1.) Valet (Car parking & pick-up)");
            System.out.println("2.) Housekeeping (Room Cleaning)");
            System.out.println("3.) Cart (Handling luggage and cart services)");
            System.out.println("4.) Exit");
            System.out.print("Enter desired hotel service: ");
            int request = services.nextInt();
            if (request == 1 | request == 2 | request == 3) {
                Service(request);
            } else if (request == 4) {
                System.out.println("\n--!!App Shutting Down!!--");
                System.exit(0);
            } else {
                System.out.println("\nIncorrect Number!! Please Try Again!!\n");
            }
        }

    }

    public static void Service (int request){
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        switch (request){
            case 1:
                Scanner valet = new Scanner(System.in);
                System.out.println("---🤵Valet Parking Services🚗---");
                System.out.println("1. Parking Service");
                System.out.println("2. Pick-up Service");
                System.out.print("Enter Desired Parking Service: ");
                int serve = scan.nextInt();
                System.out.print("Enter your Vehicle Plate Number: ");
                String plateNumber = valet.nextLine();
                if (serve == 1){
                    String service = "Parking";
                    HotelService valetService = new Valet(plateNumber,service);
                    FrontDesk.hotelService(valetService);
                }
                else if (serve == 2){
                    String service = "Pick-up";
                    HotelService valetService = new Valet(plateNumber,service);
                    FrontDesk.hotelService(valetService);
                }
                break;
            case 2:
                System.out.println("---🧹HouseKeeping Service✨---");
                System.out.print("Enter your Room Number:");
                String roomNumber = scan.nextLine();
                HotelService houseKeepingService = new HouseKeeping(roomNumber);
                FrontDesk.hotelService(houseKeepingService);

                break;
            case 3:
                try {
                    System.out.println("🧳Request Cart Service🛒---");
                    System.out.print("Enter your desired number of carts:");
                    int numberOfCarts = scan.nextInt();
                    HotelService cartService = new Cart(numberOfCarts);
                    FrontDesk.hotelService(cartService);
                }
                catch (Exception e){
                    System.out.println("Exceeding/Invalid Number of Carts\n");
                }
                break;
            default:
        }

    }

}
