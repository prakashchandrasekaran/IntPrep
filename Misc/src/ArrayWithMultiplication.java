/**
 * Created by prchand on 8/7/2017.
 */

/*
 Question

 Given an array of numbers, nums, return an array of numbers products, where products[i] is the product of all nums[j], j != i.

Input : [1, 2, 3, 4, 5]
Output: [(2*3*4*5), (1*3*4*5), (1*2*4*5), (1*2*3*5), (1*2*3*4)]
      = [120, 60, 40, 30, 24]

You must do this in O(N) without using division

 */
public class ArrayWithMultiplication
{
    public static void Main(String args[])
    {

    }

    public int[] GetResult(int[] array)
    {
        if(array == null)
        {
            return array;
        }

        if(array.length <= 1)
        {
            return array;
        }

        int[] result = new int[array.length];

        int start = 1;
        for(int i=0;i<array.length;i++)
        {
            result[i] = start;
            start = start * array[i];
        }

        start = 1;
        for(int i=array.length-1;i>=0;i--)
        {
            result[i] *= start;
            start = start * array[i];
        }

        return result;
    }
}
