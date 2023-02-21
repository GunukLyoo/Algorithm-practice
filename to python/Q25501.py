import sys

def recursion(s, l, r, count):
    if l >= r:
        print("1", end = " ")
        print(count)
        return 1
    elif s[l] != s[r]:
        print("0", end = " ")
        print(count)
        return 0
    else: return recursion(s, l+1, r-1, count + 1)

def isPalindrome(s):
    count = 0
    return recursion(s, 0, len(s)-1, count + 1)

if __name__ == "__main__":

    n = int(sys.stdin.readline())
    
    for i in range(n):
        isPalindrome(sys.stdin.readline())
