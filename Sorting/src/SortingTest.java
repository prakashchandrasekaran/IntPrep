import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by prchand on 7/20/2017.
 */
public class SortingTest {
    @Test
    public void insertionSort_WithRandomArray() throws Exception
    {
        int[] input = GetRandomArray();
        Sorting.InsertionSort(input, input.length);
        Assert.assertTrue(Utils.issorted(input));
    }

    @Test
    public void bubbleSort_WithRandomArray() throws Exception
    {
        int[] input = GetRandomArray();
        Sorting.BubbleSort(input);
        Assert.assertTrue(Utils.issorted(input));
    }

    @Test
    public void selectionSort_WithRandomArray() throws Exception
    {
        int[] input = GetRandomArray();
        Sorting.SelectionSort(input);
        Assert.assertTrue(Utils.issorted(input));
    }

    @Test
    public void quickSort_WithRandomArrayAndEndPivot() throws Exception
    {
        int[] input = GetRandomArray();
        Sorting.QuickSort(input, false);
        Assert.assertTrue(Utils.issorted(input));
    }

    @Test
    public void quickSort_WithRandomArrayAndRandomPivot() throws Exception
    {
        int[] input = GetRandomArray();
        Sorting.QuickSort(input, true);
        Assert.assertTrue(Utils.issorted(input));
    }

    @Test
    public void insertionSort_WithSortedArray() throws Exception
    {
        int[] input = GetSortedArray();
        Sorting.InsertionSort(input, input.length);
        Assert.assertTrue(Utils.issorted(input));
    }

    @Test
    public void bubbleSort_WithSortedArray() throws Exception
    {
        int[] input = GetSortedArray();
        Sorting.BubbleSort(input);
        Assert.assertTrue(Utils.issorted(input));
    }

    @Test
    public void selectionSort_WithSortedArray() throws Exception
    {
        int[] input = GetSortedArray();
        Sorting.SelectionSort(input);
        Assert.assertTrue(Utils.issorted(input));
    }

    @Test
    public void quickSort_WithSortedArray_WithEndPivot() throws Exception
    {
        int[] input = GetSortedArray();
        Sorting.QuickSort(input, false);
        Assert.assertTrue(Utils.issorted(input));
    }

    @Test
    public void quickSort_WithSortedArray_WithRandomPivot() throws Exception
    {
        int[] input = GetSortedArray();
        Sorting.QuickSort(input, true);
        Assert.assertTrue(Utils.issorted(input));
    }

    public int[] GetSortedArray()
    {
        int[] array = new int[100000];
        for(int i=0;i<array.length;i++)
        {
            array[i] = i;
        }
        return array;
    }

    public int[] GetRandomArray()
    {
        int[] array = new int[100000];
        Random rand = new Random();
        for(int i=0;i<array.length;i++)
        {
            array[i] = rand.nextInt(1000);
        }
        return array;
    }

}