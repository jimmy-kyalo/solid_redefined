import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.Square;

public class SquareTest {
    // Test that the area of a square with a positive length value is calculated
    // correctly
    @Test
    public void test_positiveLengthValue() {
        Square square = new Square(5.0);
        double expectedArea = 25.0;
        double actualArea = square.area();
        assertEquals(expectedArea, actualArea, 0.0001);
    }

    // Test that the area of a square with a length of zero is zero
    @Test
    public void test_zeroLength() {
        Square square = new Square(0);
        double expectedArea = 0;
        double actualArea = square.area();
        assertEquals(expectedArea, actualArea, 0);
    }

    // Test that the area of a square with the maximum possible length value is
    // calculated correctly
    @Test
    public void test_maximumLengthValue() {
        // Arrange
        double length = Double.MAX_VALUE;
        Square square = new Square(length);

        // Act
        double area = square.area();

        // Assert
        assertEquals(Double.POSITIVE_INFINITY, area, 0);
    }

    // Test that the area() method returns NaN when the length value is NaN
    @Test
    public void test_nanLengthValue() {
        Square square = new Square(Double.NaN);
        double result = square.area();
        assertTrue(Double.isNaN(result));
    }

    // Test that the area of a square with a positive infinity length value is
    // correctly calculated
    @Test
    public void test_positiveInfinityLength() {
        Square square = new Square(Double.POSITIVE_INFINITY);
        double expectedArea = Double.POSITIVE_INFINITY;
        double actualArea = square.area();
        assertEquals(expectedArea, actualArea, 0.0);
    }

    // Test that the area() method returns NaN when the length is negative infinity
    @Test
    public void test_negativeInfinityLength() {
        Square square = new Square(Double.NEGATIVE_INFINITY);
        double result = square.area();
        assertTrue(Double.isNaN(result));
    }

    // Test that the area() method returns 0 when the length value is negative
    @Test
    public void test_negativeLengthValue() {
        Square square = new Square(-5.0);
        double result = square.area();
        assertEquals(0, result, 0);
    }

    // Test that the area calculation is correct when the length of the square is
    // changed after instantiation
    @Test
    public void test_areaCalculationWithChangedLength() {
        Square square = new Square(5);
        double expectedArea = 25;
        double actualArea = square.area();
        assertEquals(expectedArea, actualArea, 0.0001);

        square.setLength(10);
        expectedArea = 100;
        actualArea = square.area();
        assertEquals(expectedArea, actualArea, 0.0001);
    }

    // Test that two squares with the same length have the same area
    @Test
    public void test_sameAreaForSameLength() {
        Square square1 = new Square(5);
        Square square2 = new Square(5);

        double area1 = square1.area();
        double area2 = square2.area();

        assertEquals(area1, area2, 0.0001);
    }

    // Test that the toString() method of the Square class returns the expected
    // string representation
    @Test
    public void test_toStringMethodReturnsExpectedStringRepresentation() {
        Square square = new Square(5);
        String expected = "Square(length=5.0)";
        String actual = square.toString();
        assertEquals(expected, actual);
    }

    // Test that the equals() method returns true when comparing two squares with
    // the same length
    @Test
    public void test_equalsMethodReturnsTrueForSquaresWithSameLength() {
        Square square1 = new Square(5);
        Square square2 = new Square(5);
        assertTrue(square1.equals(square2));
    }

    // Test that the equals() method returns false when comparing a square to a
    // non-square object
    @Test
    public void test_equalsMethodWithNonSquareObject() {
        Square square = new Square(5);
        Object obj = new Object();
        boolean result = square.equals(obj);
        assertFalse(result);
    }

}