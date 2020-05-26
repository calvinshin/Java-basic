public class test {
    public static void main(String[] args) {
        try {
            System.out.println("1");
            Location l1 = new Location(0.0, 0.0);

            System.out.println("2");
            Location l2 = new Location(l1);

            System.out.println("3");
            Location l3 = new Location(-5.0, -5.0);

            System.out.println("4");
            Location l4 = new Location(l3);
        } catch (Exception e) {
            System.out.println("caught an exception");
        }
    }
}