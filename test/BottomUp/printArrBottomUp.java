import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Random;

import static org.junit.Assert.*;

public class printArrBottomUp {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    private boolean bagOfStringWords(int [] arr1,String [] arr2)
    {
        if(arr1 == null && arr2 == null)
            return true;
        if(arr1 == null || arr2 == null)
            return false;
        if(arr1.length + 1!=arr2.length)
            return false;
        String base = "\r\n";
        HashMap<String,Integer> numbers = new HashMap<>();
        numbers.put(base,1);
        int count;
        String numString;
        for(Integer num : arr1)
        {
            numString = ""+num;
            if(!numbers.containsKey(numString))
            {
                numbers.put(numString,0);
            }
            count = numbers.get(numString);
            count++;
            numbers.put(numString,count);
        }


        for(String value : arr2)
        {
            if(!numbers.containsKey(value))
                return false;
            count = numbers.get(value);
            count -- ;
            numbers.put(value,count);

        }

        for(Integer occ : numbers.values())
        {
            if(occ.intValue()!=0)
                return false;
        }
        return true;
    }


    @After
    public void tearDown() throws Exception {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void printArr() {
        int[] arr10 = new int[99];

        Random rnd = new Random();
        for( int i = 9 ; i >0 ;i--)
            arr10[i]=rnd.nextInt(10);

        Program.printArr(arr10);
        String output = outContent.toString();
        String [] values = output.split(" ");
        assertTrue(bagOfStringWords(arr10,values));
    }
}