class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        int i=0,j=arr.length-1,sum=0;

        ArrayList<Integer> al = new ArrayList<>();
        
        while(i<j){
            sum=arr[i]+arr[j];
            if(sum>target){
                j--;
            }else if(sum<target){
                i++;
            }
            else if(sum == target){
                al.add(i+1);
                al.add(j+1);
                return al;
            }
            
        }
        al.add(-1);
        al.add(-1);
        return al;
        
    }
}