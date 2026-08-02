class Solution(object):
    def compress(self, chars):
        res = []
        i = 0

        while i < len(chars):
            ch = chars[i]
            count = 0

            while i < len(chars) and chars[i] == ch:
                count += 1
                i += 1

            res.append(ch)

            if count > 1:
                for x in str(count):
                    res.append(x)

        chars[:] = res
        return len(res)