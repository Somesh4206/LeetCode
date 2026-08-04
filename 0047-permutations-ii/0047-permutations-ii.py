
from itertools import permutations
class Solution(object):
    def permuteUnique(self, nums):
        res=set(permutations(nums))
        ans=[list(p)for p in res]
        return ans     