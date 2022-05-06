import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;



import static org.junit.Assert.assertEquals;

public class HandWatchTest {
    HandWatch object;

    @Nested
    class Test{
        @BeforeEach
        public void init() {
            object = new HandWatch();
        }

        @org.junit.jupiter.api.Test
        public void ExpectedIncMinTo1(){
            object.operate("cb");
            assertEquals(1, object.minute);
        }
        @org.junit.jupiter.api.Test
        public void ExpectedIncHourTo1(){
            object.operate("cab");
            assertEquals(1, object.hour );
        }
        @org.junit.jupiter.api.Test
        public void ExpectedIncDayTo2(){
            object.operate("caab");
            assertEquals(2, object.day );
        }
        @org.junit.jupiter.api.Test
        public void ExpectedIncMonthTo2(){
            object.operate("caaab");
            assertEquals(2, object.month );
        }
        @org.junit.jupiter.api.Test
        public void ExpectedIncYearTo2001(){
            object.operate("caaaab");
            assertEquals(2001, object.year );
        }
        @AfterEach
        public void cleanUp(){
            object = null;
        }
    }

}
