
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import com.example.Rectangle;

public class RectangleTest {
    // Test that a Rectangle object can be created with valid length and width
    // values
    @Test
    public void test_createRectangleWithValidValues() {
        double length = 5.0;
        double width = 3.0;
        Rectangle rectangle = new Rectangle(length, width);

        assertEquals(length, rectangle.getLength(), 0.0);
        assertEquals(width, rectangle.getWidth(), 0.0);
    }

    // Test that the area() method returns the correct area for a rectangle
    @Test
    public void test_areaCalculation() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        double expectedArea = 15.0;
        double actualArea = rectangle.area();
        assertEquals(expectedArea, actualArea, 0.0001);
    }

    // Test that a Rectangle object cannot be created with negative length and/or
    // width values
    @Test
    public void test_negativeDimensions() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1, 2));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(3, -4));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-5, -6));
    }

    // Test that a Rectangle object with length and/or width values that exceed the
    // maximum double value can be created
    @Test
    public void test_exceedMaxDoubleValue() {
        double length = Double.MAX_VALUE + 1;
        double width = Double.MAX_VALUE + 1;

        Rectangle rectangle = new Rectangle(length, width);

        assertEquals(length, rectangle.getLength(), 0);
        assertEquals(width, rectangle.getWidth(), 0);
    }

    // Test that two Rectangle objects with the same length and width values are
    // equal
    @Test
    public void test_sameLengthAndWidthValuesAreEqual() {
        Rectangle rectangle1 = new Rectangle(5.0, 10.0);
        Rectangle rectangle2 = new Rectangle(5.0, 10.0);

        assertEquals(rectangle1, rectangle2);
    }

    // Test that two Rectangle objects with different length and/or width values are
    // not equal
    @Test
    public void test_differentLengthAndWidthValues() {
        Rectangle rectangle1 = new Rectangle(5, 10);
        Rectangle rectangle2 = new Rectangle(7, 12);

        assertNotEquals(rectangle1, rectangle2);
    }

    // Test that a Rectangle object with length and/or width equal to zero is
    // created correctly
    @Test
    public void test_zeroLengthOrWidth() {
        Rectangle rectangle = new Rectangle(0, 0);
        assertEquals(0, rectangle.getLength(), 0);
        assertEquals(0, rectangle.getWidth(), 0);
    }

    // Test that the toString() method returns a string representation of the
    // Rectangle object
    @Test
    public void test_toStringMethod() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        String expected = "Rectangle(length=5.0, width=3.0)";
        String actual = rectangle.toString();
        assertEquals(expected, actual);
    }

}