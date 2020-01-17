import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class maxValueTest {
    @Before
    public void setUp() throws Exception {
        maxValueIndexTest x = new maxValueIndexTest();
    }

    public static class maxValuedDriver {
        public static int maxValueIndexTest(int[] arr) {
            maxValueIndexTest x = new maxValueIndexTest();
            int ind = maxValueIndexTest.maxValueIndexStub.maxValueIndexTest(arr);
            return arr[ind];
        }
    }
    public static class maxValuedStub {
        public static int maxValueIndexTest(int[] arr) {
            return 3;
        }
    }


    @Test
    public void testStub() {

    }
    @Test
    public void testDriver() {
    }
}