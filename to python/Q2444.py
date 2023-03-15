import sys

if __name__ == '__main__':
    n = int(sys.stdin.readline())
    arr = list()

    for i in range(n):
        str1 = ''
        for j in range(n-(i+1)):
            str1 += ' '

        for j in range(1 + (i*2)):
            str1 += '*'

        arr.append(str1)

    for i in range(n):
        print(arr[i])

    for i in range(1,n):
        print(arr[n-i-1])
