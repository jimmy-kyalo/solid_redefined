import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import com.example.Circle;

public class CircleTest {
    // Test that creating a Circle object with a positive radius returns the correct
    // area
    @Test
    public void test_positiveRadiusReturnsCorrectArea() {
        Circle circle = new Circle(5.0);
        double expectedArea = Math.PI * (Math.pow(5.0, 2));
        double actualArea = circle.area();
        assertEquals(expectedArea, actualArea, 0.0001);
    }

    // Test that creating a Circle object with the maximum double value as radius
    // returns the correct area
    @Test
    public void test_maximumDoubleRadiusReturnsCorrectArea() {
        Circle circle = new Circle(Double.MAX_VALUE);
        double expectedArea = Math.PI * (Math.pow(Double.MAX_VALUE, 2));
        double actualArea = circle.area();
        assertEquals(expectedArea, actualArea, 0.0001);
    }

    // Test that creating a Circle object with a non-positive radius returns zero
    // area
    @Test
    public void test_nonPositiveRadiusReturnsZeroArea() {
        Circle circle = new Circle(0.0);
        double expectedArea = 0.0;
        double actualArea = circle.area();
        assertEquals(expectedArea, actualArea, 0.0001);
    }

    // Test that creating a Circle object with the minimum double value as radius
    // returns the correct area
    @Test
    public void test_minimumDoubleValueRadiusReturnsCorrectArea() {
        Circle circle = new Circle(Double.MIN_VALUE);
        double expectedArea = Math.PI * (Math.pow(Double.MIN_VALUE, 2));
        double actualArea = circle.area();
        assertEquals(expectedArea, actualArea, 0.0001);
    }

    // Test that creating a Circle object with a null radius throws a
    // NullPointerException
    @Test
    public void test_nullRadiusThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Circle((Double) null));
    }

    // Test that two Circle objects with the same radius have the same hash code
    @Test
    public void test_sameRadiusSameHashCode() {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(5.0);
        assertEquals(circle1.hashCode(), circle2.hashCode());
    }

    // Test that two Circle objects with the same radius are considered equal
    @Test
    public void test_sameRadiusObjectsAreEqual() {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(5.0);
        assertEquals(circle1, circle2);
    }

    // Test that two Circle objects with different radii are not equal
    @Test
    public void test_differentRadiiNotEqual() {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(10.0);
        assertNotEquals(circle1, circle2);
    }

}