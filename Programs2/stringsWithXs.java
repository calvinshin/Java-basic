//Write a method named stringsWithXs. It should accept an array of Strings,
// and return a new array of Strings that contains each String from the original array that has an x.
public class stringsWithXs {
    public static void main(String[] args) {
        String[] strArray = {"noblesse", "oxygen", "apples", "XYZ", "exacto-knife"};
        String[] xified = stringsWithXs(strArray);
        for(int i = 0; i < xified.length; i++) {
            System.out.println(xified[i]);
        }
    }
    public static String[] stringsWithXs(String[] strArray) {
//      Create a new array for string
        String[] newString = new String[strArray.length];
//      Set the actualLength (to reduce the array later)
        int actualLength = 0;
//      For-loop for the string to check for Xs
        for(int i = 0; i < strArray.length; i++) {
//          Set a boolean to false, set it to true if any of the characters are x
            boolean hasX = false;
//          Set a for loop for the characters within the string to check for X, sets boolean hasX to true
            for(int j = 0; j < strArray[i].length(); j++) {
                char charAtj = strArray[i].toLowerCase().charAt(j);
                if(charAtj == 'x') {
                    hasX = true;
                }
            }
//          if the boolean has been set to true through the loop, add this value to the newString
//          additionally increment the actualLength by one
            if(hasX == true) {
                newString[actualLength] = strArray[i];
                actualLength += 1;
            }
        }
//      create a new reducedString, which takes the newString and removes the blank strings in the array
        String[] reducedString = new String[actualLength];
        for(int i = 0; i < actualLength; i++) {
            reducedString[i] = newString[i];
        }
//      return this reducedString back from calling the function
        return reducedString;
    }
}

