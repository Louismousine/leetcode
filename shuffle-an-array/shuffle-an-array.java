class Solution {

    private int[] nums;
    private int[] shuffledNums;
    private int length;
    private HashMap<Integer, Boolean> map = new HashMap<>();
    public Solution(int[] nums) {
        this.nums = nums;
        this.length = nums.length;
        this.shuffledNums = new int[length];
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        this.shuffledNums = Arrays.copyOf(nums, length);
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        init();
        Random r = new Random();
        List<Integer> keysAsArray;
        for(Integer i: nums){
            keysAsArray = new ArrayList<Integer>(map.keySet());
            int ind = keysAsArray.get(r.nextInt(keysAsArray.size()));
            shuffledNums[ind] = i;
            map.remove(ind);
        }
        return shuffledNums;

    }
    
    private void init(){
        for(int i = 0; i < length; i++){
            map.put(i,true);
        }
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */