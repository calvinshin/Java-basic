public class BARTTrain {
    private String nextStation;
    private double milesPerHour;
    private double milesToNextStation;
    private boolean inbound;
    public BARTTrain() {
        nextStation = "";
        milesPerHour = 0;
        milesToNextStation = 0;
        inbound = false;
    }
    public BARTTrain (String station, double mph, double miles, boolean isInbound) {
        nextStation = station;
        milesPerHour = mph;
        milesToNextStation = miles;
        inbound = isInbound;
    }
    public void setNextStation(String s) {
        nextStation = s;
    }
    public String getNextStation() {
        return nextStation;
    }
    public double getMinutesToNextStation() {
        double value = milesToNextStation/milesPerHour/60;
        return value;
    }
    public void switchInbound() {
        inbound = !inbound;
    }

    public boolean getInbound() {
        return inbound;
    }

    public double getMilesToNextStation() {
        return milesToNextStation;
    }

    public boolean equals(BARTTrain t) {
        if(this.getInbound() == t.getInbound() &&
                this.getMinutesToNextStation() == t.getMinutesToNextStation()
                && this.getNextStation() == t.getNextStation()
                && this.getMilesToNextStation() == t.getMilesToNextStation()){
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
        String returnString = "";
        if(inbound) {
            returnString += "Inbound. ";
        }
        else {
            returnString += "Outbound. ";
        }
        double minutes = getMilesToNextStation();
        returnString += nextStation + " in " + minutes + " minutes.";
        return returnString;
    }

    public static void main(String[] args) {
        BARTTrain traina = new BARTTrain("Berkeley", 60, 15, true);
        BARTTrain trainb = new BARTTrain("Berkeley", 60, 15, true);
        System.out.println(traina.equals(trainb));
        System.out.println(traina.toString());
    }
}