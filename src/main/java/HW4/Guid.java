package HW4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Guid {
    List<Employee> employees;

    public Guid(List<Employee> employees) {
        this.employees = employees;
    }

    public static void saerchByExpr(int exp,List<Employee> employees)  {

            for (int i = 0; i < employees.toArray().length; i++) {
                try {
                    if (employees.get(i).getExperience() == exp){
                        System.out.println(employees.get(i).getName());
                    }
                }catch (Exception e){
                    throw new RuntimeException("Не найден");
                }

            }


    }
    public static void searchPhoneByName(String name , List<Employee> employees){
        for (int i = 0; i <employees.toArray().length ; i++) {
           try {
               if (employees.get(i).getName() == name){
                   System.out.println(employees.get(i).getPhone());
               }
           }catch (Exception e){
               throw new RuntimeException("Не найден");
           }
        }
    }
    public static void searchByNumber(int number,List<Employee> employees){
        for (int i = 0; i <employees.toArray().length ; i++) {
            try {
                if (employees.get(i).getService_number() == number){
                    System.out.println(employees.get(i));
                }
            }catch (Exception e){
                throw new RuntimeException("Не найден");
            }

        }

    }
    public static void addEmployee(List<Employee> employees,Employee employee){
        employees.add(employee);
    }


    @Override
    public String toString() {
        return "Guid{" +
                "employees=" + employees +
                '}';
    }
}
