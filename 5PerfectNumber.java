public class Solution {
    public boolean checkPerfectNumber(int num) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                lst.add(i);
            }
        }
        int sum = 0;
        for (int i : lst) {
            sum += i;
        }
        return sum == num;
    }
}
