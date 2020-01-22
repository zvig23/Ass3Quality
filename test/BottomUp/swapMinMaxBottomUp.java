import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class swapMinMaxBottomUp {
    public static class swapMinMaxDriver  {

        public static int[] swapMinMax(int[] arr) {
            Program p = new Program();
            return Program.swapMinMax(arr);
        }
    }

    @Test
    public void swapMinMax() {

        int[] arr10 = new int[10];

        Random j = new Random();
        for( int i = 9 ; i >0 ;i--)
            arr10[i]=j.nextInt(10);

        arr10[2]=100;
        arr10[1]=-1;
        try {
        int[] ans = swapMinMaxDriver.swapMinMax(arr10);

            assertTrue(ans[1]==100 && ans[2]==1);
        }
        catch (Exception e){assertTrue(1==0);}
    }
}