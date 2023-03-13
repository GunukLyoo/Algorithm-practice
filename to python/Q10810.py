import sys

if __name__ == '__main__':
    n, m = map(int, sys.stdin.readline().split())

    arr = [0 for i in range(n)]

    for i in range(m):
           arr1 = list(map(int, sys.stdin.readline().split()))
           for j in range(arr1[0]-1, arr1[1]):
               arr[j] = arr1[2]

    for i in range(n):
        print(arr[i], end=' ')
