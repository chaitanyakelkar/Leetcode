class Solution:
    def romanToInt(self, s: str) -> int:
        prev = s[-1]
        map = {
            'I' : 1,
            "X" : 10,
            "V" : 5,
            "C" : 100,
            "L" : 50,
            "M" : 1000,
            "D" : 500
        }
        ans = map[prev]
        for i in s[-2::-1]:
            if map[i] < map[prev]:
                ans -= map[i]
            else:
                ans += map[i]
            prev = i
        return ans