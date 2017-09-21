package dsalgo.dictinary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DictionaryLoader {
    public static void loadDictionary(Dictionary dictionary, InputStream in) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String word = null;
        while((word = reader.readLine()) != null) {
            dictionary.addWord(word);
        }
    }
}
