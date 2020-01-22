import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class copyArrBottomUp {

    public static class copyArrDriver  {

        public static int [] copyArr(int[] arr) {
            Program p = new Program();
            return Program.copyArr(arr);
        }
    }
    @Test
    public void copyArr() {
        int [] testArr= new int[3];
        assertTrue(Arrays.equals(testArr , copyArrDriver.copyArr(testArr)));

    }
}