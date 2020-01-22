import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertFalse;

public class minValueBottomUp {
        public static int minValueDriver(int[] arr) {
            int ind = Program.minValue(arr);
            return ind;
        }



    @Test
    public void maxValueTest() {
        int[] arr10 = new int[10];
        Random j = new Random();
        for( int i = 9 ; i >0 ;i--)
            arr10[i]=j.nextInt(10);
        arr10[5]=-100;
        try {
            assertFalse(minValueDriver(arr10) == - 100);
        }
        catch (Exception e) {
            assertFalse(1 == 1);
        }
    }


}