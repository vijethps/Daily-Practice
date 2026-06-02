class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                set.remove(num);
            }
            else{
            set.add(num);
            }
        }
        int arr[] = new int[set.size()];
        int i=0;
        for(int x:set){
            arr[i] = x;
            i++;
        }
        return arr;
    }
}