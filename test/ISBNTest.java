import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ISBNTest {

    // Test the isbn13 method
    @Test
    public void testValidISBN13() {
        String result = ISBN.isbn13("9780316066525");
        assertEquals("Valid", result);
    }

    // Test the isbn13 method with an invalid ISBN
    @Test
    public void testInvalidISBN13() {
        String result = ISBN.isbn13("9780316066524");
        assertEquals("Invalid", result);
    }

    // Test the isbn13 method with a 10-digit ISBN
    @Test
    public void testInvalidISBN10() {
        String result = ISBN.isbn13("0316066523");
        assertEquals("Invalid", result);
    }

    // Test the isbn13 method with an invalid ISBN-13
    @Test
    public void testInvalidLength() {
        String result = ISBN.isbn13("978031606652");
        assertEquals("Invalid", result);
    }

    // Test the isbn13 method with an invalid ISBN-13
    @Test
    public void testInvalidISBN10X() {
        String result = ISBN.isbn13("031606652Y");
        assertEquals("Invalid", result);
    }
}