class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int temp = n;
            int mul = 1;
            while(temp > 0){
                int dig = temp%10;
                mul *= dig;
                temp = temp/10;
            }
            if(mul%t==0){
                return n;
            }
            else{
                n++;
            }
            
        }
    }
}