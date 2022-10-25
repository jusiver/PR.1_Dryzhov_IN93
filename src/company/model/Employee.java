package company.model;

import company.exceptions.FieldLengthException;
import company.exceptions.IncorrectSalaryException;

public class Employee {

    private int id;
    private static int nextId;
    private String name;
    private String surname;
    private double salary;

    public Employee(int id, String name, String surname, double salary) throws FieldLengthException, IncorrectSalaryException {
        if (name.length() > 15)
            throw new FieldLengthException("Ім'я повинне мати не більше 15 символів");
        if (surname.length() > 25)
            throw new FieldLengthException("Прізвище повинне мати не більше 25 символів");
        if (salary < 0)
            throw new IncorrectSalaryException();
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        nextId = id + 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                id + ". Name: " + name + '\n' +
                "Surname: " + surname + '\n' +
                "Salary: " + salary + "\n";
    }
}
