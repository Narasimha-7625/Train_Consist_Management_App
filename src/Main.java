import java.util.ArrayList;
import java.util.List;
class Train_Consist_Management_App {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize train consist
        List<String> trainConsist = new ArrayList<>();

        // Add passenger bogies
        trainConsist.add("Sleeper Coach");
        trainConsist.add("AC Chair Car");
        trainConsist.add("First Class Coach");

        System.out.println("\nAfter adding passenger bogies:");
        System.out.println("Total bogies: " + trainConsist.size());
        System.out.println("Train Consist: " + trainConsist);

        // Remove a bogie
        trainConsist.remove("AC Chair Car");

        System.out.println("\nAfter removing AC Chair Car:");
        System.out.println("Total bogies: " + trainConsist.size());
        System.out.println("Train Consist: " + trainConsist);

        // Check if a bogie exists
        String searchBogie = "Sleeper Coach";
        if (trainConsist.contains(searchBogie)) {
            System.out.println("\n" + searchBogie + " is present in the train.");
        } else {
            System.out.println("\n" + searchBogie + " is NOT present in the train.");
        }
    }
}