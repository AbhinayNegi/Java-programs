package commonQuestions;

import java.util.*;

public class FindCommonArrayElement {

    public static ArrayList<Integer> findCommonBruteForceApproach(int[] a, int[] b) {

        Arrays.sort(a);
        Arrays.sort(b);

        ArrayList<Integer> commonElements = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if(i > 0 && a[i] == a[i - 1]) {
                continue;
            }

            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]) {
                    commonElements.add(a[i]);
                    break;
                }
            }


        }
        return commonElements;
    }

    public static Set<Integer> findCommonHasSetApproach(int[] a, int[] b) {

        HashSet<Integer> set = new HashSet<>();
        LinkedHashSet<Integer> commonElements = new LinkedHashSet<>();

        for (int current : a) {
            set.add(current);
        }

        for(int current : b) {
            if(set.contains(current)) {
                commonElements.add(current);
            }
        }

        return commonElements;
    }

    public static void main(String[] args) {

        System.out.println(findCommonBruteForceApproach(new int[]{1, 2, 2, 3}, new int[]{2, 3, 4}));
        System.out.println(findCommonHasSetApproach(new int[]{1, 2, 2, 3}, new int[]{2, 3, 4}));
    }
}
