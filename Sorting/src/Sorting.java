import java.util.Random;

/**
 * Created by prchand on 7/14/2017.
 */
public class Sorting
{
    public static Random random = new Random();

    public static void main(String[] args)
    {
        System.out.println("Sorting");
        int[] array = new int[] {10,14,7,4,19,16,12,19,100,20,3};
        //InsertionSort(array, array.length);
        QuickSort(array, false);
        Utils.print(array);
        System.out.println(Utils.issorted(array));
    }

    public static void InsertionSort(int[] array, int n)
    {
        if (n <= 1) {
            return;
        }

        if (array == null) {
            return;
        }

        if (n > array.length) {
            n = array.length;
        }

        for (int i = 1; i < n; i++) {
            int current = array[i];
            int j = i - 1;
            while ((j >= 0) && (array[j] > current)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    public static void BubbleSort(int[] array)
    {
        if(array == null) {
            return;
        }

        if(array.length<=1) {
            return;
        }

        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i] > array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int[] array)
    {
        if(array == null) {
            return;
        }

        if(array.length<=1) {
            return;
        }

        int min;
        int min_pos;
        for(int i=0;i<array.length;i++)
        {
            min = array[i];
            min_pos = i;
            for(int j=i+1;j<array.length;j++)
            {
                if(array[j] < min)
                {
                    min = array[j];
                    min_pos = j;
                }
            }

            if(min_pos  != i)
            {
                int temp = array[i];
                array[i] = array[min_pos];
                array[min_pos] = temp;
            }

            //Utils.print(array);
        }
    }

    public static void QuickSort(int[] array, boolean randomPivot)
    {
        if(array == null)
        {
            return;
        }

        if(array.length <= 1)
        {
            return;
        }

        QuickSort(array, 0, array.length - 1, randomPivot);
    }

    private static void QuickSort(int[] array, int start, int end, boolean randomPivot)
    {
        if(start >= end)
        {
            return;
        }

        int pivot_position = QuickSortBalance(array, start, end, randomPivot);

        QuickSort(array, start, pivot_position - 1, randomPivot);
        QuickSort(array, pivot_position + 1, end, randomPivot);
    }

    private static int QuickSortBalance(int[] array, int start, int end, boolean randomPivot)
    {
        if(randomPivot)
        {
            int randomInt = random.nextInt(end - start);
            int pivotPosition = randomInt + start;
            int temp = array[end];
            array[end] = array[pivotPosition];
            array[pivotPosition] = temp;
        }

        int pivot = array[end];

        /////////////////////////////////////////////
        // x1 x2 x3 x4 x5 x6 x7 x8 x9 x10
        // ----------i--------j--------pivot
        // 0 to i-1 items are lesser than pivot
        // i to j-1 is not processed
        // j to end-1 is greater than pivot
        // end is pivot
        //////////////////////////////////////////////
        int i = start;
        int j = end;

        while(i < j) {
            if (array[i] > pivot) {
                int temp = array[j - 1];
                array[j - 1] = array[i];
                array[i] = temp;
                j--;
            } else {
                i++;
            }
        }

        // swapping pivot
        if(j != end) {
            array[end] = array[j];
            array[j] = pivot;
        }

        return j;
    }

}