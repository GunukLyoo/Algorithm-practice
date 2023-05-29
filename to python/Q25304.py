import sys

if __name__ == "__main__":
    sum = int(sys.stdin.readline())
    n = int(sys.stdin.readline())

    for i in range(0,n):
        a, b = map(int, sys.stdin.readline().split())
        sum = sum - (a * b)

    if sum == 0:
        print("Yes")
    else:
        print("No")
