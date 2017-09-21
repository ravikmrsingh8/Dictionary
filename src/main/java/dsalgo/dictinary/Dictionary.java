package dsalgo.dictinary;


import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class Dictionary {
    private Node root = new Node();
    private static Dictionary dictionary = null;

    private Dictionary() {
    }

    public Node getRoot() {
        return root;
    }

    public static Dictionary getInstance() {
        return dictionary;
    }

    public void addWord(String word) {
        Node currNode = getRoot();
        for (char letter : word.toCharArray()) {
            Map<Character, Node> nextLetters = currNode.getLetters();
            if (!nextLetters.containsKey(letter)) {
                Node node = new Node(letter);
                nextLetters.put(letter, node);
            }
            currNode = currNode.getLetters().get(letter);
        }
        currNode.setWord(true);
    }

    public boolean isWord(String word) {
        Node currNode = getRoot();
        for (char letter : word.toCharArray()) {
            Map<Character, Node> letters = currNode.getLetters();
            if (!letters.containsKey(letter)) {
                return false;
            }
            currNode = currNode.getLetters().get(letter);
        }
        return currNode.isWord();
    }

    static {
        dictionary = new Dictionary();
        InputStream in = Dictionary.class.getResourceAsStream("/words.txt");
        try {
            DictionaryLoader.loadDictionary(dictionary, in);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
