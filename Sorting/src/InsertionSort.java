/**
 * Created by prchand on 7/14/2017.
 */
public class InsertionSort
{
    public static void main(String[] args)
    {
        System.out.println("Insertion sort");
        int[] array = new int[] {10,14,7,4,19,16};
        InsertionSort(array, array.length);
        Utils.print(array);
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

}