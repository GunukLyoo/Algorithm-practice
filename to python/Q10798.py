import sys

if __name__ == '__main__':
    arr = list()
    str1 = ''

    for i in range(5):
        arr.append(sys.stdin.readline().strip())

    for i in range(15):
        for j in range(5):
            if len(arr[j]) > i:
                str1 += arr[j][i]

    print(str1)
