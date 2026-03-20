public class UseCase6RoomAllocation {

    public static void main(String[] args) {

        System.out.println("Room Allocation Processing");

        RoomInventory inventory = new RoomInventory();
        RoomAllocationService service = new RoomAllocationService();

        Reservation r1 = new Reservation("Abhi", "Single");
        Reservation r2 = new Reservation("Subha", "Single");
        Reservation r3 = new Reservation("Vanmathi", "Suite");

        service.allocateRoom(r1, inventory);
        service.allocateRoom(r2, inventory);
        service.allocateRoom(r3, inventory);
    }
}