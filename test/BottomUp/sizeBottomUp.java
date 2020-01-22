import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class sizeBottomUp {

    public static class sizeDriver {
        public static int size(int[] arr) {
            Program p = new Program();
            return Program.size(arr);
        }

    }
    @Test
    public void size() {
        int [] testArr= new int[3];
        assertTrue(testArr.length== sizeDriver.size(testArr));
    }
}