import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicate_Subsets_Iterative {
    public static void main(String[] args) {
        int [] array = {1,2,2};
        List<List<Integer>> ans = subset_duplicates(array);
        for(List<Integer> list: ans) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> subset_duplicates (int [] arr) {
        Arrays.sort(arr);
        // Internal Sorting
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i = 0; i < arr.length; i++) {
            start = 0;
            // Normal case
            // If current and previous elements are same i.e. duplicates case then, start = end + 1
            if (i > 0 && arr[i] == arr[i - 1]) {
                // we did i > 0 to prevent Array index out of bounds error
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for(int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
            
        }

        return outer;
    }
    
}
