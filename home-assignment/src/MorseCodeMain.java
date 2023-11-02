import java.util.Scanner;

public class MorseCodeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. English to Morse");
        System.out.println("2. Morse to English");
        int option = scanner.nextInt();
        scanner.nextLine();

        if (option == 1) {
            System.out.print("Enter English text: ");
            String englishText = scanner.nextLine();
            String morseCode = MorseCodeConverter.englishToMorse(englishText);
            System.out.println("Morse Code: " + morseCode);
        } else if (option == 2) {
            System.out.print("Enter Morse code: ");
            String morseCode = scanner.nextLine();
            String englishText = MorseCodeConverter.morseToEnglish(morseCode);
            System.out.println("English Text: " + englishText);
        } else {
            System.out.println("Invalid option.");
        }
    }
}