import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> n_length_combo(List<Integer> lst, int n) {
        List<List<Integer>> result = new ArrayList<>();
        if (n == 0) {
            result.add(new ArrayList<>());
            return result;
        }

        for (int i = 0; i < lst.size(); i++) {
            int m = lst.get(i);
            List<Integer> remLst = new ArrayList<>(lst.subList(i + 1, lst.size()));

            List<List<Integer>> remainlst_combo = n_length_combo(remLst, n - 1);
            for (List<Integer> p : remainlst_combo) {
                List<Integer> temp = new ArrayList<>();
                temp.add(m);
                temp.addAll(p);
                result.add(temp);
            }
        }
        return result;
    }

    public int maximumProduct(List<Integer> nums) {
        if (nums.size() < 3) {
            return 0;
        }

        List<List<Integer>> mlst = n_length_combo(nums, 3);
        int res = Integer.MIN_VALUE;  // Initialize res to negative infinity
        for (List<Integer> lstd : mlst) {
            int temp = 1;
            for (int i : lstd) {
                temp *= i;
            }
            res = Math.max(res, temp);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        int maxProduct = solution.maximumProduct(nums);
        System.out.println("Maximum Product: " + maxProduct);
    }
}
