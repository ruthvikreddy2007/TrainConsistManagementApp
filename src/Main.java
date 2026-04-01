import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // 1. Adding passenger bogies: Sleeper, AC Chair, First Class
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 2. Display the bogies after insertion
        System.out.println("Train Consist after adding bogies: " + passengerBogies);

        // 3. Remove one bogie (e.g., AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("Train Consist after removing 'AC Chair': " + passengerBogies);

        // 4. Check if a specific bogie (e.g., Sleeper) exists
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Does the train contain a 'Sleeper' bogie? " + hasSleeper);

        // 5. Print the final state of the list [cite: 1]
        System.out.println("Final Train Consist: " + passengerBogies);
    }
}