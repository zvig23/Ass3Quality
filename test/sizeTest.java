import org.junit.Test;

import static org.junit.Assert.*;

public class sizeTest {

    public static class sizeStub {
        public static int size(int[] arr) {
            return 3;
        }

    }
    @Test
    public void size() {
        int [] testArr= new int[3];
        assertTrue(testArr.length==sizeStub.size(testArr));
    }
}