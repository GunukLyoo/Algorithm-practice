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

    c = 2
    
    for i in range((n * 2) - 1):
        if i <= 4:
            print(arr[i])
        else:
            print(arr[5-c])
            c += 1
