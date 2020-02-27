import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ThesaurusHashMap {

    private HashMap<String, Long> allWords = new HashMap<>();
    private Long newKeyForSynonyms = 0L;

    public ThesaurusHashMap() {
    }

    //Adds the given synonyms to the thesaurus
    void addSynonyms(ArrayList<String> pSynonyms) {
        newKeyForSynonyms++;
        for (String synonym : pSynonyms) {
            allWords.put(synonym, newKeyForSynonyms);
        }
    };

    //Gets the synonyms for a given word
    ArrayList<String> getSynonyms(String wordToSearchFor) {
        ArrayList<String> synonyms = new ArrayList<>();
        if(allWords.containsKey(wordToSearchFor)) {
            Long synonymValue = allWords.get(wordToSearchFor);
            for(Map.Entry<String, Long> potentialSynonym : allWords.entrySet()) {
                if(potentialSynonym.getValue().equals(synonymValue)) {
                    synonyms.add(potentialSynonym.getKey());
                }
            }
            return synonyms;
        }
        return null;
    };

    //Gets all words from the thesaurus
    ArrayList<String> getAllWords() {
        ArrayList<String> words = new ArrayList<>();
        for (String word : allWords.keySet()) {
            words.add(word);
        }
        return words;
    }
}
