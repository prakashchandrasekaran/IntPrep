/**
 * Created by prchand on 7/14/2017.
 */
public class Sorting
{
    public static void main(String[] args)
    {
        System.out.println("Insertion sort");
        int[] array = new int[] {10,14,7,4,19,16,12,19,100,20,3};
        //InsertionSort(array, array.length);
        SelectionSort(array);
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

}