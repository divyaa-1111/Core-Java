// 1. User Class (Isme main method nahi hai)
class User {
    int id;
    String name;

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// 2. Employee Class
class Employee extends User {
    double salary;

    Employee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    double calculateAnnualSalary() {
        return salary * 12;
    }
}

// 3. Main Class (ISKE ANDAR MAIN METHOD HAI)
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "John", 5000.0);
        System.out.println("Name: " + emp.name);
        System.out.println("Annual Salary: " + emp.calculateAnnualSalary());
    }
}