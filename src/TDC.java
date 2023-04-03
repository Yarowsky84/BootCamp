public class TDC {
    public static void main(String[] args) {
        int res = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i != j && i != k && j != k) { // check for duplicates
                        res++;
                        System.out.println("" + i + " " + j + " " + k);
                    }
                }
            }
        }
        System.out.println("There are " + res + " unique three-digit codes.");
    }
}