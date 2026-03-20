import java.util.HashMap;
import java.util.Map;

public class RoomInventory {

    private Map<String, Integer> availability = new HashMap<>();

    public RoomInventory() {
        availability.put("Single", 5);
        availability.put("Double", 3);
        availability.put("Suite", 2);
    }

    // Check availability
    public boolean isAvailable(String roomType) {
        return availability.getOrDefault(roomType, 0) > 0;
    }

    // Reduce room (booking)
    public void reduceRoom(String roomType) {
        int count = availability.getOrDefault(roomType, 0);
        if (count > 0) {
            availability.put(roomType, count - 1);
        }
    }

    // Add room (cancellation) ✅ FIX
    public void addRoom(String roomType) {
        availability.put(roomType, availability.getOrDefault(roomType, 0) + 1);
    }

    // Get availability
    public Map<String, Integer> getAvailability() {
        return availability;
    }
}