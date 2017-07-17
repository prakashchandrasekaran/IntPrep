import org.junit.Assert;
import org.junit.Test;

/**
 * Created by prchand on 7/16/2017.
 */
public class UtilsTest
{
    @Test
    public void isSortedWithAscendingArrayTest()
    {
        int[] array = new int[] {1,2,3,4,5};
        Assert.assertTrue(Utils.issorted(array));
    }

    @Test
    public void isSortestWithDescendingArrayTest()
    {
        int[] array2 = new int[] {5,4,3,2,1};
        Assert.assertTrue(Utils.issorted(array2));
    }

    @Test
    public void isSortedWithEmptyArrayTest()
    {
        int[] array2 = new int[] {};
        Assert.assertTrue(Utils.issorted(array2));
    }

    @Test
    public void isSortedWithOneElementTest()
    {
        int[] array2 = new int[] {5};
        Assert.assertTrue(Utils.issorted(array2));
    }

}