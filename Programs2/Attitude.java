

public class Atittude {
    public static void main(String[] args) {
        printAttitude(1);
        printAttitude(2);
    }
    public static void printAttitude(int parameter) {
        switch(parameter) {
            case 1:
                System.out.println("disagree");
                break;
            case 2:
                System.out.println("no opinion");
                break;
            case 3:
                System.out.println("agree");
                break;
            default:
                break;
        }
    }
}