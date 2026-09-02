class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int nums2[] = new int[n];
        for(int i=0;i<n-1;i++){
            nums2[i] = Math.abs(nums1[i]-nums1[i+1]); 
        }
        nums2[n-1] = nums1[n-1];
        int count = 0;
        for(int i=0;i<n;i++){
            if(nums2[i]%2==0){
                count++;
            }
        }
        
        return true;
    }
}