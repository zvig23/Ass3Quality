import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Random;

import static org.junit.Assert.*;

public class printSortedBottomUp {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    public static class printSortedDriver  {

        public static void printSorted(int[] arr) {
            Program p = new Program();
            Program.printSorted(arr);
        }
    }
    @After
    public void tearDown() throws Exception {
        System.setOut(originalOut);
        System.setErr(originalErr);
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

    @Test
    public void printSorted() {

        int[] arr10 = new int[99];

        Random rnd = new Random();
        for( int i = 9 ; i >0 ;i--)
            arr10[i]=rnd.nextInt(10);

        arr10[2]=100;
        arr10[1]=-1;

        String output = outContent.toString();
        String [] tempValues = output.split(" ");
        String [] values = new String[tempValues.length+2];
        int third = values.length /3;
        int j=0;

        for(int i=0;i<values.length;i++)
        {
            try {
                if (j == third - 1 || j == 2 * (third - 1)) {
                    values[i] = "\r\n";
                    values[i + 1] = tempValues[j].substring(values[i].length());
                    i++;
                } else {
                    values[i] = tempValues[j];

                }
                j++;
            }
            catch (Exception e){continue;}
        }

        String [] valuesNotSorted1 = new String[values.length/3];
        String [] valuesSorted = new String[values.length/3];
        String [] valuesNotSorted2 = new String[values.length/3];

        for(int i=0;i<valuesNotSorted1.length;i++)
        {
            valuesNotSorted1[i] = values[i];
            valuesSorted[i] = values[(values.length/3)+i];
            valuesNotSorted2[i] = values[(2*(values.length/3))+i];
        }

        assertTrue(bagOfStringWords(arr10,valuesNotSorted1));
        assertTrue(bagOfStringWords(arr10,valuesSorted));
        assertTrue(bagOfStringWords(arr10,valuesNotSorted2));

        int num1,num2;
        for(int i=0;i<valuesSorted.length - 2;i++)//Without '\r\n'
        {
            num1 = Integer.parseInt(valuesSorted[i]);
            num2 = Integer.parseInt(valuesSorted[i+1]);
            assertTrue(num2>=num1);
        }


    }

}