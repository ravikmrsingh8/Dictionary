package dsalgo.dictinary;


import java.util.Scanner;

public class App {
    static Dictionary dictionary = Dictionary.getInstance();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println((dictionary.isWord(scanner.next())));
        }
    }
}
