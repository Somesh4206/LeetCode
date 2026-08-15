class Solution(object):
    def longestSubsequence(self, nums):
        tot = nz = 0

        for n in nums:
            nz |= n > 0
            tot ^= n

        return nz * (len(nums) - (not tot))