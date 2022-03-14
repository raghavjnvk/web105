package Service;

import Model.Employee;

import java.util.Random;

public class EmployeeCredentailService {
    public char[] generatePassword() {
        char password[] = new char[8];
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String specialCharacters = "!@#$%^&*_=+-/.?<>)";
        String values = capitalLetters + lowerLetters + num + specialCharacters;
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            password[i] = values.charAt(random.nextInt(values.length()));

        }
        return password;
    }

    public String generateEmailAddress(String firstName, String LastName, String department) {
        return firstName + LastName + "@" + department + "greatlearning.com";
    }

    public void showCredentials(Employee employee, String email, char[] generatedPassword) {
        System.out.println("\n Employee" + employee.getFirstName());
        System.out.println("\n Email" + email);
        System.out.println("\n GeneratedPassword" + String.valueOf(password));
    }
}
