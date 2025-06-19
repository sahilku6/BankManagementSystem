class Employee extends Bank {
    public int employeeId;
    public String firstName;
    public String lastName;
    public String email;
    public String phoneNumber;
    public String address;

    public void getEmpDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + address);
    }
}