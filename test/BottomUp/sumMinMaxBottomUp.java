import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class sumMinMaxBottomUp {
    public static class sumMinMaxDriver  {

        public static int sumMinMax(int[] arr) {
            Program p = new Program();
            return Program.sumMinMax(arr);
        }
    }

    @Test
    public void sumMinMax() {

        int[] arr10 = new int[10];

        Random j = new Random();
        for( int i = 9 ; i >0 ;i--)
            arr10[i]=j.nextInt(10);

        arr10[2]=100;
        arr10[1]=-1;
        try {
            assertTrue(sumMinMaxDriver.sumMinMax(arr10) == 99);
        }
        catch (Exception e){assertTrue(1==0);}
    }

}