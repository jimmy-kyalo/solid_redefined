
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.example.Cuboid;

public class CuboidTest {
    // Test that the volume() method returns 0 when the length, width, and height
    // values are set to 0.
    @Test
    public void test_zeroVolume() {
        Cuboid cuboid = new Cuboid(0, 0, 0);
        double expectedVolume = 0;
        double actualVolume = cuboid.volume();
        assertEquals(expectedVolume, actualVolume, 0.0001);
    }

    // Test that the volume() method of the Cuboid class returns the correct volume.
    @Test
    public void test_calculateVolume() {
        // Arrange
        double length = 5.0;
        double width = 3.0;
        double height = 2.0;
        double expectedVolume = 30.0;

        // Act
        Cuboid cuboid = new Cuboid(length, width, height);
        double actualVolume = cuboid.volume();

        // Assert
        assertEquals(expectedVolume, actualVolume, 0.0001);
    }

    // Test that creating a Cuboid object with a negative width value throws an
    // IllegalArgumentException.
    @Test
    public void test_negativeWidthValue() {
        try {
            Cuboid cuboid = new Cuboid(10, -5, 8);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            // Exception was thrown as expected
        }
    }

    // Test that creating a Cuboid object with a negative length value throws an
    // IllegalArgumentException.
    @Test
    public void test_negativeLengthValue() {
        assertThrows(IllegalArgumentException.class, () -> new Cuboid(-1, 2, 3));
    }

    // Test that two Cuboid objects with different length, width, and height values
    // are not equal.
    @Test
    public void test_cuboidObjectsNotEqual() {
        Cuboid cuboid1 = new Cuboid(2.0, 3.0, 4.0);
        Cuboid cuboid2 = new Cuboid(5.0, 6.0, 7.0);

        assertNotEquals(cuboid1, cuboid2);
    }

    // Test that creating a Cuboid object with length, width, and height set to
    // negative infinity throws an IllegalArgumentException.
    @Test
    public void test_negativeInfinityValues() {
        assertThrows(IllegalArgumentException.class,
                () -> new Cuboid(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY));
    }

}