class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
       int ans[]  = new int [n];
       if(k==0){
        return ans;
       }
       if(k>0){
        int count = 0;
        while(count<n){
            int sum =0;
           for(int j=count+1;j<=count+k;j++){
              sum+=code[j%n];
           }
           ans[count] = sum;
           count++;
        }
       }
       else{
        int count = 0;
        while(count<n){
            int sum = 0;
            for(int i=count-1;i>=count+k;i--){
                sum+= code[(i%n+n)%n];
            }
            ans[count] = sum;
            count++;
        }
       }
       return ans;  
    }
}