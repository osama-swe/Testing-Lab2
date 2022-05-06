import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class EvenOrOddTest {
    EvenOrOdd object;

    @BeforeEach
    public void init() {
        object = new EvenOrOdd();
    }

    @Nested
    class EvenTest{
        @Test
        public void twoExpectedEven(){
            assertEquals("Even",object.check(2));
        }
        @Test
        public void ninetyEightExpectedEven(){
            assertEquals("Even",object.check(98));
        }
        @Test
        public void zeroExpectedEven(){
            assertEquals("Even",object.check(0));
        }
        @Test
        public void negativeThirtySixExpectedEven(){
            assertEquals("Even",object.check(-36));
        }
        @Test
        public void negativeEightyEightExpectedEven(){
            assertEquals("Even",object.check(-88));
        }
    }

    @Nested
    class OddTest{
        @Test
        public void oneExpectedOdd(){
            assertEquals("Odd",object.check(1));
        }
        @Test
        public void NninetyThreeExpectedOdd(){
            assertEquals("Odd",object.check(93));
        }
        @Test
        public void negativeNninetySevenExpectedOdd(){
            assertEquals("Odd",object.check(-97));
        }
        @Test
        public void negativeFiveExpectedOdd(){
            assertEquals("Odd",object.check(-5));
        }
    }

    @AfterEach
    public void cleanUp(){
        object = null;
    }
}
