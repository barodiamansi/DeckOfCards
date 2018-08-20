/**
 * @author Mansi B
 * Shuffles elements in random order in the list provided.
 */
package CardUtilities;

import java.util.List;
import java.util.Random;

public class Shuffler {

    Random randomNumberGenerator;

    /**
     * Constructor with your own random number source.
     *
     * @param randomNumberGenerator a random number source.
     */
    public Shuffler(Random randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    /**
     * Default constructor.
     */
    public Shuffler() {
        this(new Random());
    }

    /**
     * Shuffle elements within the provided list.
     *
     * @param listToShuffle The list of cards to shuffle. Will be modified during the operation.
     */
    public <Card> void shuffle(List<Card> listToShuffle) {
        if (listToShuffle == null || listToShuffle.size() == 0) {
            throw new NullPointerException("listToShuffle cannot be null or empty.");
        }

        // Generates a random index and then swaps the current element with the element at random index.
        for (int i = listToShuffle.size() - 1; i > 1; i--) {
            int randomIndex = randomNumberGenerator.nextInt(i + 1);

            Card temp = listToShuffle.get(i);
            listToShuffle.set(i, listToShuffle.get(randomIndex));
            listToShuffle.set(randomIndex, temp);
        }
    }
}