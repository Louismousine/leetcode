class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        int index = 0;
        int[] answer = new int[2];
        for(Integer num: nums){
            Integer mappedNum = hm.get(target - num);
            if(mappedNum != null){
                answer[0] = mappedNum;
                answer[1] = index;
                break;
            }
            hm.put(num,index++);
        }
        
        return answer;
    }
}