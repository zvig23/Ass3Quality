import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class maxValueIndexBottomUp {
    public static class maxValueIndexDriver {
        public static int maxValueIndex(int[] arr) {
            Program p = new Program();
            return Program.maxValueIndex(arr);
        }
    }
    @Test
    public void maxValueIndexTest() {
        int[] arr10 = new int[10];
        Random j = new Random();
        for( int i = 9 ; i >0 ;i--)
            arr10[i]=j.nextInt(10);
        arr10[5]=100;
        int x=maxValueIndexDriver.maxValueIndex(arr10);
        assertTrue(5==x );
    }
}