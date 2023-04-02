import sys

if __name__ == '__main__':
    n, k= map(int, sys.stdin.readline().split())

    u = 1

    for i in range(1, n+1):
        u *= i

    d = 1

    for i in range(1, n-k+1):
        d *= i

    for i in range(1, k + 1):
        d *= i

    print(int(u/d))
