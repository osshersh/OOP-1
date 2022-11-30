package task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void shouldSayThatTriangleIsRectangular() {
        boolean isRectangular = Triangle.isTriangleRectangular(9,12,15);
        Assertions.assertTrue(isRectangular);
    }

    @Test
    void shouldSayThatTriangleIsNotRectangular(){
        boolean isNotRectangular = Triangle.isTriangleRectangular(9,15,12);
        Assertions.assertFalse(isNotRectangular);
    }
}