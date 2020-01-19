import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeTopDown {

    @Before
    public void init(){

    }

    // A copy of merge from Program, where every call to another function was replaced by stubs,
    // namely: sortArray got replaced by sortArrayStub
    // Merges two arrays "ar1" and "ar2" into one sorted array and returns it
    public static int[] MergeTest(int[] ar1, int[] ar2) {
        if (ar1==null && ar2==null) return null;
        if (ar1==null) return Stubs.sortArrayStub(ar2);
        if (ar2==null) return Stubs.sortArrayStub(ar1);
        int[] res = new int[ar1.length+ar2.length];
        int i = 0;
        for(int j=0; j<ar1.length; j++)
            res[i++] = ar1[j];
        for(int j=0; j<ar2.length; j++)
            res[i++] = ar2[j];
        return Stubs.sortArrayStub(res);
    }

    @Test
    public void MergeTopDownTest(){
        int[] first = {2,1,10,4};
        int[] second = {3,7,6,5};
        int[] merged = MergeTest(first,second);
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,10},merged);
    }

    @After
    public void finish(){

    }
}
