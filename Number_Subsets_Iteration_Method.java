import java.util.ArrayList;
import java.util.List;

public class Number_Subsets_Iteration_Method {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        List <List<Integer>> ans = subset(arr);
        for (List<Integer> list : ans) { 

        System.out.println(list);

        }
        
    }

    static List<List<Integer>> subset (int [] arr) {
        // We'll use an integer list here and will put array of integers here
        List <List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        // Adding a blank list in this list of lists

        for (int num: arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                // This will get us the outer list's index elements in correspondance to the loop value i
                internal.add(num);
                // adding that many integers in the internal list depending on the size of the outer list
                outer.add(internal);
                // Adding all internal lists in total to make the outer list
            }

        }
        return outer;
    }
}