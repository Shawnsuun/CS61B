public class Sort {
    /** Sorts strings destructively. */
    public static void sort(String[] x) {
        // find the smallest item
        // move it to the front
        // selection sort the rest (using recursion?)
        sort(x, 0);
    }

    /** Sorts strings destructively starting from item start. */
    private static void sort(String[] x, int start) {
        if (start == x.length) {
            return;
        }
        int IndexSmallest = findSmallest(x, start);
        swap(x, start, IndexSmallest);
        sort(x, start + 1);
    }

    /** Returns the index of the smallest string in x. */
    public static int findSmallest(String[] x, int start) {
        int IndexSmallest = start;

        for (int i = start; i < x.length; i = i + 1) {
            int cmp = x[i].compareTo(x[IndexSmallest]);
            // from the internet, if x[i] < x[ smallestIndex], cmp will be -1.
            if (cmp < 0) {
                IndexSmallest = i;
            }
        }
        return IndexSmallest;
    }

    /** Swap x[a] with x[b] */
    public static void swap(String[] x, int a, int b) {
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

}