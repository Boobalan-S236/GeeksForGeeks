class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        
        int i=0,j=0;
        ArrayList<Integer> al = new ArrayList<>();
        
        while(i<a.length && j<b.length){
            
            if(a[i] == b[j]){
                
                if(al.isEmpty() || a[i] != al.get(al.size()-1)){
                    al.add(a[i]);
                }
                
                i++;j++;
            }
            else if(a[i]<b[j]){
                i++;    
            }
            else j++;
            
        }
        return al;
        
    }
}