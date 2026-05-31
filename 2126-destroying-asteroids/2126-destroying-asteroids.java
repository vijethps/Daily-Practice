class Solution {
    public boolean asteroidsDestroyed(int mass, int[] a) {
        Arrays.sort(a);
        boolean check = true;
        long max = mass;
        for(int i=0;i<a.length;i++){
            if(max>=a[i]){
                max+=a[i];
            }
            else{
                check = false;
                return check;
            }
        }
        return check;
    }
}