public class Telephone {
    public static String getFullNumber(String original) {
        String newString = "718-" + original;
        return newString;
    }
    public static void main(String[] args) {
        System.out.print(Telephone.getFullNumber("test"));
        Telephone test = new Telephone();
        System.out.print(test);
    }
    public String toString() {
        String str = "#(" + red + "," + green + "," + blue + ")";
        return str;
    }
    public String red = "a";
    public String green = "a";
    public String blue = "a";
}