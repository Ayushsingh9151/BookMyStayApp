import java.util.*;

public class AddOnServiceManager {

    private Map<String, List<Service>> servicesByReservation;

    public AddOnServiceManager() {
        servicesByReservation = new HashMap<>();
    }

    public void addService(String reservationId, Service service) {
        servicesByReservation.putIfAbsent(reservationId, new ArrayList<>());
        servicesByReservation.get(reservationId).add(service);
    }

    public double calculateTotalServiceCost(String reservationId) {
        double total = 0;

        if (servicesByReservation.containsKey(reservationId)) {
            for (Service s : servicesByReservation.get(reservationId)) {
                total += s.getCost();
            }
        }

        return total;
    }
}
