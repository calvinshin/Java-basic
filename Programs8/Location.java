public class Location {

    private double latitude, longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;

        System.out.println("In 2 arg constructor...");

        if (latitude < 0 || longitude < 0) {
            throw new IllegalArgumentException("Negative values.");
        }

        System.out.println("Looks good.");
    }


    public Location(Location location) {
        this(location.latitude, location.longitude);
    }

    // Getters and setters here...
}