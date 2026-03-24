import java.util.LinkedList;

 class Train_Consist_Management_App {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for ordered train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper Coach");
        trainConsist.add("AC Coach");
        trainConsist.add("Cargo Wagon");
        trainConsist.add("Guard Coach");

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2 (index starts from 0)
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(trainConsist);

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nAfter removing first and last bogies:");
        System.out.println(trainConsist);

        // Final consist
        System.out.println("\nFinal Ordered Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}