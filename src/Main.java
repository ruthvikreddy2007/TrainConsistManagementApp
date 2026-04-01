import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Supporting Bogie class based on the UC8 context
class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie{Type='" + type + "', Capacity=" + capacity + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. User creates a list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 80));

        System.out.println("Original Bogie List:");
        bogies.forEach(System.out::println);

        // 2 & 3. Convert list to stream and apply filter (capacity > 60)
        // 4. Match bogies are collected into a new list
        List<Bogie> highCapacityBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // 5. Filtered bogies are displayed
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        if (highCapacityBogies.isEmpty()) {
            System.out.println("No bogies match the criteria.");
        } else {
            highCapacityBogies.forEach(System.out::println);
        }

        // 6. Program continues (Original list remains unchanged) [cite: 1]
    }
}