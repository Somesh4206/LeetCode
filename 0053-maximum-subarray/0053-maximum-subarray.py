class Solution(object):
    def maxSubArray(self, nums):
        curr=nums[0]
        maxx=nums[0]
        for i in range(1,len(nums)):
            curr=max(nums[i],curr+nums[i])
            maxx=max(maxx,curr)
        return maxx
        