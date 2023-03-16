import sys

if __name__ == '__main__':
    n, k = map(int, sys.stdin.readline().split())
    c = 0
    x = 0

    for i in range(1, n+1):
        if n % i == 0:
            c += 1
            x = i
            if c == k:
                break

    if c != k:
        print(0)
    else:
        print(x)
