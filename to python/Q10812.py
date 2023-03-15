import sys

if __name__ == '__main__':
    n, m = map(int, sys.stdin.readline().split())
    temp = 0

    arr = [i+1 for i in range(n)]

    for i in range(m):
        b, e, mi = map(int, sys.stdin.readline().split())
        arr1 = list()
        if b > 1:
            for j in range(b-1):
                arr1.append(arr[j])
        for j in range(mi-1, e):
            arr1.append(arr[j])
        for j in range(b-1, mi-1):
            arr1.append(arr[j])
        if e < n:
            for j in range(e, n):
                arr1.append(arr[j])
        arr = arr1
        del arr1
        

    for i in range(n):
        print(arr[i], end=' ')
