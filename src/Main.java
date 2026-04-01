import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create a LinkedList for the consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add initial bogies: Engine, Sleeper, AC, Cargo, Guard
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist: " + trainConsist);

        // Insert a Pantry Car at position 2 (index 2)
        // This demonstrates the add(index, element) method
        trainConsist.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car at position 2: " + trainConsist);

        // Remove the first and last bogie using specific LinkedList methods [cite: 1]
        trainConsist.removeFirst(); // Removes Engine [cite: 1]
        trainConsist.removeLast();  // Removes Guard [cite: 1]

        // Display the final ordered train consist [cite: 1]
        System.out.println("Final Ordered Train Consist: " + trainConsist);
    }
}