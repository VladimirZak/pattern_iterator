import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    protected int min, max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int min = getMin();
            int max = getMax();

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int diff = max - min;
                int i = random.nextInt(diff + 1);
                i += min;
                return i;
            }
        };
    }

}
