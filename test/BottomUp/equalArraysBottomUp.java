import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class equalArraysBottomUp {
    public static class equalArraysDriver  {

        public static boolean equalArrays(int[] arr,int[] arr1) {
            Program p = new Program();
            return Program.equalArrays(arr,arr1);
        }
    }
    @Test
    public void equalArrays() {
        int[] arr10 = new int[10];
        int[] arr11 = new int[10];
        Random j = new Random();
        for( int i = 9 ; i >0 ;i--)
            arr10[i]=j.nextInt(10);
        for( int i = 9 ; i >0 ;i--)
            arr11[i]=j.nextInt(10);
        arr11[2]=100;
        boolean x= equalArraysDriver.equalArrays(arr10,arr11);
        assertTrue(equalArraysDriver.equalArrays(arr10, Arrays.copyOf(arr10,arr10.length)));
        assertFalse(x);
    }
}