class Solution {
    public int[] twoSum(int[] nums, int target) {
     
      for(int i = 0 ; i < nums.length ; i++){
      for(int j = i+1 ; j <nums.length ; j++){
        if(target == nums[i] + nums[j]){
            return new int[]{i,j};
        }
      }
      }
       return new int[]{};
     
    //  Map<Integer, Integer> map = new HashMap<>();

    //  for(int i = 0 ; i < nums.length ; i++){
    //      int select = nums[i];
    //      int remain = target-select;

    //      if(map.find(remain) )
    //  }
     
     
       
    }
}