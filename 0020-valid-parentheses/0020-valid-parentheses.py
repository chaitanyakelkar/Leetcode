class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        valid = True
        for i in s:
            if i in "({[":
                stack.append(i)
            elif i in ")}]":
                if len(stack) == 0:
                    valid = False
                elif i == ")" and len(stack) != 0 and stack.pop() != '(':
                    valid = False
                elif i == "}" and len(stack) != 0 and stack.pop() != '{':
                    valid = False
                elif i == "]" and len(stack) != 0 and stack.pop() != '[':
                    valid = False
        if len(stack) != 0:
            valid = False
        return valid