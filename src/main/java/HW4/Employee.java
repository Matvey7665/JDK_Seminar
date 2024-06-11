package HW4;

public class Employee {
   private int service_number;
   private String phone;
   private String name;
   private int experience;

    public Employee(int service_number, String phone, String name, int experience) {
        this.service_number = service_number;
        this.phone = phone;
        this.name = name;
        this.experience = experience;
    }

    public int getService_number() {
        return service_number;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "service_number=" + service_number +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
