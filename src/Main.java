import java.util.HashSet;
import java.util.Set;

 class Train_Consist_Management_App {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize Set for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs
        System.out.println("\nAdding Bogies:");

        addBogie(bogieIds, "BG101");
        addBogie(bogieIds, "BG102");
        addBogie(bogieIds, "BG103");

        // Attempt to add duplicate
        addBogie(bogieIds, "BG101");

        // Display final bogie IDs
        System.out.println("\nFinal Bogie IDs in Train:");
        System.out.println(bogieIds);

        // Total count
        System.out.println("Total unique bogies: " + bogieIds.size());
    }

    // Method to safely add bogie
    public static void addBogie(Set<String> bogieIds, String id) {
        if (bogieIds.add(id)) {
            System.out.println("Bogie " + id + " added successfully.");
        } else {
            System.out.println("Duplicate ID detected! Bogie " + id + " NOT added.");
        }
    }
}