import sys

if __name__ == "__main__":
    n = int(sys.stdin.readline())

    for i in range(0,n):
        a, b = map(int, sys.stdin.readline().split())
        print("Case #" + str(i+1) + ": " + str(a + b) )
