import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import static org.junit.Assert.assertTrue;
public class mergeBottomUp {

    public static class mergeDriver  {

        public static int[] merge(int[] arr1,int[] arr2) {
            Program p = new Program();
            return Program.merge(arr1,arr2);
        }
    }
    @Test
    public void merge() {
        int[] arr10 = new int[9];
        int[] arr11 = new int[9];
        Random j = new Random();
        int[] arr = new int[18];
        int x =0;
        for( int i = 8 ; i >0 ;i--) {
            arr10[i] = j.nextInt(10);
            arr[x]=arr10[i];
            x++;
        }
        arr10[4]=-1;
        arr[4]=-1;

        for( int i = 8 ; i >0 ;i--) {
            arr11[i] = j.nextInt(10);
            arr[x]=arr11[i];
            x++;
        }
        arr11[5]=-1;
        arr[8]=-1;

        boolean is = Arrays.equals(arr,mergeDriver.merge(arr11,arr10));
        assertTrue(is);


    }
}