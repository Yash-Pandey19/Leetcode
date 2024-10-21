import java.util.HashSet;

class containsduplicate {
    public boolean containsDuplicate(int[] nums) {
        //hashset mei duplicate elements store nahi hote.
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
