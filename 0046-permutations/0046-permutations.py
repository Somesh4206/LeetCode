from itertools import permutations
class Solution(object):
    def permute(self, nums):
        res=list(sorted(permutations(nums)))
        return res