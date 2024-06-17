public class LarSmallNum {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = 5;
        int x = (i > j && i > k) ? i : (j > k) ? j : k;
        int y = (i < j && i < k) ? i : (j < k) ? j : k;
        System.out.println("Largetst Number : "+x);
        System.out.println("Smallest Number : "+y);
    }
}