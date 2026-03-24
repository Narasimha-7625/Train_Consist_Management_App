import java.util.HashMap;
import java.util.Map;

class Train_Consist_Management_App {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Add bogie capacities
        bogieCapacityMap.put("Sleeper Coach", 72);
        bogieCapacityMap.put("AC Chair Car", 60);
        bogieCapacityMap.put("First Class Coach", 24);

        // Display bogie capacity details
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }

        // Example lookup
        String searchBogie = "Sleeper Coach";
        System.out.println("\nCapacity of " + searchBogie + ": "
                + bogieCapacityMap.get(searchBogie));
    }
}