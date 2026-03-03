class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        n=len(temperatures)
        res=[0]*n
        stack=[]
        for num in range(n):
            while stack and temperatures[num]>temperatures[stack[-1]]:
               prev_index= stack.pop()
               res[prev_index]=num-prev_index
            stack.append(num)
        return res