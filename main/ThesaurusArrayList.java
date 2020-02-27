import java.util.ArrayList;
import java.util.Arrays;

public class ThesaurusArrayList {

    private ArrayList<ArrayList<String>> allWords = new ArrayList<>();

    public ThesaurusArrayList() {
    }
        //Adds the given synonyms to the thesaurus
        void addSynonyms(ArrayList<String> pSynonyms) {
            allWords.add(pSynonyms);
        };
        //Gets the synonyms for a given word
        ArrayList<String> getSynonyms(String word) {
            for (ArrayList<String> synonymList : allWords) {
                for(String synonym : synonymList) {
                    if(word.equals(synonym)){
                        return synonymList;
                    };
                };
            };
            return null;
    };
        //Gets all words from the thesaurus
        ArrayList<String> getAllWords() {
            ArrayList allWordsInOneList = new ArrayList();
            for (ArrayList<String> synonymList : allWords) {
                for(String word : synonymList) {
                  allWordsInOneList.add(word);
                };
            };
            return allWordsInOneList;
    };
};
