import java.util.HashMap;
import java.util.Map;

public class RoomInventory {

    private Map<String, Integer> availability = new HashMap<>();

    // Constructor
    public RoomInventory() {
        availability.put("Single", 5);
        availability.put("Double", 3);
        availability.put("Suite", 2);
    }

    // ✅ Check availability
    public boolean isAvailable(String roomType) {
        return availability.getOrDefault(roomType, 0) > 0;
    }

    // ✅ Reduce room count
    public void reduceRoom(String roomType) {
        int count = availability.getOrDefault(roomType, 0);
        if (count > 0) {
            availability.put(roomType, count - 1);
        }
    }

    // ✅ Optional: Increase room (for cancellation use case)
    public void increaseRoom(String roomType) {
        availability.put(roomType, availability.getOrDefault(roomType, 0) + 1);
    }

    // ✅ Getter
    public Map<String, Integer> getAvailability() {
        return availability;
    }
}