abstract class Employee {
    String name;
    int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    abstract double calculateSalary();
    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class Abstaction {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("Pradeep", 1, 50000);
        Employee partTime = new PartTimeEmployee("Bravo", 2, 300, 20);

        System.out.println("Full-Time Employee Details:");
        fullTime.displayDetails();
        System.out.println("Salary: " + fullTime.calculateSalary());

        System.out.println("\nPart-Time Employee Details:");
        partTime.displayDetails();
        System.out.println("Salary: " + partTime.calculateSalary());
    }
}

