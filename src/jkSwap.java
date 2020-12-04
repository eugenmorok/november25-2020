public class jkSwap {

    public static void swap(int[] array, int x, int y) {
        int memo = array[x];
        array[x] = array[y];
        array[y] = memo;
    }

}
