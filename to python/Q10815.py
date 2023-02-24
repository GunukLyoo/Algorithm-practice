import sys

if __name__ == "__main__":

    n = int(sys.stdin.readline())
    arr = list(map(int, sys.stdin.readline().split()))
    m = int(sys.stdin.readline())
    arr1 = list(map(int, sys.stdin.readline().split()))

    for i in range(m):
        if arr.count(arr1[i])==0:
            print("0", end=' ')
        else:
            print("1", end=' ')
    
    
