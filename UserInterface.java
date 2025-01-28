package YearlySalaryCalculator;

import java.util.Scanner;

public class UserInterface {

    public UserInterface() {
        startInterface();
    }

    public void startInterface() {
        Scanner userInput = new Scanner(System.in);
        while (true) {
            System.out.print("\nPlease enter your weekly working hours: ");
            double userHours = userInput.nextDouble();
            System.out.print("Please enter your hourly rate: $");
            double userRate = userInput.nextDouble();
            SalaryCalculator calculator = new SalaryCalculator(userHours, userRate);
            System.out.printf("Your yearly salary is: $%.2f%n", calculator.calculateYearlyRate());

            userInput.nextLine();
            System.out.print(
                    "\nWould you like to calculate another weekly rate? If not, the program will exit (YES/NO): ");
            String response = userInput.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                continue;
            } else {
                System.out.println("Exiting interface...");
                break;
            }
        }
        userInput.close();
    }
}
