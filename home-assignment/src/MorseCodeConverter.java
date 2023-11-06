import java.util.HashMap;

public class MorseCodeConverter {

    private static final HashMap<Character, String> english2Morse = new HashMap<>();
    private static final HashMap<String, Character> morse2 = new HashMap<>();

    static {
        // Adding the Letters in HashMaps with English-to-Morse.
        english2Morse.put('A', ".-");
        english2Morse.put('B', "-...");
        english2Morse.put('C', "-.-.");
        english2Morse.put('D', "-..");
        english2Morse.put('E', ".");
        english2Morse.put('F', "..-.");
        english2Morse.put('G', "--.");
        english2Morse.put('H', "....");
        english2Morse.put('I', "..");
        english2Morse.put('J', ".---");
        english2Morse.put('K', "-.-");
        english2Morse.put('L', ".-..");
        english2Morse.put('M', "--");
        english2Morse.put('N', "-.");
        english2Morse.put('O', "---");
        english2Morse.put('P', ".--.");
        english2Morse.put('Q', "--.-");
        english2Morse.put('R', ".-.");
        english2Morse.put('S', "...");
        english2Morse.put('T', "-");
        english2Morse.put('U', "..-");
        english2Morse.put('V', "...-");
        english2Morse.put('W', ".--");
        english2Morse.put('X', "-..-");
        english2Morse.put('Y', "-.--");
        english2Morse.put('Z', "--..");

        // Adding the Numbers in HashMaps with English-to-Morse.
        english2Morse.put('1', ".----");
        english2Morse.put('2', "..---");
        english2Morse.put('3', "...--");
        english2Morse.put('4', "....-");
        english2Morse.put('5', ".....");
        english2Morse.put('6', "-....");
        english2Morse.put('7', "--...");
        english2Morse.put('8', "---..");
        english2Morse.put('9', "----.");
        english2Morse.put('0', "-----");

        // Adding the Symbols in HashMaps with English-to-Morse.
        english2Morse.put('.', ".-.-.-");
        english2Morse.put(',', "--..--");
        english2Morse.put('?', "..--..");
        english2Morse.put('!', "-.-.--");

        // Populate the Morse-to-English map by reversing the English-to-Morse map
        for (char key : english2Morse.keySet()) {
            String value = english2Morse.get(key);
            morse2.put(value, key);
        }
    }


    public static String englishToMorse(String text) {
        String e2Morse = "";
        for (char c : text.toUpperCase().toCharArray()) {
            if (c == ' ') {
                e2Morse = e2Morse + " ";
            } else if (english2Morse.containsKey(c)) {
                e2Morse = e2Morse + english2Morse.get(c) + " ";
            } else {
                return "Invalid input: " + c;
            }
        }
        return e2Morse.trim();
    }

    public static String morseToEnglish(String morseCode) {
        String englishText = "";
        for (String morse : morseCode.split(" ")) {
            // Check for a space
            if (morse.equals("")) {
                englishText = englishText + " ";
            } else if (morse2.containsKey(morse)) {
                englishText = englishText + morse2.get(morse);
            } else {
                return "Invalid input: " + morse;
            }
        }
        return englishText.trim();
    }
}
