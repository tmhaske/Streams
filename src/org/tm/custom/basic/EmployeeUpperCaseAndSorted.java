package org.tm.custom.basic;

import org.tm.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUpperCaseAndSorted {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Alice", "HR", "New York", 50000));
        employees.add(new Employee(2, "Bob", "IT", "San Francisco", 80000));
        employees.add(new Employee(3, "Charlie", "Finance", "Chicago", 60000));
        employees.add(new Employee(4, "David", "Marketing", "Los Angeles", 55000));
        employees.add(new Employee(5, "Eva", "IT", "Seattle", 78000));
        employees.add(new Employee(6, "Frank", "HR", "Boston", 52000));
        employees.add(new Employee(7, "Grace", "Finance", "Denver", 61000));
        employees.add(new Employee(8, "Hank", "IT", "Austin", 82000));
        employees.add(new Employee(9, "Ivy", "Marketing", "Miami", 57000));
        employees.add(new Employee(10, "Jack", "Sales", "Atlanta", 53000));
        employees.add(new Employee(11, "Karen", "HR", "New York", 50000));         // same dept, city, salary as Alice
        employees.add(new Employee(12, "Leo", "IT", "San Francisco", 80000));      // same dept, city, salary as Bob
        employees.add(new Employee(13, "Mona", "Finance", "Chicago", 60000));      // same dept, city, salary as Charlie
        employees.add(new Employee(14, "Nina", "Marketing", "Miami", 57000));      // same dept, city, salary as Ivy
        employees.add(new Employee(15, "Oscar", "IT", "Seattle", 78000));          // same dept, city, salary as Eva
        employees.add(new Employee(16, "Paul", "Sales", "Atlanta", 53000));        // same dept, city, salary as Jack
        employees.add(new Employee(17, "Quinn", "HR", "Boston", 52000));           // same dept, city, salary as Frank
        employees.add(new Employee(18, "Rita", "Finance", "Denver", 61000));       // same dept, city, salary as Grace
        employees.add(new Employee(19, "Steve", "Marketing", "Los Angeles", 55000)); // same dept, city, salary as David
        employees.add(new Employee(20, "Tina", "IT", "Austin", 82000));            // same dept, city, salary as Hank

        System.out.println("Orignal employee list :: " + employees);

        List<String> result = employees.stream()
                .map(emp -> emp.getName().toUpperCase())
                .sorted()
                .toList();
        System.out.println("Result :: " + result);

    }
}