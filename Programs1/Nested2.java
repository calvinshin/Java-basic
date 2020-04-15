public class Nested2 {
    public static void main(String[] args) {
        for(char first = 97; first <= 101; first++) {
            for(char second = 97; second <= 101; second++) {
                System.out.print((char) first);
                System.out.print((char) second);
                System.out.print("\n");
            }
        }
    }
}