/**
 * Keep track of word counts and word pairs.
 *
 */
public class WordAnalyser
{    
    /**
     * Constructor for objects of class WordAnalyser
     */
    public WordAnalyser()
    {
    }
    
    /**
     * Add a word to the analyser.
     * @param word the word to be added.
     */
    public void addWord(String word)
    {
    }
    
    /**
     * Get the number of times the given word has been seen.
     * @param word The word to be looked up.
     * @return The number of times the word has been seen.
     */
    public int getCount(String word)
    {
        return 0;
    }
    
    /**
     * Return true if firstWord has been immediately
     * followed by secondWord; false otherwise.
     * @param firstWord
     * @param secondWord
     */
    public boolean followedBy(String firstWord, String secondWord)
    {
        return false;
    }
    
    /**
     * Get the number of times the given word has been seen,
     * regardless of the case of its occurrences.
     * @param word The word to be looked up.
     * @return The number of times the word has been seen.
     */
    public int getCaseInsensitiveCount(String word)
    {
        return 0;
    }
}
