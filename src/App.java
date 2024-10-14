import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite uma string: ");
        String input = scanner.nextLine();

        int count = countLetterA(input);

        if (count > 0) {
            System.out.println("A letra 'a/A' aparece " + count + " vezes.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
    }

    public static int countLetterA(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}
