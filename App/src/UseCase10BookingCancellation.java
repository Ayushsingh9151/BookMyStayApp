public class UseCase10BookingCancellation {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();
        CancellationService service = new CancellationService();

        // simulate booking
        service.registerBooking("Single-1", "Single");

        // cancel booking
        service.cancelBooking("Single-1", inventory);

        // show rollback history
        service.showRollbackHistory();

        // ✅ FIXED LINE
        System.out.println("\nUpdated Single Room Availability: "
                + inventory.getAvailability().get("Single"));
    }
}