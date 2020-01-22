import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertTrue;

public class sortArrayBottomUp {

    public static class sortArrayDriver  {

        public static int [] sortArray(int[] arr) {
            Program p = new Program();
            return Program.sortArray(arr);
        }
    }
    private boolean reallySorted(int [] arr, int [] source)
    {
        for (int i = 0; i< arr.length-1; i++){
            if (arr[i]>arr[i+1])
                return 1==0;
        }

        Arrays.sort(source);

        return Arrays.equals(arr,source);
    }
    @Test
    public void sortArray() {
        int[] arr10 = new int[10];
        Random j = new Random();
        for( int i = 9 ; i >0 ;i--)
            arr10[i]=j.nextInt(10);
        int[] arr10sorted = sortArrayDriver.sortArray(arr10);
        assertTrue(reallySorted(arr10sorted,arr10));

    }
}