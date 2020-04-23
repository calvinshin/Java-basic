public class intArrayWithStringLengths {
    public static int[] intArrayWithStringLengths(String[] s) {
        int[] intArray = new int[s.length];
        for(int i = 0; i < s.length; i++) {
            intArray[i] = s[i].length();
        }
        return intArray;
    }
    public static void main(String[] args) {
        String[] stringArray = {"planes", "trains", "cars"};
        int[] intArray = intArrayWithStringLengths(stringArray);
        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}