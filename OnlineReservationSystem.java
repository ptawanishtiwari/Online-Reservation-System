import java.util.Scanner;

public class OnlineReservationSystem {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Online Reservation System ---");
            System.out.println("1. Login");
            System.out.println("2. Make a Reservation");
            System.out.println("3. Cancel a Reservation");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    makeReservation();
                    break;
                case 3:
                    cancelReservation();
                    break;
                case 4:
                    System.out.println("Thank you for using the Online Reservation System.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void login() {
        System.out.println("\n--- Login ---");
        System.out.print("Enter Login ID: ");
        String loginId = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (validateLogin(loginId, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials. Please try again.");
        }
    }

    private static boolean validateLogin(String loginId, String password) {
        // Simple validation for demonstration purposes
        return loginId.equals("admin") && password.equals("password");
    }

    private static void makeReservation() {
        System.out.println("\n--- Reservation Form ---");
        System.out.print("Enter Full Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Train Number: ");
        String trainNumber = scanner.nextLine();
        System.out.print("Enter Train Name: ");
        String trainName = scanner.nextLine();
        System.out.print("Enter Class Type (First/Second/Sleeper): ");
        String classType = scanner.nextLine();
        System.out.print("Enter Date of Journey (YYYY-MM-DD): ");
        String journeyDate = scanner.nextLine();
        System.out.print("Enter From Location: ");
        String from = scanner.nextLine();
        System.out.print("Enter To Destination: ");
        String to = scanner.nextLine();

        System.out.println("\nReservation successful!");
        System.out.println("Name: " + name);
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Train Name: " + trainName);
        System.out.println("Class: " + classType);
        System.out.println("Date of Journey: " + journeyDate);
        System.out.println("From: " + from);
        System.out.println("To: " + to);
    }

    private static void cancelReservation() {
        System.out.println("\n--- Cancellation Form ---");
        System.out.print("Enter PNR Number: ");
        String pnrNumber = scanner.nextLine();

        System.out.println("\nCancellation successful for PNR: " + pnrNumber);
    }
}
