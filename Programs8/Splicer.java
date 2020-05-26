public class Splicer {
    public static String splicey(String str) { String newString = ""; if(str == null | str.length() < 3) {  return newString; } else {  for(int i = 0; i < str.length(); i++) {   if(i%2 == 0) {    newString += str.charAt(i);   }  }  return newString; }}
    public static void main(String[] args) {
        System.out.print(splicey("This string"));
    }
}