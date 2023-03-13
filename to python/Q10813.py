import sys

if __name__ == '__main__':
    n, m = map(int, sys.stdin.readline().split())

    arr = [i+1 for i in range(n)]

    for i in range(m):
           arr1 = list(map(int, sys.stdin.readline().split()))
           arr1[0] -= 1
           arr1[1] -= 1
           x = arr[arr1[0]]
           arr[arr1[0]] = arr[arr1[1]]
           arr[arr1[1]] = x

    for i in range(n):
        print(arr[i], end=' ')
