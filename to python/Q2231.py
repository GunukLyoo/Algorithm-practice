import sys
import math

if __name__ == '__main__':
    n = int(sys.stdin.readline())
    m = n - (len(str(n))*9)

    while True:
        arr = list(map(int, str(m)))
        total = m
        for i in range(len(arr)):
            total += arr[i]

        if total == n:
            print(m)
            break
        else:
            m += 1
