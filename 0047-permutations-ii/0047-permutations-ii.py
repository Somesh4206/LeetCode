from itertools import permutations
class Solution(object):
    def permuteUnique(self, nums):
        res=permutations(nums)
        res=set(res)
        ans=[list(p)for p in res]
        return ans     