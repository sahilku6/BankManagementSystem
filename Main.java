import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dummy user data for login
        Customer customer = new Customer();
        customer.customerId = 101;
        customer.customerName = "Sahil Kumar";
        customer.customerEmail = "sahil@gmail.com";
        customer.BankBalance = 10000;
        customer.age = 24;
        customer.customerPhone = "7282081708";

        Employee employee = new Employee();
        employee.employeeId = 201;
        employee.firstName = "Alice";
        employee.lastName = "Smith";
        employee.phoneNumber = "123456789";
        employee.email = "Alice@gmail.com";

        System.out.println("Welcome to the Bank Management System");
        System.out.println("Login as:\n1. Customer\n2. Employee");
        int userChoice = sc.nextInt();

        switch (userChoice) {
            case 1: // Customer login
                System.out.print("Enter Customer Email: ");
                String custEmail = sc.next();
                if (custEmail.equals(customer.customerEmail)) {
                    System.out.println("Login successful!");
                    boolean exit = false;
                    while (!exit) {
                        System.out.println("\nCustomer Menu:");
                        System.out.println("1. View Details");
                        System.out.println("2. Deposit");
                        System.out.println("3. Withdraw");
                        System.out.println("4. Check Balance");
                        System.out.println("5. Exit");
                        int option = sc.nextInt();
                        switch (option) {
                            case 1:
                                customer.getCustomerDetails();
                                break;
                            case 2:
                                System.out.print("Enter amount to deposit: ");
                                int dep = sc.nextInt();
                                new Transaction("Deposit").getTransactionDetails(dep, customer); // Pass customer to
                                                                                                 // update balance
                                break;
                            case 3:
                                System.out.print("Enter amount to withdraw: ");
                                int with = sc.nextInt();
                                new Transaction("Withdrawal").getTransactionDetails(with, customer); // Pass customer to
                                                                                                     // update balance
                                break;
                            case 4:
                                new Transaction("CheckBalance").getTransactionDetails(0, customer); // Pass customer to
                                                                                                    // check balance
                                break;
                            case 5:
                                exit = true;
                                System.out.println("Logged out.");
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    }
                } else {
                    System.out.println("Invalid login.");
                }
                break;

            case 2: // Employee login
                System.out.print("Enter Employee ID: ");
                int empId = sc.nextInt();
                if (empId == employee.employeeId) {
                    System.out.println("Login successful!");
                    boolean exit = false;
                    while (!exit) {
                        System.out.println("\nEmployee Menu:");
                        System.out.println("1. View Employee Details");
                        System.out.println("2. View Customer Details");
                        System.out.println("3. Check Bank Balance");
                        System.out.println("4. Exit");
                        int empChoice = sc.nextInt();
                        switch (empChoice) {
                            case 1:
                                employee.getEmpDetails();
                                break;
                            case 2:
                                customer.getCustomerDetails();
                                break;
                            case 3:
                                System.out.println("Bank Balance: " + customer.BankBalance);
                                break;
                            case 4:
                                exit = true;
                                System.out.println("Logged out.");
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    }
                } else {
                    System.out.println("Invalid employee ID.");
                }
                break;

            default:
                System.out.println("Invalid selection.");
        }

        sc.close();
    }
}
