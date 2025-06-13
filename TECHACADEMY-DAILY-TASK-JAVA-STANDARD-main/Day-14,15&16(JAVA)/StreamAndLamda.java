import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAndLamda {
    public static void main(String[] args) {
        List<String> employeeNames = Arrays.asList("Pradeep", "Akshay", "Aniket", "David", "Arun", "Rohit");

        List<String> filteredNames = employeeNames.stream()
            .filter(name -> name.startsWith("A"))
            .map(name -> name.toUpperCase())
            .collect(Collectors.toList());

        // Step 3: Print names with prefix and index
        System.out.println("Filtered Employee Names Starting with 'A':");
        for (int i = 0; i < filteredNames.size(); i++) {
            System.out.println(filteredNames.get(i));
        }
    }
}
