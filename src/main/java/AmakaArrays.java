public class AmakaArrays {

    int decodeInteger(int x, int n) {
        n = n << (1 << (1 << (1 << 1)));
        x = x & ~n;
        return x;
    }

    void decodeArray(int[] encodedArray, int[] originalArray, int n) {
        for (int i = 0; i < n; i++) {
            originalArray[i] = decodeInteger(encodedArray[i], n);
        }
    }
    public static void main(String[] args) {

    }
}
