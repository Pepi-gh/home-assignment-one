public class Main {

    public static void main(String[] args) {
        MorseCodeConverter converter = new MorseCodeConverter();
        String morseCode = "... --- ... ; - .... . ; .- .-. -..";
        String englishText = converter.morseToEnglish(morseCode);
        System.out.println("Morse Code: " + morseCode);
        System.out.println("English Text: " + englishText);

        String text = "SOS THE ARD";
        String morseCodeText = converter.englishToMorse(text);
        System.out.println("English Text: " + text);
        System.out.println("Morse Code: " + morseCodeText);
    }
}