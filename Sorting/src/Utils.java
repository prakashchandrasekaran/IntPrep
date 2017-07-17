/**
 * Created by prchand on 7/16/2017.
 */
public class Utils
{
    public static void print(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static boolean issorted(int[] array)
    {
        if(array.length <= 1)
        {
            return true;
        }

        // assuming there are no duplicates
        boolean isAscending = false;
        if(array[0] <= array[1])
        {
            isAscending = true;
        }

        for(int i=2;i<array.length;i++)
        {
            if(isAscending) {
                if (array[i] < array[i - 1]) {
                    return false;
                }
            }
            else {
                if (array[i] > array[i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

}
