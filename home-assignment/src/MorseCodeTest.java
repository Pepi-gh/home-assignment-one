import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class MorseCodeTest {
    @Test
    public void TestCode() {
        String expected = MorseCodeConverter.englishToMorse("Peter loves coding");
        assertEquals(".--. . - . .-.  .-.. --- ...- . ...  -.-. --- -.. .. -. --.", expected);
    }

    @Test
    public void TestMorseCode() {
        String expected = MorseCodeConverter.morseToEnglish(".--. . - . .-.  .-.. --- ...- . ...  -.-. --- -.. .. -. --.");
        assertEquals("PETER LOVES CODING", expected);
    }

    @Test
    public void testMorseSymbols() {
        String expected = MorseCodeConverter.englishToMorse("..!!??");
        assertEquals(".-.-.- .-.-.- -.-.-- -.-.-- ..--.. ..--.. ", expected);
    }

    @Test
    public void testSymbolsMorse() {
        String expected = MorseCodeConverter.morseToEnglish(".-.-.- .-.-.- -.-.-- -.-.-- ..--.. ..--.. ");
        assertEquals("..!!??", expected);
    }

    @Test
    public void testHelloWorld() {
        String expected = MorseCodeConverter.englishToMorse("Hello World");
        assertEquals(".... . .-.. .-.. ---  .-- --- .-. .-.. -.. ", expected);
    }


}
