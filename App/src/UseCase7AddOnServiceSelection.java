public class UseCase7AddOnServiceSelection {

    public static void main(String[] args) {

        AddOnServiceManager manager = new AddOnServiceManager();

        // Assume reservation already exists from UC6
        String reservationId = "Single-1";

        // Create services
        Service breakfast = new Service("Breakfast", 500);
        Service spa = new Service("Spa", 1000);

        // Add services
        manager.addService(reservationId, breakfast);
        manager.addService(reservationId, spa);

        // Calculate total
        double totalCost = manager.calculateTotalServiceCost(reservationId);

        System.out.println("Add-On Service Selection");
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Total Add-On Cost: " + totalCost);
    }
}