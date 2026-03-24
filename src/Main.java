import java.util.LinkedHashSet;
 class Train_Consist_Management_App {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        System.out.println("\nAttaching Bogies:");

        trainFormation.add("Engine");
        trainFormation.add("Sleeper Coach");
        trainFormation.add("Cargo Wagon");
        trainFormation.add("Guard Coach");

        // Attempt to add duplicate
        System.out.println("\nAttempting to add duplicate bogie: Sleeper Coach");
        trainFormation.add("Sleeper Coach"); // Will be ignored

        // Display final formation
        System.out.println("\nFinal Train Formation (Insertion Order Preserved):");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }
    }
}