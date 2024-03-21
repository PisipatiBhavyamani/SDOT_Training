class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int units = 0;

        //calculating LeftMax
        int[] maxL = new int[n];
        int max = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, height[i]);
            maxL[i] = max;
        }

        //calculating RightMax
        int[] maxR = new int[n];
        max = 0;
        for(int i = n - 1; i >= 0; i--){
            max = Math.max(max, height[i]);
            maxR[i] = max;
        }

        for(int i = 0; i < n ; i++){
            int min = Math.min(maxL[i], maxR[i]);
            units += min - height[i];
        }
        return units;
    }
}
