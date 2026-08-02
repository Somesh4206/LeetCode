class Solution(object):
    def compress(self, chars):
        freq={}
        for i in chars:
            freq[i]=freq.get(i,0)+1
        res=[]
        for k,v in freq.items():
            res.append(k)
            res.append(v)
        return len(res)