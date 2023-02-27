import sys

if __name__ == "__main__":

    n = int(sys.stdin.readline())
    arr = list(map(int, sys.stdin.readline().split()))
    m = int(sys.stdin.readline())
    arr1 = list(map(int, sys.stdin.readline().split()))

    arr.sort()

    for i in range(m):
        if arr1[i] in arr:
            print("1", end=' ')
        else:
            print("0", end=' ')
    
    
