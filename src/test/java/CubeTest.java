
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.Cube;

public class CubeTest {
    // Test that the volume() method of the Cube class returns a positive result
    // when called with a positive length.
    @Test
    public void test_volumeWithPositiveLength() {
        // Arrange
        double length = 5.0;
        Cube cube = new Cube(length);

        // Act
        double result = cube.volume();

        // Assert
        assertTrue(result > 0);
    }

    // Test that the volume() method returns 0 when the length of the Cube is 0.
    @Test
    public void test_volumeWithZeroLength() {
        Cube cube = new Cube(0);
        double result = cube.volume();
        assertEquals(0, result, 0);
    }

    // Test that the volume() method of the Cube class returns a positive result
    // when the length is set to the maximum double value.
    @Test
    public void test_volumeWithMaxDoubleLength() {
        Cube cube = new Cube(Double.MAX_VALUE);
        double result = cube.volume();
        assertTrue(result > 0);
    }

    // Test that creating a Cube object with a negative length throws an
    // IllegalArgumentException.
    @Test
    public void test_negativeLength() {
        assertThrows(IllegalArgumentException.class, () -> new Cube(-1));
    }

    // Test that creating a Cube object with NaN as length throws an
    // IllegalArgumentException.
    @Test
    public void test_createCubeWithNaNLength() {
        assertThrows(IllegalArgumentException.class, () -> new Cube(Double.NaN));
    }

    // Test that creating a Cube object with positive infinity as length throws an
    // IllegalArgumentException.
    @Test
    public void test_createCubeWithPositiveInfinityLength() {
        assertThrows(IllegalArgumentException.class, () -> new Cube(Double.POSITIVE_INFINITY));
    }

    // Test that when two Cube objects with different lengths are compared using the
    // equals() method, the result is false.
    @Test
    public void test_compareObjectsWithDifferentLengths() {
        Cube cube1 = new Cube(5.0);
        Cube cube2 = new Cube(10.0);

        boolean result = cube1.equals(cube2);

        assertFalse(result);
    }

    // Test that two Cube objects with the same length return true when compared
    // using the equals() method.
    @Test
    public void test_compareCubesWithSameLength() {
        // Create two Cube objects with the same length
        Cube cube1 = new Cube(5);
        Cube cube2 = new Cube(5);

        // Compare the two cubes using the equals() method
        boolean result = cube1.equals(cube2);

        // Assert that the result is true
        assertTrue(result);
    }

    // Test that the toString() method returns a string representation of the Cube
    // object.
    @Test
    public void test_toString() {
        Cube cube = new Cube(1);
        String expected = "Cube(length=1.0)";
        String actual = cube.toString();
        assertEquals(expected, actual);
    }

    // Test that an IllegalArgumentException is thrown when creating a Cube object
    // with negative infinity as length.
    @Test
    public void test_negativeInfinityLength() {
        boolean exceptionThrown = false;
        try {
            new Cube(Double.NEGATIVE_INFINITY);
        } catch (IllegalArgumentException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);
    }

    // Test that the hashCode() method returns a unique hash code for a Cube object
    // with a length of 2.
    @Test
    public void test_hashCode() {
        Cube cube = new Cube(2);
        int hashCode = cube.hashCode();
        assertNotNull(hashCode);
    }

    // Test that the getLength() method returns the length value of the Cube object.
    @Test
    public void test_getLength() {
        Cube cube = new Cube(3);
        double length = cube.getLength();
        assertEquals(3, length, 0.001);
    }

}