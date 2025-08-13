class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> difmap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if (difmap.get(nums[i]) != null && difmap.get(nums[i]) != i){
                return new int[]{i,difmap.get(nums[i])};
            }
            difmap.put(target-nums[i],i);
        }
        return new int[]{-1,-1};
    }
}