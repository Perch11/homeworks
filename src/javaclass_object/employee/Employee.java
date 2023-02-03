package javaclass_object.employee;

public class Employee {

    private int id;
    private String name;

    private String department;
    private  int age;
    private  String gender;

    public Employee(int id, String name, String department, int age, String gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
    }

    void printEmploye(){
        System.out.print(id + " ");
        System.out.print(name + " ");
        System.out.print(department + " ");
        System.out.print(age + " ");
        System.out.println(gender + " ");
    }

    public static void main(String[] args) {

        Employee employee = new Employee(852466,"Harut","hashvapah",25,"arakan");
        Employee employee2 = new Employee(874261,"Hasmik","hashvapah",25,"igakan");
        Employee employee3 = new Employee(897251,"Andranik","injenar",32,"arakan");
        employee.printEmploye();
        employee2.printEmploye();
        employee3.printEmploye();

    }
}
