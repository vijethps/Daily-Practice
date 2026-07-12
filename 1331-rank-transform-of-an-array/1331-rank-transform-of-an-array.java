class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0){
            return new int[0];
        }
        int  dummy[] = new int [arr.length];
        for(int i=0;i<arr.length;i++){
            dummy[i] = arr[i];
        }
        Arrays.sort(dummy);
         HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int i = 0; i < dummy.length; i++) {
            if (!map.containsKey(dummy[i])) {
                map.put(dummy[i], rank);
                rank++;
            }
        }
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}