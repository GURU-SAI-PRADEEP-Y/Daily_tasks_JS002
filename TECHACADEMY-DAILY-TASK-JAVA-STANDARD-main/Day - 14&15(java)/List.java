import java.util.*;

public class List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // Adding the 10 values in the List
        System.out.println("Enter the list of values: ");
        for (int i = 0; i < 10; i++) {
            int element = sc.nextInt();
            list.add(element);
        }

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (Integer num : list) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        Collections.sort(evenNumbers);
        System.out.println("Sorted Even Numbers: " + evenNumbers);

        // Use a HashMap to store employee id -> name
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "Pradeep");
        employees.put(102, "Sravya");
        employees.put(103, "Sai");
        employees.put(104, "Rohit");

        System.out.println("Employee ID -> Name:");
        for (Integer it : employees.keySet()) {
            System.out.println(it + " -> " + employees.get(it));
        }
    }
}