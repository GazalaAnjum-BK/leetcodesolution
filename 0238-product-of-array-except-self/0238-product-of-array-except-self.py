class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        right=1
        result=[1]*len(nums)
        running_prdct=1
        for i,num in enumerate(nums):
           result[i]=running_prdct
           running_prdct=running_prdct*num
        for i in range(len(nums)-1,-1,-1):
           result[i]=result[i]*right
           right=right*nums[i]
        return result

        