# Dictionary
A data structure to store all words of dictionary 

<pre><code>
package dsalgo.dictionary;

import dsalgo.dictinary.Dictionary;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;


public class DictionaryTest {
    Dictionary dictionary = Dictionary.getInstance();

    @Test
    public void testDictionary() {
        String[] words = {"anaconda", "python", "plural", "sight", "code", "cancel"};
        for (String word: words) {
            Assert.assertTrue(dictionary.isWord(word));
        }

        String[] invalidWords = {"jjklj", "hkujn", "ywqjnj", "yrhkj", "xbjka", "bxjw"};
        for (String invalid : invalidWords) {
            Assert.assertFalse(dictionary.isWord(invalid));
        }
    }
}
</code></pre>
