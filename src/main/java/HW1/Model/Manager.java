package HW1.Model;

import org.jetbrains.annotations.NotNull;
import java.util.List;

public class Manager extends Employee {
    public Manager(String name, String secondName, String surName, String age, String position, String phoneNumber, int salary) {
        super(name, secondName, surName, age, position, phoneNumber, salary);
    }

    public static void upSalary(@NotNull List<Employee> employeeList, int procentUp) {
        for (Employee employee : employeeList) {
            if (!employee.getPosition().equals("Manager")) {
                employee.setSalary(employee.getSalary() + ((employee.getSalary() * procentUp)) / 100);
            }
        }
    }
}
