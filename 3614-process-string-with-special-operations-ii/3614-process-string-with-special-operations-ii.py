class Solution(object):
    def processStr(self, s, k):
        length = 0

        for c in s:
            if c.isalpha():
                length += 1
            elif c == '#':
                length *= 2
            elif c == '*':
                length = max(0, length-1)

        if k >= length:
            return "."

        for c in reversed(s):
            if c.isalpha():
                if k == length-1:
                    return c
                length -= 1

            elif c == '*':
                length += 1

            elif c == '#':
                length //= 2
                if k >= length:
                    k -= length

            elif c == '%':
                k = length - 1 - k

        return "."