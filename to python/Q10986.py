import sys
    
if __name__ == "__main__":
    n, m = map(int, sys.stdin.readline().split())
    arr = list(map(int, sys.stdin.readline().split()))
    c = 0

    for i in range(n):
        sum = 0
        for j in range(i, n):
            sum += arr[j]
            if sum%m == 0:
                c += 1

    print(c)
