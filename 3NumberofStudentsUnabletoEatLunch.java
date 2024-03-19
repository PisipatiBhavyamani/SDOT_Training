import java.util.*;

class Solution {
    public int count(int[] students, int[] sandwich) {
        Map<Integer, Integer> map = new HashMap<>();
        int m = 0;
        for(int i : students) map.put(i, map.getOrDefault(i,0) + 1);

        while( m < sandwich.length){
            int val = sandwich[m];
            if(map.containsKey(val) && map.get(val)!=0){
                map.put(val, map.getOrDefault(val,0) - 1);
                m++;
            }
            else break;
        }
        return sandwich.length - m;
    }
}
