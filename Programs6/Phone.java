public abstract class Phone {
    private String phoneNumber;
    public Phone(String number) {
        phoneNumber = number;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String toString() {
        String returnString = "#" + phoneNumber;
        return returnString;
    }
    public abstract boolean createConnection(Network name);
    public abstract void closeConnection();
}

class Network {

}