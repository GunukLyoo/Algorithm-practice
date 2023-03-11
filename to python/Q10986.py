import sys
from bisect import bisect_left, bisect_right
    
if __name__ == "__main__":
    n, m = map(int, sys.stdin.readline().split())
    arr = list(map(int, sys.stdin.readline().split()))
    c = 0
    arr2 = list()

    for i in range(n):
        for j in range(i)
