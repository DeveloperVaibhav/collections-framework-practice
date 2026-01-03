import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Cherry");
        fruitList.add("Date");
        fruitList.add("Elderberry");

        System.out.println("Fruit list: " + fruitList);

        //create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "HR", 60000));
        employees.add(new Employee(2, "Ethan", "IT", 75000));
        employees.add(new Employee(3, "Charlie", "Finance", 80000));
        employees.add(new Employee(4, "Jack", "IT", 72000));
        employees.add(new Employee(5, "Ethan", "HR", 58000));

        //sort the employees by name and if name is same then sort by department
        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getDepartment);
        employees.sort(employeeComparator);

        //System.out.println("Sorted Employees:" + employees);
        System.out.println("-----------------------------------");
        System.out.println("Id | Name | Department | Salary");
        System.out.println("-----------------------------------");
        //print the sorted employees
        for(Employee emp : employees){
            System.out.println(emp);
        }

    }
}