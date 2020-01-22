import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class minValueIndexBottomUp {

    public static class minValueIndexStub {
        public static int minValueIndex(int[] arr) {
            return 0;
        }
    }

    @Test
    public void minValueIndex() {
        int [] testArr= new int[3];
        assertTrue(0== minValueIndexStub.minValueIndex(testArr));
    }
}