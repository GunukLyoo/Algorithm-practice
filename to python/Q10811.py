import sys

def revers(data, left, right):
    leng = right - left
    temp = 0
    c = 0

    for i in range(left-1, left + int(leng/2)):
        temp = data[i]
        data[i] = data[right-1-c]
        data[right-1-c] = temp
        c += 1


if __name__ == '__main__':
    n, m = map(int, sys.stdin.readline().split())

    arr = [i+1 for i in range(n)]

    for i in range(m):
        arr1 = list(map(int, sys.stdin.readline().split()))
        revers(arr, arr1[0], arr1[1])
        
    for i in range(n):
        print(arr[i], end = ' ')
