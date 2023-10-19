package fr.wildcodeschool.unittesting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    private StringUtils cut;

    @BeforeEach
    void setup() {
        cut = new StringUtils();
    }

    // vowels Method tests
    @Test
    void vowelsMethodTest() throws Exception {
        String result = cut.vowels("A house is a cool thing !");
        assertEquals("Aoueiaooi", result);
    }

    @Test
    void vowelsExceptionTest() {
        Exception exception = assertThrows(Exception.class, () -> {
            cut.vowels("");
        });

        String expectedMessage = "Your input shouldn't be empty !";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void vowelsReturnStringTest() throws Exception {
        var result = cut.vowels("A house is a cool thing !");
        assertTrue(result.getClass().equals(String.class));
    }


    // uniqueVowels method tests
    @Test
    void uniqueVowelsDuplicateTest() throws Exception {
        String result = cut.uniqueVowels("This is a duplicate test for the method");
        assertEquals("iaueo", result);
    }

    @Test
    void uniqueVowelsExceptionTest() {
        Exception exception = assertThrows(Exception.class, () -> {
            cut.uniqueVowels("");
        });

        String expectedMessage = "Your input shouldn't be empty !";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void uniqueVowelsReturnStringTest() throws Exception {
        var result = cut.uniqueVowels("A house is a cool thing !");
        assertTrue(result.getClass().equals(String.class));
    }


    @AfterEach
    void teardown() {
        cut = null;
    }
}
