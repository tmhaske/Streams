package org.tm.model;

public class Employee {
    private int id;
    private String name;
    private String department;
    private String city;
    private double salary;

    public Employee(int id, String name, String department, String city, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.city = city;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                '}';
    }
}
