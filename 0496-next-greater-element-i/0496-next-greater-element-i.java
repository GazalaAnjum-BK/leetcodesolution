class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums2){
            while(!stack.isEmpty() && num>stack.peek()){
                int x=stack.pop();
                map.put(x,num);
            }
            stack.push(num);
          
            }
        
         while(!stack.isEmpty()){
              int y=  stack.pop();
                map.put(y,-1);
                } 
                int [] result=new int[nums1.length];
                for(int i=0;i<nums1.length;i++){
           
             result[i]=map.get(nums1[i]);
            
        }
        return result;
    }
}