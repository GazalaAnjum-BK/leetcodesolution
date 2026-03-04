class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        stack=[]
        d={}
        result=[]
        for num in nums2:
            while stack and num>stack[-1]:
                smaller=stack.pop()
                d[smaller]=num
            stack.append(num)
        while stack:
            element=stack.pop()
            d[element]=-1
        for num in nums1:
            result.append(d[num])
        return result