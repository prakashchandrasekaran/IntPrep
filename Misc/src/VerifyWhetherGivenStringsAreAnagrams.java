/**
 * Created by prchand on 8/7/2017.
 */
public class VerifyWhetherGivenStringsAreAnagrams
{
    public static boolean check(String str1, String str2)
    {
        if(str1 == null && str2 == null)
        {
            return true;
        }

        if(str1 == null || str2 == null)
        {
            return false;
        }

        if(str1.length() != str2.length())
        {
            return false;
        }

        // Assuming that the strings are lowercase and have only alphabets
        int[] counter = new int[26];
        for(int i=0;i<str1.length();i++)
        {
            int index = str1.charAt(i) - 'a';
            counter[index] += 1;
        }

        for(int i=0;i<str2.length();i++)
        {
            int index = str2.charAt(i) - 'a';
            if(counter[index] == 0)
            {
                return false;
            }
            counter[index] -= 1;
        }

        return true;
    }

}
