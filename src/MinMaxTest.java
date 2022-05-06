import org.junit.jupiter.api.*;

public class MinMaxTest {
    MinMax object;

    @Nested
    class Test1{
        @BeforeEach
        public void init(){
            object = new MinMax(new Double[]{1.4, 2.0, 6.3});
        }
        @org.junit.jupiter.api.Test
        public void max6d3Min1d4(){
            Assertions.assertEquals(6.3, object.getMax());
            Assertions.assertEquals(1.4, object.getMin());
        }
    }

    @Nested
    class Test2{
        @BeforeEach
        public void init(){
            object = new MinMax(new Double[]{-749.4, 0.1, -999.7});
        }
        @org.junit.jupiter.api.Test
        public void max0d1MinNegative999d7(){
            Assertions.assertEquals(0.1, object.getMax());
            Assertions.assertEquals(-999.7, object.getMin());
        }
    }

    @AfterEach
    public void cleanUp(){
        object = null;
    }
}
