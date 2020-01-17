import org.junit.Test;

import static org.junit.Assert.*;

public class maxValueIndexTest {
    public static class maxValueIndexStub {
        public static int maxValueIndexTest(int[] arr) {
            return 2;
        }
    }
    @Test
    public void maxValue() {
        int [] testArr= new int[3];
        assertTrue(2==maxValueIndexStub.maxValueIndexTest(testArr));
    }
}