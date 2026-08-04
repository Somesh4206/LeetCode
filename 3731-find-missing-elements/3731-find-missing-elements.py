class Solution(object):
    def findMissingElements(self, nums):
        mn=min(nums)
        mx=max(nums)
        res=[]
        for i in range(mn,mx):
            if i not in nums:
                res.append(i)
        return res
        