package Homework.Lesson7_1;



public class EmployeeTest2 {

    public static void main(String[] args) {
        Homework.Lesson7.Employee emp1 = new Homework.Lesson7.Employee(5);
       // Homework.Lesson7.Employee emp2 = new Homework.Lesson7.Employee("Ivanov");
       // Homework.Lesson7.Employee emp3 = new Homework.Lesson7.Employee(555.55);
/*
        System.out.println(emp1.id);
        System.out.println(emp1.surname);
        System.out.println(emp1.salary);*/

        emp1.getId();
        emp1.getSalary();
        emp1.getSurname();

    }

}
