class Solution(object):
    def subsets(self, nums):
        res=[[]]
        for i in nums:
            res+=[k+[i] for k in res]
        return res
        