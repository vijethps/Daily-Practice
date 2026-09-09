class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
       Queue<Integer> q = new LinkedList<>();
       int count = 0;
       for(int i=0;i<students.length;i++){
        q.add(students[i]);
       }   
       int j=0;
       while(!q.isEmpty() && j<sandwiches.length){
        int size = q.size();
        boolean check = false;
        for(int i=0;i<size;i++){
            int stu = q.poll();
        if(sandwiches[j]==stu){
            count++;
            j++;
            check = true;
        }
        else{
            q.add(stu);
        }
        }
       if(!check){
        break;
       }
       }
       return students.length-count;
    }
}