package Model;

import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Data
public class Employee implements Comparable<Employee> {
    private String name;

    private String secondName;
    private String surName;
    private String age;
    private String position;
    private String phoneNumber;
    private int salary;


    public Employee(String name, String secondName, String surName, String age, String position, String phoneNumber, int salary) {
        this.name = name;
        this.secondName = secondName;
        this.surName = surName;
        this.age = age;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public String getAllInfo() {
         return ("Employee{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                '}' );
    }


    public Date convertToDate(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        return format.parse(date);
    }

    @Override
    public int compareTo(Employee o) {
        try {
            return (this.convertToDate(this.getAge()).getTime() > (o.convertToDate(o.getAge())).getTime()) ? 1 : -1;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
