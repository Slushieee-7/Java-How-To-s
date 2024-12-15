import java.util.Scanner;
import java.io.*;

public class Wordle {
    static int shotCount = 1;
  static final String[] ordinalIndicators = {"st", "nd", "rd", "th", "th"};

  static final String targetWord = chooseRandomWord(getWords());

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String guessWord;

    while (true) {
      System.out.print("Enter your guess word: ");
      guessWord = scanner.nextLine().toUpperCase();

      if (guessWord.length() != 5) {
        System.out.printf("Try %d (%s): The length of word must be five!\n", shotCount, guessWord);
      } else if (!isWordInDictionary(guessWord)) {
        System.out.printf("Try %d (%s): Word does not exist in the dictionary!\n",
          shotCount, guessWord);
      } else if (guessWord.equals(targetWord)) {
        System.out.printf("Congratulations! You guessed right in %d%s shot!\n",
          shotCount, ordinalIndicators[shotCount - 1]);
        scanner.close();
        return;
      } else {
        checkWord(guessWord);
      }

      if (isGameEnded()) {
        System.out.println("You exceeded the maximum number of tries!");
        System.out.println("You failed! The key word is " + targetWord + ".");
        scanner.close();
        return;
      }
    }
  }

  static boolean isGameEnded() {
    return shotCount > 6;
  }

  static void checkWord(String word) {
    System.out.printf("Try%d (%s):\n", shotCount, word);
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      if (isCharacterInWord(c)) {
        if (targetWord.charAt(i) == c) {
          System.out.printf("%d. letter exists and located in right position.\n", i + 1);
        } else {
          System.out.printf("%d. letter exists but located in wrong position.\n", i + 1);
        }
      } else {
        System.out.printf("%d. letter does not exist.\n", i + 1);
      }
    }
    shotCount++;
    System.out.println();
  }

  static String chooseRandomWord(String[] words) {
    return words[(int) (Math.random() * words.length)];
  }

  static boolean isWordInDictionary(String word) {
    for (String w : getWords()) {
      if (w.equals(word)) {
        return true;
      }
    }
    return false;
  }

  static boolean isCharacterInWord(char c) {
    for (int i = 0; i < targetWord.length(); i++) {
      if (targetWord.charAt(i) == c) {
        return true;
      }
    }
    return false;
  }

  static String[] getWords() {
    try (BufferedReader bufferedReader = new BufferedReader(
      new FileReader("src/main/resources/dict.txt"))) {
      return bufferedReader.lines().toArray(String[]::new);
    } catch (FileNotFoundException e) {
      System.err.println("Dictionary file not found!");
      e.printStackTrace();
    } catch (IOException e) {
      System.err.println("Failed to read the dictionary file!");
      e.printStackTrace();
    }
    return new String[0];
  }
}
