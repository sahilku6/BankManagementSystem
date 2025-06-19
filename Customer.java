class Customer extends Bank {
    public int customerId;
    public String customerName;
    public int age;
    public String customerPhone;
    public String customerEmail;
    public String customerAddress;

    public void getCustomerDetails() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + customerName);
        System.out.println("Email: " + customerEmail);
        System.out.println("Phone: " + customerPhone);
        System.out.println("Age: " + age);
        System.out.println("Address: " + customerAddress);
        
    }
}