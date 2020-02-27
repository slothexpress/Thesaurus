import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // APPLICATION USING THESAURUS WITH ARRAYLIST
        ThesaurusArrayList thesaurus = new ThesaurusArrayList();
        Scanner scan = new Scanner(System.in);

        // Initializing application with synonyms
        thesaurus.addSynonyms(new ArrayList<>(
                Arrays.asList("happy", "content", "joyous", "upbeat")
        ));
        thesaurus.addSynonyms(new ArrayList<>(
                Arrays.asList("supportive", "helpful")
        ));
        thesaurus.addSynonyms(new ArrayList<>(
                Arrays.asList("important", "essential", "central")
        ));

        while (true) {
            System.out.println("\n\n--- THE LESS IS MORE THESAURUS ---");
            System.out.println("1. Search for synonyms \n2. See all words");
            System.out.print("What would you like to do? Enter 1 or 2: ");
            int userChoice = scan.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Enter word: ");
                    String wordEnteredByUser = scan.next();
                    ArrayList<String> synonymsFound = thesaurus.getSynonyms(wordEnteredByUser);
                    if(synonymsFound!=null) {
                        System.out.println("Synonyms found! :) ");
                        System.out.println(synonymsFound);
                    } else {
                        System.out.println("No synonyms found :( ");
                    }
                    break;
                case 2:
                    System.out.println("All words in this amazing thesaurus: ");
                    System.out.println(thesaurus.getAllWords());
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
