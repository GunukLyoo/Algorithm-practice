import sys

if __name__ == "__main__":
    n = int(sys.stdin.readline())
    sum = 0

    for i in range(1,n+1):
        sum = sum + i

    print(sum)
