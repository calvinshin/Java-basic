import java.util.Scanner;

class Person {
    public String name;
    public String address;
    public String telephoneNumber;

    public String getAddress() {
        return address;
    }
    public String getName() {
        return name;
    }
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Person(String nam, String add, String tele) {
        name = nam;
        address = add;
        telephoneNumber = tele;
    }
    public Person() {
        name = "";
        address = "";
        telephoneNumber = "";
    }
}

class Customer extends Person {
    public String customerNumber;
    public boolean mailingList;

    public String getCustomerNumber() {
        return customerNumber;
    }
    public boolean isMailingList() {
        return mailingList;
    }

    public void setCustomerNumber(String cust) {
        this.customerNumber = cust;
    }
    public void setMailingList(boolean mail) {
        this.mailingList = mail;
    }

    public Customer(String nam, String add, String tele, String cust, boolean mail) {
        super(nam, add, tele);
        customerNumber = cust;
        mailingList = mail;
    }

    public Customer(String customerNumber, boolean mailingList) {
        super();
        customerNumber = customerNumber;
        mailingList = mailingList;
    }
}

public class Driver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter name of customer:");
        String a = keyboard.nextLine();
        System.out.print("Enter address of customer:");
        String b = keyboard.nextLine();
        System.out.print("Enter phone number of customer:");
        String c = keyboard.nextLine();
        System.out.print("Enter customer number:");
        String d = keyboard.nextLine();
        System.out.print("Enter yes/no -- does the customer want to receive mail?");
        String eString = keyboard.next();
        boolean e;
        if(eString == "no") {
            e = false;
        }
        else {
            e = true;
        }
        Customer cust = new Customer(a, b, c, d, e);
        System.out.println("Customer");
        System.out.println("Name: " + cust.getName());
        System.out.println("Address: " + cust.getAddress());
        System.out.println("Phone Number: " + cust.getTelephoneNumber());
        System.out.println("Customer Number: " + cust.getCustomerNumber());
        System.out.println("Receive Mail?: " + cust.isMailingList());
    }
    private void display(Customer cust) {
        System.out.println("Customer");
        System.out.println("Name: " + cust.getName());
        System.out.println("Address: " + cust.getAddress());
        System.out.println("Phone Number: " + cust.getTelephoneNumber());
        System.out.println("Customer Number: " + cust.getCustomerNumber());
        System.out.println("Receive Mail?: " + cust.isMailingList());

    }
}