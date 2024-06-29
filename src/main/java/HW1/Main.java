package HW1;

import HW1.Model.Employee;
import HW1.Model.Manager;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {
        Employee employee1 = new Employee("Timur", "Maksutovich", "Lii","26.01.1997"
                ,"Skladman", "86543257853",75000);
        Employee employee2 = new Employee("Jon", "Igorevich", "Wick","24.05.1994"
                ,"Skladman", "86543257853",65000);
        Employee employee3 = new Employee("Michail>", "Sergeevich", "Popov","22.12.1967"
                ,"Skladman", "86543257853",70000);
        Employee employee4 = new Employee("Oleg", "Dmitrievich", "Ivleev","01.01.2001"
                ,"Skladman", "86543257853",100000);
        Employee employee5 = new Employee("Igor", "Konstantinovich", "Kim","22.06.1987"
                ,"Skladman", "86543257853",50000);
        Manager manager1 = new Manager("Igor", "Konstantinovich", "Kim","22.06.1987"
                ,"Manager","8574538504",120000);


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(manager1);


        Manager.upSalary(employeeList,15);
        for(Employee employee : employeeList){
            System.out.println(employee);
        }

        String s = "vakue " +2 +2 ;
        System.out.println(s);

        System.out.println(0);

        int []a  = new int []{1,2,3,4,5};

        for(int i = 10;i > 0;i++){
            System.out.println(i);
        }
    }
}
