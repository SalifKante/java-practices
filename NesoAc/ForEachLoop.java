public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 2,0 };

        int occ = 0;
        for (int a : arr) {
            System.out.println(a + " " + occ);
            occ++;
        }
    }
}
