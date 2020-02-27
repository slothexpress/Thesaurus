import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class UnitTests {

    @Test
    public void testGetSynonymsThesaurusArrayList() {
        ThesaurusArrayList sut = new ThesaurusArrayList();
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("happy", "content"));

        sut.addSynonyms(expected);
        ArrayList result = sut.getSynonyms("happy");
        Assert.assertEquals(expected, result);
        Assert.assertEquals(2, result.size());
    }
    @Test
    public void testGetAllWordsThesaurusArrayList() {
        ThesaurusArrayList sut = new ThesaurusArrayList();

        ArrayList<String> syn1 = new ArrayList<>(Arrays.asList("happy", "content"));
        ArrayList<String> syn2 = new ArrayList<>(Arrays.asList("important", "essential", "central"));
        sut.addSynonyms(syn1);
        sut.addSynonyms(syn2);

        ArrayList<String> expected = new ArrayList<>(Arrays.asList("happy", "content", "important", "essential", "central"));
        ArrayList<String> result = sut.getAllWords();

        Assert.assertEquals(expected, result);
        Assert.assertEquals(5, result.size());
    }

    @Test
    public void testGetSynonymsThesaurusHashMap() {
        ThesaurusHashMap sut = new ThesaurusHashMap();

        ArrayList<String> expected = new ArrayList<>(Arrays.asList("happy", "content"));
        sut.addSynonyms(expected);

        ArrayList result = sut.getSynonyms("happy");
        Assert.assertEquals(expected, result);
    }
    @Test
    public void testGetAllWordsThesaurusHashMap() {
        ThesaurusArrayList sut = new ThesaurusArrayList();
        ArrayList<String> syn1 = new ArrayList<>(Arrays.asList("happy", "content"));
        ArrayList<String> syn2 = new ArrayList<>(Arrays.asList("important", "essential", "central"));
        sut.addSynonyms(syn1);
        sut.addSynonyms(syn2);

        ArrayList<String> expected = new ArrayList<>(Arrays.asList("happy", "content", "important", "essential", "central"));
        ArrayList<String> result = sut.getAllWords();

        Assert.assertEquals(expected, result);
    }
}