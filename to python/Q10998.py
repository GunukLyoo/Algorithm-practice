import sys
import math

if __name__ == "__main__":
    a = list(map(int, sys.stdin.readline().split()))
    print(math.prod(a))
