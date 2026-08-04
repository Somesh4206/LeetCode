class Solution(object):
    def subsetsWithDup(self, nums):
        nums.sort()
        res=[[]]
        prev=0
        for j,k in enumerate(nums):
            
            st=prev if j and nums[j]==nums[j-1] else 0
            prev=len(res)
            res+=[i+[k] for i in res[st:]]
            
        return res