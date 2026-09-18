class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> a=new HashSet<>();
        for(int arr:nums){
            a.add(arr);
        }
        if(a.size()==nums.length){
            return false;
        }   
        return true;     
    }
}