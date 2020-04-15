public class TriangleAsterisks {
    public static void main(String[] args) {
        int n = 3;
        int i;
        int j;
        for(i = 1; i <= n; i++) {
            for(j = 1; j<= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}