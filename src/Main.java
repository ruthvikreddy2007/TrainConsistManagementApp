import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create a HashSet to store unique Bogie IDs
        Set<String> bogieIds = new HashSet<>();

        System.out.println("--- Train Consist Management: UC3 ---");

        // Adding unique bogie IDs
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        // Attempting to add a duplicate ID (BG101)
        System.out.println("Attempting to add duplicate ID: BG101");
        boolean isAdded = bogieIds.add("BG101");

        if (!isAdded) {
            System.out.println("Duplicate ignored: BG101 is already in the system.");
        }

        // Adding another unique ID
        bogieIds.add("BG104");

        // Displaying the final list of unique Bogie IDs [cite: 1]
        System.out.println("\nFinal Unique Bogie IDs in Train Consist:");
        for (String id : bogieIds) {
            System.out.println("- " + id);
        }

        // Note: HashSet does not maintain insertion order [cite: 1]
        System.out.println("\nTotal unique bogies: " + bogieIds.size());
    }
}