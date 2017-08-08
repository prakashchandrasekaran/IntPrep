import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by prchand on 8/7/2017.
 */
public class ArrayWithMultiplicationTest {
    @Test
    public void getResult() throws Exception
    {
        int[] array = new int[] {1,2,3,4,5};
        ArrayWithMultiplication x = new ArrayWithMultiplication();
        int[] result = x.GetResult(array);
        Assert.assertArrayEquals(result, new int[] {120, 60, 40, 30, 24});
    }

    @Test
    public void getResultWithEmpty() throws Exception
    {
        int[] array = new int[] {};
        ArrayWithMultiplication x = new ArrayWithMultiplication();
        int[] result = x.GetResult(array);
        Assert.assertArrayEquals(result, new int[] {});
    }

    @Test
    public void getResultWithOneZero() throws Exception
    {
        int[] array = new int[] {1,2,3,0};
        ArrayWithMultiplication x = new ArrayWithMultiplication();
        int[] result = x.GetResult(array);
        Assert.assertArrayEquals(result, new int[] {0,0,0,6});
    }

    @Test
    public void getResultWithTwoZero() throws Exception
    {
        int[] array = new int[] {1,0,3,0,12};
        ArrayWithMultiplication x = new ArrayWithMultiplication();
        int[] result = x.GetResult(array);
        Assert.assertArrayEquals(result, new int[] {0,0,0,0,0});
    }
}