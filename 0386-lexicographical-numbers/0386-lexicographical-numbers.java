class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        Integer arr[] = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }
        Arrays.sort(arr,(a,b)->String.valueOf(a).compareTo(String.valueOf(b)));
        for(int i=0;i<n;i++){
            list.add(arr[i]);
        }
        return list;
    }
}