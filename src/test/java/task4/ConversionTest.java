package task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {

    @Test
    void shouldOkThatConversionMinToSecond() {
        double seconds = Conversion.conversionMinToSecond(10);
        Assertions.assertEquals(600,seconds);
    }

    @Test
    void shouldOkThatIsNotConversionMinToSecond(){
        double second = Conversion.conversionMinToSecond(10);
        Assertions.assertNotEquals(601,second);
    }
}