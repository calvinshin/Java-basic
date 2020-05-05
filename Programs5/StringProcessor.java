public class StringProcessor {
//  Basic initialized variable
    private String base;

//  Constructors
    StringProcessor() {
        base = "";
    }
    StringProcessor(String s) {
        base = new String(s);
    }

//  set and get Strings
    public void setString(String s) {
        base = new String(s);
    }
    public String getString() {
        return base;
    }

//  toString
    public String toString() {
        return base;
    }

//  analytics for the String
    public int wordCount() {
//        reduce the string with double spaces;
        StringBuilder newString = new StringBuilder(base);

        while(newString.indexOf("  ")>= 0) {
            int doubleSpace = newString.indexOf("  ");
            newString.replace(doubleSpace, doubleSpace+2, " ");
        }

        String updatedString = newString.toString().trim();

        String[] words = updatedString.split(" ");
        int numberOfWords = words.length;

        return numberOfWords;
    }

    public int uppercaseCount() {
        int count = 0;
        for(int i = 0; i < base.length(); i++) {
            if(Character.isUpperCase(base.charAt(i))) {
                count ++;
            }
        }
        return count;
    }

    public int digitCount() {
        int count = 0;
        for(int i = 0; i < base.length(); i++) {
            if(Character.isDigit(base.charAt(i))) {
                count ++;
            }
        }
        return count;
    }

    public int digitWordCount() {
        int count = 0;
        String[] digitWordArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] baseSplit = base.split(" ");
        for(int i = 0; i < baseSplit.length; i++) {
            for(int j = 0; j < digitWordArray.length; j++) {
                if(baseSplit[i].equalsIgnoreCase(digitWordArray[j])) {
                    count ++;
                }
            }
        }
        return count;
    }

    public String getNoSpaceString() {
        StringBuilder newString = new StringBuilder(base);
        while(newString.indexOf(" ")>= 0) {
            int doubleSpace = newString.indexOf(" ");
            newString.replace(doubleSpace, doubleSpace + 1, "");
        }
        String returnString = new String(newString);
        return returnString;
    }

    public String getNoVowelString() {
        String newString = new String(base);
        String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        for(int i = 0; i < vowels.length; i++) {
            newString = newString.replace(vowels[i], "-");
        }

        return newString;
    }

    public String getNoDigitWordString() {
        String[] digitWordArray = {" zero ", " one ", " two ", " three ", " four ", " five ", " six ", " seven ",  " eight ", " nine "};
        String[] digitArray = {" 0 ", " 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 ", " 9 "};
        String newString = new String(" " + base + " ");

        for(int i = 0; i < 10; i++) {
            newString = newString.replaceAll("(?i)" + digitWordArray[i], digitArray[i]);
        }
        newString = newString.trim();

        return newString;
    }

}
