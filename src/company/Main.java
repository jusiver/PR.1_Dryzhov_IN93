package company;

import company.exceptions.FieldLengthException;
import company.exceptions.IncorrectSalaryException;
import company.model.Employee;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat formatter = new DecimalFormat("#.##");

        List<Employee> employeeList = new ArrayList<>();

        try {
            for (int i = 0; i < 5; i++) {
                employeeList.add(new Employee(i + 1, "Name №" + (i + 1), "Surname №" + (i + 1),
                        Double.parseDouble(formatter.format(Math.random() * 1000))));
            }
        } catch (FieldLengthException | IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        }

        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}