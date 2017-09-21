package dsalgo.dictinary;


import java.util.HashMap;
import java.util.Map;

public class Node {
    private char letter;
    private Map<Character, Node> letters;
    private boolean word;

    public Node() {
        this('/', false);
    }

    public Node(char letter) {
        this(letter, false);
    }

    public Node(char letter, boolean word) {
        this(letter, new HashMap<>(), word);
    }

    public Node(char letter, Map<Character, Node> letters, boolean word) {
        setLetter(letter);
        setLetters(letters);
        setWord(word);
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public Map<Character, Node> getLetters() {
        return letters;
    }


    public boolean isWord() {
        return word;
    }


    public void setWord(boolean word) {
        this.word = word;
    }

    public void setLetters(Map<Character, Node> letters) {
        this.letters = letters;
    }
}
