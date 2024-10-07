import java.util.Scanner;

public class CountVowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vowel, consonant;

        vowel = 0;
        consonant = 0;

        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U')
                vowel++;
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                consonant++;

        }
        System.out.println("Total Vowel: " + vowel);
        System.out.println("Total Consonant: " + consonant);

        scanner.close();
    }
}
