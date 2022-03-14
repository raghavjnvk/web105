package Controller;

import Model.Employee;
import Service.EmployeeCredentailService;

import java.util.Scanner;

public class EmployeeController {
    public static void main(String[] args) {
        Employee employee = new Employee("Raghav", "Jyothi");
        EmployeeCredentailService service = new EmployeeCredentailService();
        Scanner sc = new Scanner(System.in);
        String generatedEmail;
        char[] generatedPassword;
        System.out.println("\n 1 Technical  \n 2 Admin \n 3 HR");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                generatedEmail = service.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "Technical");
                generatedPassword = service.generatePassword();
                service.showCredentials(employee, generatedEmail,generatedPassword);
                break;
            case 2:

                generatedEmail = service.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "Admin");
                generatedPassword = service.generatePassword();
                service.showCredentials(employee, generatedEmail,generatedPassword);
                break;
            case 3:
                generatedEmail = service.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "HR");
                generatedPassword = service.generatePassword();
                service.showCredentials(employee, generatedEmail,generatedPassword);
                break;
            default: System.out.println("Invalid choice");
                break;


        }
    }

}