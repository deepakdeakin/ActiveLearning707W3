// TestFirstClass.java
import org.junit.Test;
import static org.junit.Assert.*;

public class TestFirstClass {

	// Test for add function
    @Test
    public void testAddZeroAndZero() {
        assertEquals(0, FirstClass.add(0, 0)); // Expected outcome: 0
    }

    @Test
    public void testAddZeroAndPositiveInteger() {
        assertEquals(2, FirstClass.add(0, 2)); // Expected outcome: 2
    }

    @Test
    public void testAddPositiveIntegerAndZero() {
        assertEquals(2, FirstClass.add(2, 0)); // Expected outcome: 2
    }

    @Test
    public void testAddNegativeIntegerAndZero() {
        assertEquals(-2, FirstClass.add(-2, 0)); // Expected outcome: -2
    }

    @Test
    public void testAddZeroAndNegativeInteger() {
        assertEquals(-2, FirstClass.add(0, -2)); // Expected outcome: -2
    }

 

    // Test for concat function
    @Test
    public void testConcatValidStrings() {
        assertEquals("Hello World", FirstClass.concat("Hello ", "World")); // Expected outcome: "Hello World"
    }

    @Test
    public void testConcatEmptyStrings() {
        assertEquals("", FirstClass.concat("", "")); // Expected outcome: ""
    }

    @Test
    public void testConcatNullStrings() {
        assertEquals("nullnull", FirstClass.concat(null, null)); // Expected outcome: "nullnull"
    }
    
 
    @Test
    public void testConcatBothZeroStrings() {
        assertEquals("00", FirstClass.concat("0", "0")); // Expected outcome: "00"
    }

    @Test
    public void testConcatFirstZeroStringSecondEmpty() {
        assertEquals("0", FirstClass.concat("0", "")); // Expected outcome: "0"
    }

    @Test
    public void testConcatFirstNullSecondZeroString() {
        assertEquals("null0", FirstClass.concat(null, "0")); // Expected outcome: "null0"
    }

    @Test
    public void testConcatFirstZeroStringSecondNull() {
        assertEquals("0null", FirstClass.concat("0", null)); // Expected outcome: "0null"
    }


}
