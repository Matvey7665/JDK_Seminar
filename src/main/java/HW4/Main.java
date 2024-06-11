package HW4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        Employee employee1 = new Employee(1,"+375291429541","Петя",2);
        Employee employee2 = new Employee(2,"+375294565786","Генадий",4);
        Employee employee3 = new Employee(3,"+375291426561","Владимир",12);
        Employee employee4 = new Employee(4,"+375291478849","Света",2);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        Guid.addEmployee(employees,employee4);
        Guid guid = new Guid(employees);
        Guid.saerchByExpr(2,employees);
        Guid.searchPhoneByName("Петя",employees);
        Guid.searchByNumber(4,employees);


    }


}
