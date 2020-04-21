public class ABC {

    private int value;


    public ABC(int x) {

        this.value = x + 1;

    }


    public void nonsense() {


        for (int i = 0; i < value; i++) {

            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        ABC a = new ABC(5);
        a.nonsense();
    }
}