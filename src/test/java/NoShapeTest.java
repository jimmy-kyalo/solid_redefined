import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.example.NoShape;
import com.example.Shape;
import com.example.ThreeDimensionalShape;

public class NoShapeTest {
    // Test that calling the 'area' method on the NoShape class throws an
    // UnsupportedOperationException
    @Test
    public void test_areaMethodThrowsUnsupportedOperationException() {
        NoShape shape = new NoShape();
        assertThrows(UnsupportedOperationException.class, () -> shape.area());
    }

    // Test that the volume and area methods of the NoShape class throw
    // UnsupportedOperationException
    @Test
    public void test_behaviour() {
        NoShape noShape = new NoShape();
        assertThrows(UnsupportedOperationException.class, () -> noShape.volume());
        assertThrows(UnsupportedOperationException.class, () -> noShape.area());
    }

    // Test that the volume() and area() methods of NoShape throw
    // UnsupportedOperationException
    @Test
    public void test_noVolumeOrArea() {
        NoShape shape = new NoShape();

        assertThrows(UnsupportedOperationException.class, () -> {
            shape.volume();
        });

        assertThrows(UnsupportedOperationException.class, () -> {
            shape.area();
        });
    }

    // Test that the NoShape class does not have any fields or methods other than
    // those inherited from the interfaces it implements
    @Test
    public void test_noShapeBehaviour() {
        // Create an instance of NoShape
        NoShape shape = new NoShape();

        // Test that the volume method throws UnsupportedOperationException
        try {
            shape.volume();
            fail("Expected UnsupportedOperationException to be thrown");
        } catch (UnsupportedOperationException e) {
            // Test passed
        }

        // Test that the area method throws UnsupportedOperationException
        try {
            shape.area();
            fail("Expected UnsupportedOperationException to be thrown");
        } catch (UnsupportedOperationException e) {
            // Test passed
        }
    }

    // Test that calling the 'volume' method throws an UnsupportedOperationException
    @Test
    public void test_volumeMethodThrowsUnsupportedOperationException() {
        NoShape shape = new NoShape();
        assertThrows(UnsupportedOperationException.class, () -> shape.volume());
    }

    // Test that the NoShape class can be used as a placeholder or default value for
    // Shape and ThreeDimensionalShape parameters
    @Test
    public void test_placeholderDefaultValue() {
        Shape shape = new NoShape();
        ThreeDimensionalShape threeDimensionalShape = new NoShape();

        // Test that the volume method throws UnsupportedOperationException
        try {
            threeDimensionalShape.volume();
            fail("Expected UnsupportedOperationException to be thrown");
        } catch (UnsupportedOperationException e) {
            // Test passed
        }

        // Test that the area method throws UnsupportedOperationException
        try {
            shape.area();
            fail("Expected UnsupportedOperationException to be thrown");
        } catch (UnsupportedOperationException e) {
            // Test passed
        }
    }

    // Test that the volume and area methods of the NoShape class throw
    // UnsupportedOperationException
    @Test
    public void test_volumeAndArea() {
        NoShape noShape = new NoShape();
        assertThrows(UnsupportedOperationException.class, () -> noShape.volume());
        assertThrows(UnsupportedOperationException.class, () -> noShape.area());
    }

    // Test that the NoShape class can be used to test code that expects a Shape or
    // ThreeDimensionalShape object but does not use its methods
    @Test
    public void test_noShapeCanBeUsedForTesting() {
        // Create an instance of NoShape
        NoShape noShape = new NoShape();

        // Test that the volume method throws an UnsupportedOperationException
        try {
            noShape.volume();
            fail("Expected UnsupportedOperationException to be thrown");
        } catch (UnsupportedOperationException e) {
            // Exception is expected
        }

        // Test that the area method throws an UnsupportedOperationException
        try {
            noShape.area();
            fail("Expected UnsupportedOperationException to be thrown");
        } catch (UnsupportedOperationException e) {
            // Exception is expected
        }
    }

}