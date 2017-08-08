import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by prchand on 8/7/2017.
 */
public class VerifyWhetherGivenStringsAreAnagramsTest {
    @Test
    public void check() throws Exception {
        Assert.assertTrue(VerifyWhetherGivenStringsAreAnagrams.check(null, null));
        Assert.assertFalse(VerifyWhetherGivenStringsAreAnagrams.check(null, "sample"));
        Assert.assertFalse(VerifyWhetherGivenStringsAreAnagrams.check("something", null));
        Assert.assertFalse(VerifyWhetherGivenStringsAreAnagrams.check("sample", "something"));
        Assert.assertFalse(VerifyWhetherGivenStringsAreAnagrams.check("check", "chuck"));
        Assert.assertTrue(VerifyWhetherGivenStringsAreAnagrams.check("ice", "cie"));
        Assert.assertTrue(VerifyWhetherGivenStringsAreAnagrams.check("micro", "cromi"));
        Assert.assertTrue(VerifyWhetherGivenStringsAreAnagrams.check("baaaaad", "daabaaa"));
    }

}