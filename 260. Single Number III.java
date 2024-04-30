class Solution {
    public int[] singleNumber(int[] nums) {

        int[] arr=new int[2];

        HashMap<Integer, Integer> mpp= new HashMap<>();
       
        for(int i=0;i<nums.length;i++){
            if(mpp.containsKey(nums[i])){
                mpp.put(nums[i],mpp.get(nums[i])+1);

            }
            else{
                mpp.put(nums[i],1);
            }
        }

        int idx=0;
        for(Map.Entry<Integer, Integer> entry:mpp.entrySet()){
            if(entry.getValue()==1){

             arr[idx++]= entry.getKey();
             if(idx==2) break;

        }
        }

    return arr;

    }
}
