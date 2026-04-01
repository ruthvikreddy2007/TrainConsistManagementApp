import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // 1. Create a LinkedHashSet<String> to represent the train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // 2. Attach bogies: Engine, Sleeper, Cargo, Guard
        System.out.println("--- Attaching Bogies ---");
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 3. Attempt to attach a duplicate bogie intentionally (e.g., Sleeper again)
        System.out.println("Attempting to add duplicate 'Sleeper'...");
        boolean isAdded = trainFormation.add("Sleeper");

        if (!isAdded) {
            System.out.println("Duplicate detected: 'Sleeper' was not added again.");
        }

        // 4. Display the final formation order [cite: 1]
        System.out.println("\nFinal Train Formation (Order Preserved):");
        System.out.println(trainFormation);

        // 5. Demonstrate ordered iteration [cite: 1]
        System.out.println("\nIterating through formation:");
        for (String bogie : trainFormation) {
            System.out.println("Bogie: " + bogie);
        }
    }
}