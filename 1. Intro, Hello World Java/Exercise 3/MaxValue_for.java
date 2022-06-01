public class MaxValue_for {
    /** Returns the maximum value from m using a for loop. */
    public static int forMax(int[] m) {
        int mv = m[0];
        for (int i = 1; i < m.length; i += 1) {
            if (m[i] > mv) {
                mv = m[i];
            }
        }
        return mv;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
       System.out.println(forMax(numbers));      
    }
}
