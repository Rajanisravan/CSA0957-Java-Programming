import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniquePermutations {

    private int number;

    public UniquePermutations(int number) {
        this.number = number;
    }

    private Set<String> getUniquePermutations(String str) {
        Set<String> uniquePerms = new HashSet<>();
        permute(str, 0, str.length() - 1, uniquePerms);
        return uniquePerms;
    }

    private void permute(String str, int left, int right, Set<String> uniquePerms) {
        if (left == right) {
            uniquePerms.add(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permute(str, left + 1, right, uniquePerms);
                str = swap(str, left, i); // backtrack
            }
        }
    }

    private String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public void printUniquePermutations() {
        String numStr = String.valueOf(this.number);
        Set<String> uniquePermutations = getUniquePermutations(numStr);
        int[] result = uniquePermutations.stream().mapToInt(Integer::parseInt).toArray();
        Arrays.sort(result);
        for (int perm : result) {
            System.out.println(perm);
        }
    }

    public static void main(String[] args) {
        int number = 143;
        UniquePermutations perm = new UniquePermutations(number);
        perm.printUniquePermutations();
    }
}
