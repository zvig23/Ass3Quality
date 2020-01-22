import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertFalse;

public class maxValueBottomUp {
    public static class maxValuedDriver {
        public static int maxValueIndexTest(int[] arr) {
            int ind = Program.maxValueIndex(arr);
            return arr[ind];
        }
    }


    @Test
    public void maxValueTest() {
        int[] arr10 = new int[10];
        Random j = new Random();
        for( int i = 9 ; i >0 ;i--)
            arr10[i]=j.nextInt(10);
        arr10[5]=100;
        try {
            assertFalse(maxValuedDriver.maxValueIndexTest(arr10) == 100);
        }
        catch (Exception e) {
            assertFalse(1 == 1);
        }
    }

}